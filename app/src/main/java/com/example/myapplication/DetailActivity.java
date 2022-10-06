package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView name, mota;
    ImageView anh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        name = findViewById(R.id.textView);
        mota = findViewById(R.id.textView2);
        anh = findViewById(R.id.imageView);
        Intent intent =  getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        TraiCay traicay = (TraiCay) bundle.getSerializable("goi");
        String name1 = traicay.getTen();
        String mota1 = traicay.getMoTa();
        int hinhanh1 = traicay.getHinh();
        anh.setImageResource(hinhanh1);
        mota.setText(mota1);
        name.setText(name1);
    }
}