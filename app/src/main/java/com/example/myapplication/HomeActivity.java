package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ListView listView;
    Button btprofile, btcontent;
    ArrayList<ItemMenu> arrayList;
    MenuAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        btcontent= findViewById(R.id.btcontent);
        btprofile= findViewById(R.id.btprofile);
        anhxa();
        actiontoolbar();
        acctionMenu();
        btcontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        getItemIntent();
    }

    private void getItemIntent() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent =new Intent(HomeActivity.this, ProfileActivity.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void acctionMenu() {
        arrayList= new ArrayList<>();


        arrayList.add(new ItemMenu("profile", R.drawable.ic_baseline_person));
        arrayList.add(new ItemMenu("Content ", R.drawable.ic_baseline_content_paste_24));
        arrayList.add(new ItemMenu("Sign out ", R.drawable.ic_baseline_login));
        adapter= new MenuAdapter(this, R.layout.dong_item,arrayList);
        listView.setAdapter(adapter);
    }

    private void actiontoolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_action_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }

    private void anhxa() {
        toolbar=findViewById(R.id.toolbar);
        drawerLayout= findViewById(R.id.drawlayout);
        navigationView= findViewById(R.id.nagavationview);
        listView=findViewById(R.id.lv);
    }
}