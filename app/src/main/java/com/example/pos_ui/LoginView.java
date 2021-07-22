package com.example.pos_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);

        Button btnToManager = (Button) findViewById(R.id.toManagerHome);

         btnToManager.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent toManagerHome = new Intent(LoginView.this,ManagerHomeView.class);
               startActivity(toManagerHome);

           }
       });
    }
}