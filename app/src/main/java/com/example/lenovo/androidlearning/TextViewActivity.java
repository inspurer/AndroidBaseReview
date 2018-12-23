package com.example.lenovo.androidlearning;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mtv4,mtv5,mtv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mtv4 = findViewById(R.id.tv_4);
        mtv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//设置中划线
        mtv4.getPaint().setAntiAlias(true); //去掉锯齿

        mtv5 = findViewById(R.id.tv_5);
        mtv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //设置下划线

        mtv6 = findViewById(R.id.tv_6);
        mtv6.setText(Html.fromHtml("<u>月小水长</u>"));
    }
}
