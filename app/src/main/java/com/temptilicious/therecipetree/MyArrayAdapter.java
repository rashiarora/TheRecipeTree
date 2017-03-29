package com.temptilicious.therecipetree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 19-07-2015.
 */
public class MyArrayAdapter extends ArrayAdapter {
    Context cxt;
    ArrayList<ListBean>  list;
    public MyArrayAdapter(Context context, int resource, ArrayList<ListBean> objects) {
        super(context, resource, objects);
        cxt=context;
        list=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView=null;
        LayoutInflater inflater =(LayoutInflater)cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rowView = inflater.inflate(R.layout.list_item,parent,false);
        ImageView iv = (ImageView)rowView.findViewById(R.id.imageViewCuisines);
        ImageView iv1 = (ImageView)rowView.findViewById(R.id.imageViewMark);
        TextView cuisine = (TextView)rowView.findViewById(R.id.textViewCuisine);
        ListBean lb = list.get(position);
        iv.setBackgroundResource(lb.getIcon());
        iv1.setBackgroundResource(lb.getMark());
        cuisine.setText(lb.getCuisineName());
        return rowView;
    }
}
