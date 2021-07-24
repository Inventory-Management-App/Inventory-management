package com.example.pos_ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginView extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;

    private String userName = "";
    private String userPassword = "";

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
        Button eLogin = (Button) findViewById(R.id.buttonSignIn);


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
