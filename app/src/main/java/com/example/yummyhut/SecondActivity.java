package com.example.yummyhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String userName,password;
    TextView txtUserName,txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        userName = intent.getStringExtra("user");
        password = intent.getStringExtra("pass");

        txtUserName = findViewById(R.id.txt3);
        txtPassword = findViewById(R.id.txt4);

        txtUserName.setText(userName);
        txtPassword.setText(password);
    }
}