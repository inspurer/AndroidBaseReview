package com.example.lenovo.androidlearning.recycleview;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.lenovo.androidlearning.R;

public class LinearRecycleviewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycleview);

        recyclerView = findViewById(R.id.linear_recycleview);

        recyclerView.setLayoutManager(new LinearLayoutManager(LinearRecycleviewActivity.this));

        //设置adapter
        recyclerView.setAdapter(new LinearAdapter(LinearRecycleviewActivity.this, new LinearAdapter.onItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(LinearRecycleviewActivity.this, "click...." + pos, Toast.LENGTH_SHORT).show();
            }
        }));

        recyclerView.addItemDecoration(new MyDecoration());

    }

    class MyDecoration extends RecyclerView.ItemDecoration {

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);

            outRect.set(0, 0, 0, getResources().getDimensionPixelOffset(R.dimen.Dividerhight));
        }
    }
}
