package com.example.expensemanaging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LogInActivity extends AppCompatActivity{

    ImageButton btn_log_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btn_log_in = findViewById(R.id.btn_log_in);
        btn_log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {switchActivities();}
        });

    }
    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, MainscreenActivity.class);
        startActivity(switchActivityIntent);
    }
}
