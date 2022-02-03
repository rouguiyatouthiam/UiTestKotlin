package com.example.uitestkotlin

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest
{
    //this variable will global for all fun that we will create
    @get:
    Rule
    var activityScenarioRule = activityScenarioRule<SecondActivity>()

    @Test
    fun checkActivity ()
    {
        onView(withId(R.id.second_activity_view))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_textView_and_button()
    {
        // textView visibility
        onView(withId(R.id.textViewSecondActivity))
            .check(matches(isDisplayed()))
        //button visibility
        onView(withId(R.id.btn))
            .check(matches(isDisplayed()))
    }

    // check if we have the right text in the second view (Second Activity)
    @Test
    fun test_visibility_textView ()
    {
        onView(withId(R.id.textViewSecondActivity))
            .check(matches(
                withText(R.string.second_activity)))
    }

}