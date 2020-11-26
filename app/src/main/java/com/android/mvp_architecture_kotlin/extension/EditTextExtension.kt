package com.android.mvp_architecture_kotlin.extension

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

fun EditText.onChange(f: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
      override fun afterTextChanged(s: Editable?) {
        f(s.toString())
      }

      override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
      override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    })
}

fun EditText.moveCursorToEnd() {
    setSelection(text.length)
}
