package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoMinuman;
    TextView textViewNamaMinuman, textViewInfoMinuman;
    private ImageView imageViewFotoMinuman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoMinuman = findViewById(R.id.imageViewFotoMinuman);
        textViewNamaMinuman = findViewById(R.id.textViewNamaMinuman);
        textViewInfoMinuman = findViewById(R.id.textViewInfoMinuman);

        getIncomingExtra();

    }

    private void getIncomingExtra(){

        if(getIntent().hasExtra("minuman") && getIntent().hasExtra("nama_minuman") && getIntent().hasExtra("info_minuman")){

            String minuman = getIntent().getStringExtra("minuman");
            String namaminuman = getIntent().getStringExtra("nama_minuman");
            String infominuman = getIntent().getStringExtra("info_minuman");

            setDataActivity(minuman, namaminuman, infominuman);
        }
    }
    private void setDataActivity(String minuman, String namaminuman, String infominuman){

        Glide.with(this).asBitmap().load(minuman).into(imageViewFotoMinuman);

        textViewNamaMinuman.setText(namaminuman);
        textViewInfoMinuman.setText(infominuman);
    }
}