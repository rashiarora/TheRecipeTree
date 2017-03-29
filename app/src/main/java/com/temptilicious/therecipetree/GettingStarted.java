package com.temptilicious.therecipetree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Admin on 18-07-2015.
 */
public class GettingStarted extends Fragment {
    ImageButton ib;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.getting_started,container,false);
                   ib = (ImageButton)myView.findViewById(R.id.imageButtonGetting);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.imageButtonGetting){
                    Intent i = new Intent("com.temptilicious.therecipetree.mylistview");
                    startActivity(i); }
            }
        });


        return myView;
    }
}
