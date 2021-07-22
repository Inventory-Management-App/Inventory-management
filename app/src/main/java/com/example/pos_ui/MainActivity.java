package com.example.pos_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Add to manifest
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button btn = (Button) findViewById(R.id.buttonSignIn);

        btn.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this,LoginView.class);
            startActivity(i);
        });
    }
}