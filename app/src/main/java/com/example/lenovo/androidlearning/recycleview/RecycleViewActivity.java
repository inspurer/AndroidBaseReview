package com.example.lenovo.androidlearning.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.androidlearning.R;

public class RecycleViewActivity extends AppCompatActivity {

    private Button mBtnLinear,mBtnHorizon,mBtnGrid,mBtnPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        mBtnLinear = findViewById(R.id.btn_linear);
        mBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecycleViewActivity.this,LinearRecycleviewActivity.class);
                startActivity(intent);
            }
        });

        mBtnHorizon = findViewById(R.id.btn_horizontal);
        mBtnHorizon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecycleViewActivity.this,HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnGrid = findViewById(R.id.btn_grid);
        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecycleViewActivity.this,GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnPu = findViewById(R.id.btn_pu);
        mBtnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecycleViewActivity.this,PuRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
