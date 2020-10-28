package com.example.yummyhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;
    EditText edit1,edit2;
    String userName,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userName = edit1.getText().toString();
                password = edit2.getText().toString();

                Intent intent = new Intent(getBaseContext(),SecondActivity.class);
                intent.putExtra("user",userName);
                intent.putExtra("pass",password);
                startActivity(intent);

            }
        });


    }
}