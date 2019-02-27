package com.example.lenovo.androidlearning.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.androidlearning.R;

public class LinearAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContxet;

    private onItemClickListener listener;

    LinearAdapter(Context context,onItemClickListener listener){
        this.mContxet = context;
        this.listener = listener;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        if(viewType==0) {
            return new linearviewholder(LayoutInflater.from(mContxet).inflate(R.layout.layout_linearrecycleview_item,viewGroup,false));
        }else{
            return new linearviewholder2(LayoutInflater.from(mContxet).inflate(R.layout.layout_linearrecycleview_item2,viewGroup,false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int position) {
        if(getItemViewType(position) == 0){
            ((linearviewholder)viewHolder).textView.setText("Hello_world");
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(position);
                }
            });
        }else{
            ((linearviewholder2)viewHolder).textView.setText("天道酬勤");
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(position);
                }
            });
        }




    }

    @Override
    public int getItemViewType(int position) {
        if (position%2 == 0){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class linearviewholder2 extends RecyclerView.ViewHolder{

        public TextView textView;
        public ImageView imageView;

        public linearviewholder2(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_tit);
            imageView = itemView.findViewById(R.id.iv_image);
        }
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
