package com.example.expensemanaging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainscreenActivity extends AppCompatActivity {
    FloatingActionButton btn_add_transaction;
    ImageButton btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        btn_add_transaction = (FloatingActionButton) findViewById(R.id.btn_add_transaction);
        btn_home = findViewById(R.id.btn_home);
        btn_add_transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchHomeActivities();
            }
        });

    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, AddActive.class);
        startActivity(switchActivityIntent);
    }

    private void switchHomeActivities() {
        Intent switchActivityIntent = new Intent(this, MainscreenActivity.class);
        startActivity(switchActivityIntent);
    }
}
