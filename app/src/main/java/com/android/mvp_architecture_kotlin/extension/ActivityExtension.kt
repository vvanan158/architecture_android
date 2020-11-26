package com.android.mvp_architecture_kotlin.extension

import android.content.Intent
import android.net.Uri
import androidx.annotation.IdRes
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.startActivity(
    @NonNull intent: Intent,
    flags: Int? = null
) {
    flags.notNull {
        intent.flags = it
    }
    startActivity(intent)
}

fun AppCompatActivity.startActivityForResult(
    @NonNull intent: Intent,
    requestCode: Int, flags: Int? = null
) {
    flags.notNull {
        intent.flags = it
    }
    startActivityForResult(intent, requestCode)
}

fun AppCompatActivity.replaceFragment(
    @IdRes containerId: Int, fragment: Fragment,
    addToBackStack: Boolean = false, tag: String = fragment::class.java.simpleName
) {
    val transaction = supportFragmentManager.beginTransaction()
    if (addToBackStack) {
        transaction.addToBackStack(tag)
    }
    transaction.replace(containerId, fragment, tag)
    transaction.commitAllowingStateLoss()
    supportFragmentManager.executePendingTransactions()
}

fun AppCompatActivity.goBackFragment(): Boolean {
    val isShowPreviousPage = supportFragmentManager.backStackEntryCount > 0
    if (isShowPreviousPage) {
        supportFragmentManager.popBackStackImmediate()
    }
    return isShowPreviousPage
}

fun AppCompatActivity.openUrl(url: String) {
    if (url.isBlank()) {
        return
    }
    val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(url))
    startActivity(intent)
}
