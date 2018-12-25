package com.example.lenovo.androidlearning.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.androidlearning.R;

public class MyGridAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyGridAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null){
            view = mLayoutInflater.inflate(R.layout.layout_griditem,null);

            viewHolder = new ViewHolder();

            viewHolder.imageView = view.findViewById(R.id.giv);
            viewHolder.textView = view.findViewById(R.id.gtv);

            view.setTag(viewHolder);

        }
        else{
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.textView.setText("Huawei");
        Glide.with(mContext).load("https://ss0.bdstatic.com/-0U0bnSm1A5BphGlnYG/tam-ogel/17f2dd9756d9d333bee8e60ce8c03e4c_222_222.jpg").into(viewHolder.imageView);

        return view;
    }
}
