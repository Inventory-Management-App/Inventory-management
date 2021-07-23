package com.example.pos_ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;




public class LoginView extends AppCompatActivity {

    EditText eName;
    EditText ePassword;
    Button eLogin;

    String userName = "";
    String userPassword = "";

    /* Class to hold credentials */
    static class Credentials
    {
        String name = "Admin";
        String password = "123456";
    }

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);

        eName = (EditText)findViewById(R.id.editTextName);
        ePassword = (EditText)findViewById(R.id.editTextTextPassword);
        eLogin = (Button) findViewById(R.id.buttonSignIn);


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userName = eName.getText().toString();
                userPassword = ePassword.getText().toString();

                if(userName.isEmpty() || userPassword.isEmpty())
                {
                    Toast.makeText(LoginView.this, "Please enter name and password!", Toast.LENGTH_LONG).show();

                }else {

                    isValid = validate(userName, userPassword);


                    if (!isValid) {
                        Toast.makeText(LoginView.this, "Incorrect credentials, please try again!", Toast.LENGTH_LONG).show();
                    }

                    else {
                        Toast.makeText(LoginView.this, "Login Successful!", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(LoginView.this, ManagerHomeView.class));
                    }

                }
            }
        });
    }

    private boolean validate(String userName, String userPassword)
    {
        Credentials credentials = new Credentials();

        if(userName.equals(credentials.name) && userPassword.equals(credentials.password))
        {
            return true;
        }

        return false;
    }
}
