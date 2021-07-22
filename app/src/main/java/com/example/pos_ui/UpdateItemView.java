package com.example.pos_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UpdateItemView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_item_view);

        ImageView btnBackToStock = (ImageView)findViewById(R.id.backBtnToStocks);

        btnBackToStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(UpdateItemView.this,StocksView.class);
                startActivity(i2);
            }
        });
    }
}