package com.temptilicious.therecipetree;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Admin on 18-07-2015.
 */
public class AboutUs extends Fragment {
    TextView about_us;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.about_us,container,false);
        about_us = (TextView)myView.findViewById(R.id.textViewAbout);
        about_us.setText(R.string.About_Us);
        return myView;
    }
}
