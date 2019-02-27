package com.example.lenovo.androidlearning.recycleview;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.example.lenovo.androidlearning.R;

public class PuRecyclerViewActivity extends AppCompatActivity {

    RecyclerView mRvPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycler_view);

        mRvPu = findViewById(R.id.rv_pu);
        mRvPu.addItemDecoration(new MyDecoration());
        mRvPu.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mRvPu.setAdapter(new StaggerGridAdapter(PuRecyclerViewActivity.this, new StaggerGridAdapter.onItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(PuRecyclerViewActivity.this, "click"+pos, Toast.LENGTH_SHORT).show();

            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelSize(R.dimen.Dividerhight2);
            outRect.set(gap,gap,gap,gap);
        }
    }
}
