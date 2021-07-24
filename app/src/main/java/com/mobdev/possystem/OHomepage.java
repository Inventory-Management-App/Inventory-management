package com.mobdev.possystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OHomepage extends AppCompatActivity {

    private Button cashier;
    private Button reports;
    private Button naccount;
    private Button stocks;
    private Button cashbalance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohomepage);

        cashier = findViewById(R.id.cashier);
        reports = findViewById(R.id.reports);
        naccount = findViewById(R.id.newaccount);
        stocks = findViewById(R.id.stocks);
        cashbalance = findViewById(R.id.balance);



        cashier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCashier();
            }
        });

        reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReports();
            }
        });

        naccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewAccount();
            }
        });

        stocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStocks();
            }
        });

        cashbalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCashBalanace();
            }
        });
    }



    public void openCashier(){
        Intent intent1 = new Intent(this, Activity.class);
        startActivity(intent1);
    }

    public void openCashBalanace(){
        Intent intent2 = new Intent(this, Activity.class);
        startActivity(intent2);
    }

    public void openReports(){
        Intent intent3 = new Intent(this, Activity.class);
        startActivity(intent3);
    }

    public void openNewAccount(){
        Intent intent4 = new Intent(this, Activity.class);
        startActivity(intent4);
    }

    public void openStocks(){
        Intent intent5 = new Intent(this, Activity.class);
        startActivity(intent5);
    }
}