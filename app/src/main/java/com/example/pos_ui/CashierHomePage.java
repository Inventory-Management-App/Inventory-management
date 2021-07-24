package com.example.pos_ui;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CashierHomePage extends AppCompatActivity
{
    Button cTaskBtn, cCashBalanceBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashier_home_page);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // Initialize
        cTaskBtn = findViewById(R.id.cashier_btn);
        cCashBalanceBtn = findViewById(R.id.cashBalance_btn);

        //
        cTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
//                startActivity(new Intent(CashierHomePage.this, CashierTaskActivity.class));
            }
        });

        cCashBalanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(CashierHomePage.this, CashierBalanceReport.class));
            }
        });
    }
}