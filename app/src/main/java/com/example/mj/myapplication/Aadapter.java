package com.example.mj.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mj on 2016-04-16.
 */
public class Aadapter extends BaseAdapter{
    
    private List<RoomActivity> items;
    
    private LayoutInflater inflater;
    private Context context;
    private int layout_res_id;
    
    public Aadapter(Context context, int layout_res_id, List<RoomActivity> items){
        this.context = context;
        this.layout_res_id = layout_res_id;
        this.items = items;
        this.inflater = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RoomViewHolder room;

        convertView = inflater.inflate(layout_res_id, parent, false);

        room = new RoomViewHolder();
        room.imageview = (ImageView)convertView.findViewById(R.id.imageView_1);
        room.title = (TextView)convertView.findViewById(R.id.textView_1);
        room.contents = (TextView)convertView.findViewById(R.id.textView_2);
        room.date = (TextView)convertView.findViewById(R.id.textView_3);

        room.imageview.setImageResource(R.drawable.android);
        room.title.setText(items.get(position).title);
        room.contents.setText(items.get(position).contents);
        room.date.setText(items.get(position).date);

        return convertView;
    }

    public class RoomViewHolder{
        public ImageView imageview;
        public TextView title;
        public TextView contents;
        public TextView date;
    }
}
