package com.example.lenovo.androidlearning.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.androidlearning.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.linearviewholder> {

    private Context mContxet;

    private onItemClickListener listener;

    GridAdapter(Context context, onItemClickListener listener){
        this.mContxet = context;
        this.listener = listener;
    }
    @NonNull
    @Override
    public GridAdapter.linearviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        return new linearviewholder(LayoutInflater.from(mContxet).inflate(R.layout.layout_grid_recycleview_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.linearviewholder viewHolder, final int position) {
        viewHolder.textView.setText("Hello_world");

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return 60;
    }

    class linearviewholder extends RecyclerView.ViewHolder{

        public TextView textView;

        public linearviewholder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_tit);
        }
    }

    public interface onItemClickListener{
        void onClick(int pos);
    }
}
