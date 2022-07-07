package com.example.topic_4_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_a2 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        btn= findViewById(R.id.btn2);
        btn.setOnClickListener(this::launchNextActivity);
    }

    private void launchNextActivity(View view) {
//        ComponentName componetName = new ComponentName(
//                "com.example.topic_4_activity2",
//                "com.example.topic_4_activity2.MainActivity");
//        Intent intent = new Intent();
//        intent.setComponent(componetName);
//        startActivity(intent);
//        finish();
        Intent intent = new Intent();
        intent.setClassName("com.example.topic_4_activity2", "com.example.topic_4_activity2.MainActivity");
        startActivity(intent);
    }
}