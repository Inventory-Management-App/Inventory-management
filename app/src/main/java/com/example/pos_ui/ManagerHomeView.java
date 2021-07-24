package com.example.pos_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManagerHomeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_home_view);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button btnToStocks = (Button) findViewById(R.id.toStocks);
        Button btnToDailySales = (Button) findViewById(R.id.daily_sales_btn);
       // Button btnCashierHome = (Button) findViewById(R.id.cashier_home_btn);
        Button btnCashierBalance = (Button) findViewById(R.id.toCashBalance);
        Button btnCreateCasierView = (Button) findViewById(R.id.toCreateNewAC);
        Button btnCashBalanceReport = (Button) findViewById(R.id.toCashBalance);

        btnToStocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toStockMange = new Intent(ManagerHomeView.this,StocksView.class);
                startActivity(toStockMange);
            }
        });

        btnToDailySales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnToDailySales = new Intent(ManagerHomeView.this,DailySalesReportActivity.class);
                startActivity(btnToDailySales);
            }
        });

        btnCreateCasierView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCashierHome = new Intent(ManagerHomeView.this,CreateCashierView.class);
                startActivity(btnCashierHome);
            }
        });

        btnCashBalanceReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCashBalance = new Intent(ManagerHomeView.this,CashierBalanceReport.class);
                startActivity(btnCashBalance);
            }
        });
    }
}