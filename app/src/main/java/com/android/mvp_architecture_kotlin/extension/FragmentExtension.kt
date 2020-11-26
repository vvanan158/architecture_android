package com.android.mvp_architecture_kotlin.extension

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

fun Fragment.replaceFragment(
    @IdRes containerId: Int, fragment: Fragment,
    addToBackStack: Boolean = false, tag: String = fragment::class.java.simpleName
) {
    val transaction = fragmentManager?.beginTransaction()
    transaction.notNull {
        if (addToBackStack) it.addToBackStack(tag)
        it.replace(containerId, fragment, tag)
        it.commitNowAllowingStateLoss()
        fragmentManager?.executePendingTransactions()
    }
}

fun Fragment.goBackFragment(): Boolean {
    fragmentManager.notNull {
        val isShowPreviousPage = it.backStackEntryCount > 0
        if (isShowPreviousPage) {
            it.popBackStackImmediate()
        }
        return isShowPreviousPage
    }
    return false
}
