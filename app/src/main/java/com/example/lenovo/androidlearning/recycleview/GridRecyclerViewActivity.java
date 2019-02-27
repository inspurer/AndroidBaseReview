package com.example.lenovo.androidlearning.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.lenovo.androidlearning.R;

public class GridRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler_view);

        recyclerView = findViewById(R.id.rv_grid);
        recyclerView.setLayoutManager(new GridLayoutManager(GridRecyclerViewActivity.this,3));
        recyclerView.setAdapter(new GridAdapter(GridRecyclerViewActivity.this, new GridAdapter.onItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecyclerViewActivity.this, "click"+pos, Toast.LENGTH_SHORT).show();
            }
        }));

    }
}
