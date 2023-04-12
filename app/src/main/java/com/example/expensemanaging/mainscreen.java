package com.example.expensemanaging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class mainscreen extends AppCompatActivity {
    FloatingActionButton btn_add_transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        btn_add_transaction = (FloatingActionButton) findViewById(R.id.btn_add_transaction);
        btn_add_transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });

    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, AddActive.class);
        startActivity(switchActivityIntent);
    }
}
