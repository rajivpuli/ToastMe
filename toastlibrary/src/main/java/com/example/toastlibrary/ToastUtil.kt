package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

object ToastUtil {

    fun show(
        context : Context,
        message : String,
        lenghtLong : Boolean = false

    ) {
        Toast.makeText(
            context,
            message,
            if(lenghtLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
        ).show()
    }
}