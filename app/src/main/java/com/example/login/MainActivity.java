package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(switchActivitiesTest());
    }

    private View.OnClickListener switchActivitiesTest() {
        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent switchActivityIntent = new Intent(MainActivity.this, NavigationPage.class);
                startActivity(switchActivityIntent);
            }
        };

        return onClickListener;
    }

}