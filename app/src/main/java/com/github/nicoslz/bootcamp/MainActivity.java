package com.github.nicoslz.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Go to GreetingActivity
    public void goToGreetingActivity(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        startActivity(intent);
    }

}