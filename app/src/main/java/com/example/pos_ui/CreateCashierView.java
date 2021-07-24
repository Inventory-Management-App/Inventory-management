package com.example.pos_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pos_ui.Model.RegisterCashierCredentials;

public class CreateCashierView extends AppCompatActivity {
    private EditText etName;
    private EditText etUsername;
    private EditText etPassword;
    private EditText etConfirmPassword;

    public static RegisterCashierCredentials credentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_cashier_view);

        etName            = findViewById(R.id.etName);
        etUsername        = findViewById(R.id.etUsername);
        etPassword        = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        ImageView btnBack = findViewById(R.id.back_left);
        Button btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name            = etName.getText().toString().trim();
                String username        = etUsername.getText().toString().trim();
                String password        = etPassword.getText().toString();
                String confirmPassword = etConfirmPassword.getText().toString();

                if (TextUtils.isEmpty(name)){
                    etName.setError("Name is Required");
                    return;
                }
                if (TextUtils.isEmpty(username)){
                    etUsername.setError("Username is Required");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    etPassword.setError("Password is Required ");
                    return;
                }
                if (TextUtils.isEmpty(confirmPassword)){
                    etConfirmPassword.setError("Type Password again");
                    return;
                }
                if (password.length() < 6){
                    etPassword.setError("Password  Must be >= 6 Characters");
                }

                credentials = new RegisterCashierCredentials(name, username, password, confirmPassword);
                Toast.makeText(CreateCashierView.this, "Cashier Account Created", Toast.LENGTH_SHORT).show();

//                startActivity(new Intent(CreateCashierView.this, ManagerHomeView.class));


            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreateCashierView.this, ManagerHomeView.class));
            }

        });

    }
}