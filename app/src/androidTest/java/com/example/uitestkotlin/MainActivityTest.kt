package com.example.uitestkotlin

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest
{
    //this variable will global for all fun that we will create
    @get:
    Rule var activityScenarioRule = activityScenarioRule<MainActivity>()



    //check if mainActivity layout is display or visible to the user
    @Test
    fun checkActivityVisibility()
    {
        onView(withId(R.id.layoutMainActivity))
            .check(matches(isDisplayed()))
    }


    //check if text "Main Activity" is visible
    @Test
    fun checkingTextVisibility()
    {

        onView(withId(R.id.textViewMainActivity))
            .check(matches(isDisplayed()))

        // check if our button is visible
        onView(withId(R.id.btnMainActivity))
            .check(matches(isDisplayed()))
    }

    //check if text "Main Activity Button" is visible
    @Test
    fun checkingButtonVisibility()
    {
        onView(withId(R.id.btnMainActivity))
            .check(matches(isDisplayed()))
    }

    //check if text our view is the right one
    @Test
    fun testTextIsMainActivity()
    {
        onView(withId(R.id.textViewMainActivity))
            .check(matches(isDisplayed()))
    }

    //testing click in button (Main Activity) and after click we navigate in second page
    // and verify if our view display (second view)
    @Test
    fun navigateTo2Activity()
    {
        onView(withId(R.id.btnMainActivity))
            .perform(click())
            //check if we are in the right view
        onView(withId(R.id.textViewSecondActivity))
            .check(matches(withText(R.string.second_activity)))
    }

    //Testing backpress to mainActivity
    @Test
    fun backPressToMainActivity()
    {
        onView(withId(R.id.btnMainActivity))
            .perform(click())

        onView(withId(R.id.second_activity_view))
            .check(matches(isDisplayed()))


        //check press back when user is in the second activity
        Espresso.pressBack()

        // verifiy if main activity is displayed

        onView(withId(R.id.layoutMainActivity))
            .check(matches(isDisplayed()))
    }

}