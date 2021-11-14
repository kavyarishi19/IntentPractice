package com.example.multipleactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MultipleActivityDemo2 extends AppCompatActivity {

    public void goBack(View view){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_demo2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        Toast.makeText(this,name, Toast.LENGTH_SHORT).show();
    }
}