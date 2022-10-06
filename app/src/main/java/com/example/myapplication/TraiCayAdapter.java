package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout,List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class hoderView{
        TextView ten,mota;
        ImageView anh;
    }
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        hoderView hoder;
    if(convertView==null) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(layout, null);
        hoder= new hoderView();
        hoder.ten = (TextView) convertView.findViewById(R.id.textviewten);
        hoder.mota = (TextView) convertView.findViewById(R.id.textviewmota);
        hoder.anh = (ImageView) convertView.findViewById(R.id.imagview);
        convertView.setTag(hoder);
    }
    else{
        hoder = (hoderView) convertView.getTag();
    }
        TraiCay traiCay =traiCayList.get(i);
        hoder.ten.setText(traiCay.getTen());
        hoder.mota.setText(traiCay.getMoTa());
        hoder.anh.setImageResource(traiCay.getHinh());
        Animation animation = AnimationUtils.loadAnimation(context,R.anim.anim_scale);
        convertView.startAnimation(animation);
        return convertView;
    }
}
