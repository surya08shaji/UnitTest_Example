package com.example.unittestexample

import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class RegistrationUtilTest{

    @Test
    fun user(){
        val result = RegistrationUtil.validRegistrationInput(
            "Rahul",
            "123",
            "123"
        )
        assertThat(result.toString(),true)
    }


    @Test
    fun emptyUsername(){
        val result = RegistrationUtil.validRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result.toString(),false)
    }

    @Test
    fun usernameAlreadyTaken() {
        val result = RegistrationUtil.validRegistrationInput(
            "Rohan",
            "123",
            "123"
        )
        assertThat(result.toString(),false)
    }

    @Test
    fun incorrectConfirmPassword() {
        val result = RegistrationUtil.validRegistrationInput(
            "Rahul",
            "123",
            "1234"
        )
        assertThat(result.toString(),false)
    }

    @Test
    fun lessThanTwoDigitPassword() {
        val result = RegistrationUtil.validRegistrationInput(
            "Rahul",
            "abcd1",
            "abcd1"
        )
        assertThat(result.toString(),false)

    }
}