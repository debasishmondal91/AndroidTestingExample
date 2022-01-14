package com.example.androidtestingexample

import androidx.core.text.isDigitsOnly

object RegistrationUtil {

    private val existingUsers = listOf("Debu", "Sreya", "Joy")

    /**
     * The inputs are not valid if
     * ...if username/password is blank
     * ...if password and confirm passwords are not same
     * ...if user is already an existing user
     * ...if password is contains less than 2 digit
     */
    fun validRegistrationInput(
        name: String,
        password: String,
        confPassword: String
    ): Boolean {
        if (name.isEmpty() || password.isEmpty())
            return false

        if (password != confPassword)
            return false

        if (name in existingUsers)
            return false

        if (password.count { it.isDigit() } < 2)
            return false

        return true
    }

}