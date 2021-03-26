package com.example.belajarlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imgLinLayout;
    ImageView imgRelLayout;
    ImageView imgConsLayout;
    ImageView imgLinLayout1;
    ImageView imgTabLayout;
    ImageView imgMatDesign;
    ImageView imgScrollView;
    ImageView imgScrollViewHor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgLinLayout = findViewById(R.id.img_lin_layout);
        imgRelLayout = findViewById(R.id.img_rel_layout);
        imgConsLayout = findViewById(R.id.img_cons_layout);
        imgLinLayout1 = findViewById(R.id.img_lin_layout1);
        imgTabLayout = findViewById(R.id.img_tab_layout);
        imgMatDesign = findViewById(R.id.img_mat_design);
        imgScrollView = findViewById(R.id.img_scroll_view);
        imgScrollViewHor = findViewById(R.id.img_scroll_view_hor);

        imgLinLayout.setOnClickListener(this);
        imgRelLayout.setOnClickListener(this);
        imgConsLayout.setOnClickListener(this);
        imgLinLayout1.setOnClickListener(this);
        imgTabLayout.setOnClickListener(this);
        imgMatDesign.setOnClickListener(this);
        imgScrollView.setOnClickListener(this);
        imgScrollViewHor.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.img_lin_layout:
                Toast.makeText(this, "Ini adalah Linear Layout", Toast.LENGTH_SHORT).show();
            case R.id.img_rel_layout:
                Toast.makeText(this, "Ini adalah Relatif Layout", Toast.LENGTH_SHORT).show();
            case R.id.img_cons_layout:
                Toast.makeText(this, "Ini adalah Constraint Layout", Toast.LENGTH_SHORT).show();
            case R.id.img_lin_layout1:
                Toast.makeText(this, "Ini adalah Linear Layout", Toast.LENGTH_SHORT).show();
            case R.id.img_tab_layout:
                Toast.makeText(this, "Ini adalah Tabel Layout", Toast.LENGTH_SHORT).show();
            case R.id.img_mat_design:
                Toast.makeText(this, "Ini adalah Material Design", Toast.LENGTH_SHORT).show();
            case R.id.img_scroll_view:
                Toast.makeText(this, "Ini adalah Scroll View", Toast.LENGTH_SHORT).show();
            case R.id.img_scroll_view_hor:
                Toast.makeText(this, "Ini adalah Scroll View Horizontal", Toast.LENGTH_SHORT).show();

        }
    }
}