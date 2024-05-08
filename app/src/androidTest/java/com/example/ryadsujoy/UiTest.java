package com.example.ryadsujoy;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class UiTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testShapeInsert(){
        Espresso.onView(ViewMatchers.withId(R.id.ShapeEditText))
                .perform(ViewActions.typeText("Circle"));
        Espresso.onView(ViewMatchers.withId(R.id.ColorEditText))
                .perform(ViewActions.typeText("Red"));

        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.ShapeTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The shape is Circle\nArea is 78.5\nPerimeter is 31.4\n")));

        Espresso.onView(ViewMatchers.withId(R.id.ColorTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The color is Red\n")));
    }

    @Test
    public void testShapeInsert2(){
        Espresso.onView(ViewMatchers.withId(R.id.ShapeEditText))
                .perform(ViewActions.typeText("Square"));
        Espresso.onView(ViewMatchers.withId(R.id.ColorEditText))
                .perform(ViewActions.typeText("Green"));

        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.ShapeTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The shape is Square\nArea is 25.0\nPerimeter is 20.0\n")));

        Espresso.onView(ViewMatchers.withId(R.id.ColorTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The color is Green\n")));
    }

    @Test
    public void testShapeInsert3(){
        Espresso.onView(ViewMatchers.withId(R.id.ShapeEditText))
                .perform(ViewActions.typeText("Triangle"));
        Espresso.onView(ViewMatchers.withId(R.id.ColorEditText))
                .perform(ViewActions.typeText("Blue"));

        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.ShapeTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The shape is Triangle\nArea is 6.0\nPerimeter is 12.0\n")));

        Espresso.onView(ViewMatchers.withId(R.id.ColorTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The color is Blue\n")));
    }

}
