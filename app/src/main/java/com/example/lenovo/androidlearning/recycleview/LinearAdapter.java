package com.example.lenovo.androidlearning.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.androidlearning.R;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.linearviewholder> {

    private Context mContxet;

    private onItemClickListener listener;

    LinearAdapter(Context context,onItemClickListener listener){
        this.mContxet = context;
        this.listener = listener;
    }
    @NonNull
    @Override
    public LinearAdapter.linearviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        return new linearviewholder(LayoutInflater.from(mContxet).inflate(R.layout.layout_linearrecycleview_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.linearviewholder viewHolder, final int position) {
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
        return 30;
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
