package com.example.lenovo.androidlearning.recycleview;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.lenovo.androidlearning.R;

public class HorRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recycler_view);
        recyclerView = findViewById(R.id.hor_recycle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(HorRecyclerViewActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new MyDecoration());
        recyclerView.setAdapter((new HorAdapter(HorRecyclerViewActivity.this, new HorAdapter.onItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(HorRecyclerViewActivity.this,"click"+pos,Toast.LENGTH_SHORT).show();
            }
        })));
    }

    class MyDecoration extends RecyclerView.ItemDecoration {

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);

            outRect.set(0, 0,getResources().getDimensionPixelOffset(R.dimen.Dividerhight),0);
        }
    }
}
