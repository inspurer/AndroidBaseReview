package com.example.lenovo.androidlearning.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.androidlearning.R;

public class StaggerGridAdapter extends RecyclerView.Adapter<StaggerGridAdapter.linearviewholder> {

    private Context mContxet;

    private onItemClickListener listener;

    StaggerGridAdapter(Context context, onItemClickListener listener){
        this.mContxet = context;
        this.listener = listener;
    }
    @NonNull
    @Override
    public StaggerGridAdapter.linearviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        return new linearviewholder(LayoutInflater.from(mContxet).inflate(R.layout.layout_stagger_grid_recycleview_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggerGridAdapter.linearviewholder viewHolder, final int position) {

        if(position%2 == 1)
            viewHolder.imageView.setImageResource(R.drawable.suzy_1);
        else
            viewHolder.imageView.setImageResource(R.drawable.suzy_2);
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

        public ImageView imageView;

        public linearviewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_suzy);
        }
    }

    public interface onItemClickListener{
        void onClick(int pos);
    }
}
