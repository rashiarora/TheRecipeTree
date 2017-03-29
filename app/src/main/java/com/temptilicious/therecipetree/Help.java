package com.temptilicious.therecipetree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Admin on 18-07-2015.
 */
public class Help extends Fragment {
    EditText eTxtSearch;
    Button btnSearch;
    String search;






    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.help,container,false);
        eTxtSearch= (EditText)myView.findViewById(R.id.editTextSearch);

        btnSearch = (Button)myView.findViewById(R.id.buttonSearch);



        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.buttonSearch){
                    search = eTxtSearch.getText().toString().trim();
                    Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
                    i.putExtra(Util.query,search);
                    startActivity(i);
                }
            }
        });
        return myView;
    }




}
