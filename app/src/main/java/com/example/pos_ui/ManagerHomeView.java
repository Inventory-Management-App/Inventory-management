package com.example.pos_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManagerHomeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_home_view);

        Button btnToStocks = (Button) findViewById(R.id.toStocks);
        Button btnToDailySales = (Button) findViewById(R.id.daily_sales_btn);
        Button btnCashierHome = (Button) findViewById(R.id.cashier_home_btn);

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

        btnCashierHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnCashierHome = new Intent(ManagerHomeView.this,CashierHomePage.class);
                startActivity(btnCashierHome);
            }
        });
    }
}