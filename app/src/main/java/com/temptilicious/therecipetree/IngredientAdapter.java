package com.temptilicious.therecipetree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 27-07-2015.
 */
public class IngredientAdapter extends ArrayAdapter {
    Context cxt;
    ArrayList<IngredientBean> list, tempList;

    public IngredientAdapter(Context context, int resource, ArrayList<IngredientBean> objects) {
        super(context, resource, objects);

        cxt = context;
        list = objects;
        tempList = new ArrayList<IngredientBean>();
        tempList.addAll(list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = null;

        LayoutInflater inflater = (LayoutInflater) cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rowView = inflater.inflate(R.layout.activity_ingredient__meaning, parent, false);

        TextView ingredientName = (TextView) rowView.findViewById(R.id.textViewIngredientName);
        TextView ingredientMeaning = (TextView) rowView.findViewById(R.id.textViewIngredientMeaning);

        IngredientBean ib = list.get(position);
        ingredientName.setText(ib.getName());
        ingredientMeaning.setText(ib.getMeaning());
        return rowView;
    }

    public void filter(String str) {
        list.clear();
        ArrayList<IngredientBean> tempList = new ArrayList<IngredientBean>();
        tempList.addAll(list);
        if (str.length() == 0) {
            list.addAll(tempList);
        } else {
            for (IngredientBean ib : tempList) {
                if (ib.getName().contains(str)) {
                    list.add(ib);
                }

            }
        }
        notifyDataSetChanged();
    }
}
