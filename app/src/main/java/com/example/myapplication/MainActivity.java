package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<TraiCay> traiCayArrayList;
    TraiCayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listview1);
        traiCayArrayList =new ArrayList<>();
        traiCayArrayList.add(new TraiCay("Bơ sáp","Bơ Miền Tây", R.drawable.trai_bo));
        traiCayArrayList.add(new TraiCay("Chuối tiêu","Chuối Đà Lạt", R.drawable.trai_chuoi));
        traiCayArrayList.add(new TraiCay("Dưa hấu","Dưa hấu Quảng Nam", R.drawable.trai_dua));
        traiCayArrayList.add(new TraiCay("Ớt đỏ","Ớt đỏ Đà Nẵng", R.drawable.trai_ot));
        traiCayArrayList.add(new TraiCay("Thơm vàng","Thơm Quảng Ngãi", R.drawable.trai_thom));
        traiCayArrayList.add(new TraiCay("Bí đỏ","Bí đỏ Sài Gòn",R.drawable.trai_bi));
        traiCayArrayList.add(new TraiCay("Trái cây","Đặc sản Huế",R.drawable.m_trai_cay));
        traiCayArrayList.add(new TraiCay("Bơ sáp","Bơ Miền Tây", R.drawable.trai_bo));
        traiCayArrayList.add(new TraiCay("Chuối tiêu","Chuối Đà Lạt", R.drawable.trai_chuoi));
        traiCayArrayList.add(new TraiCay("Dưa hấu","Dưa hấu Quảng Nam", R.drawable.trai_dua));
        traiCayArrayList.add(new TraiCay("Ớt đỏ","Ớt đỏ Đà Nẵng", R.drawable.trai_ot));
        traiCayArrayList.add(new TraiCay("Thơm vàng","Thơm Quảng Ngãi", R.drawable.trai_thom));
        traiCayArrayList.add(new TraiCay("Bí đỏ","Bí đỏ Sài Gòn",R.drawable.trai_bi));
        traiCayArrayList.add(new TraiCay("Trái cây","Đặc sản Huế",R.drawable.m_trai_cay));
        traiCayArrayList.add(new TraiCay("Bơ sáp","Bơ Miền Tây", R.drawable.trai_bo));
        traiCayArrayList.add(new TraiCay("Chuối tiêu","Chuối Đà Lạt", R.drawable.trai_chuoi));
        traiCayArrayList.add(new TraiCay("Dưa hấu","Dưa hấu Quảng Nam", R.drawable.trai_dua));
        traiCayArrayList.add(new TraiCay("Ớt đỏ","Ớt đỏ Đà Nẵng", R.drawable.trai_ot));
        traiCayArrayList.add(new TraiCay("Thơm vàng","Thơm Quảng Ngãi", R.drawable.trai_thom));
        traiCayArrayList.add(new TraiCay("Bí đỏ","Bí đỏ Sài Gòn",R.drawable.trai_bi));
        traiCayArrayList.add(new TraiCay("Trái cây","Đặc sản Huế",R.drawable.m_trai_cay));
        traiCayArrayList.add(new TraiCay("Bơ sáp","Bơ Miền Tây", R.drawable.trai_bo));
        traiCayArrayList.add(new TraiCay("Chuối tiêu","Chuối Đà Lạt", R.drawable.trai_chuoi));
        traiCayArrayList.add(new TraiCay("Dưa hấu","Dưa hấu Quảng Nam", R.drawable.trai_dua));
        traiCayArrayList.add(new TraiCay("Ớt đỏ","Ớt đỏ Đà Nẵng", R.drawable.trai_ot));
        traiCayArrayList.add(new TraiCay("Thơm vàng","Thơm Quảng Ngãi", R.drawable.trai_thom));
        traiCayArrayList.add(new TraiCay("Bí đỏ","Bí đỏ Sài Gòn",R.drawable.trai_bi));
        traiCayArrayList.add(new TraiCay("Trái cây","Đặc sản Huế",R.drawable.m_trai_cay));
        adapter = new TraiCayAdapter(this,R.layout.dong_trai_cay,traiCayArrayList);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                Bundle bundle = new Bundle();
                TraiCay traicay = traiCayArrayList.get(position);
                bundle.putSerializable("goi",traicay);
                intent.putExtra("data",bundle);
                startActivity(intent);
            }
        });
    }

}