package com.example.androidtestingexample

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `if username is empty`() {
        val result = RegistrationUtil.validRegistrationInput(
            "",
            "112233",
            "112233"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `if username and password is correct`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Debasish",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `if password and confirm password not same`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Debasish",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `if user is already exists`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Debu",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `if password contains less than two digit`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Debasish",
            "abdha1",
            "abdha1"
        )
        assertThat(result).isFalse()
    }
}