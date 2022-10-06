package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignoutActivity extends AppCompatActivity {
    TextView textviewsignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signout);
        textviewsignin=findViewById(R.id.txtsignin);
        textviewsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignoutActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}