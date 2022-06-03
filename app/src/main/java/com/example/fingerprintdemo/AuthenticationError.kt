package com.example.fingerprintdemo

enum class AuthenticationError(val errorCode:Int) {

    CANCELED(13),
    AUTHENTICATION_DIALOG_ERROR(10),
    TOO_MANY_ATTEMPTS(7)
}