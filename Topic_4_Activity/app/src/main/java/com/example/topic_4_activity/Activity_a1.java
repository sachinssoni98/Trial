package com.example.topic_4_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_a1 extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        b= findViewById(R.id.btn1);
        b.setOnClickListener(this::launchNextActivity);
    }

    private void launchNextActivity(View view) {
        Intent intent= new Intent(Activity_a1.this, Activity_a2.class);
        startActivity(intent);
    }
}