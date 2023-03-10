package com.github.nicoslz.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.test.espresso.intent.Intents;

import org.junit.Test;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
    }

    @Test
    public void goToGreetingActivity() {
        onView(withId(R.id.mainButton)).perform(click());

        Intents.init();
        Intents.intended(hasComponent(GreetingActivity.class.getName()));
        Intents.release();
    }
}
