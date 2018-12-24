package com.example.lenovo.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView iv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        iv4 = findViewById(R.id.iv4);

        Glide.with(this).load("https://ss0.bdstatic.com/-0U0bnSm1A5BphGlnYG/tam-ogel/17f2dd9756d9d333bee8e60ce8c03e4c_222_222.jpg").into(iv4);
    }
}
