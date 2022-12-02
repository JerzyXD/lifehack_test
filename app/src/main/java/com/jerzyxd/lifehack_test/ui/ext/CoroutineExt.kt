package com.jerzyxd.lifehack_test.ui.ext

import kotlinx.coroutines.CoroutineExceptionHandler

fun createHandler(block: (Throwable)->Unit) = CoroutineExceptionHandler { _, throwable ->
    throwable.printStackTrace()
    block(throwable)
}

fun createEmptyHandler() = CoroutineExceptionHandler { _, throwable -> throwable.printStackTrace() }