package com.temptilicious.therecipetree;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Ingredient_Meaning extends ActionBarActivity {
    TextView txtShowIngredientName,txtShowIngredientMeaning;
    IngredientBean rcvib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient__meaning);
        txtShowIngredientName = (TextView)findViewById(R.id.textViewIngredientName);
        txtShowIngredientMeaning = (TextView)findViewById(R.id.textViewIngredientMeaning);
        Intent rcv = getIntent();
        rcvib =(IngredientBean) rcv.getSerializableExtra(Util.ingredient);
        txtShowIngredientName.setText(rcvib.getName());
        txtShowIngredientMeaning.setText(rcvib.getMeaning());
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ingredient__meaning, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
