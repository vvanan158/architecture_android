package com.android.mvp_architecture_kotlin.extension

import java.text.SimpleDateFormat
import java.util.*

fun Date.toString(format: String): String {
    return SimpleDateFormat(format, Locale.US).format(this)
}
