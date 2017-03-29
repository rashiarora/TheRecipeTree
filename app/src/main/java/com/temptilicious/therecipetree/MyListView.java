package com.temptilicious.therecipetree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 19-07-2015.
 */
public class MyListView extends ActionBarActivity {
    ListView myLV;
    ArrayList<ListBean> myList;
    MyArrayAdapter adapter;

    void initList(){
        myList = new ArrayList<ListBean>();
        myList.add(new ListBean(R.drawable.mocktails,R.drawable.veg_non,"Mocktails"));
        myList.add(new ListBean(R.drawable.soups,R.drawable.veg_non,"Soups"));
        myList.add(new ListBean(R.drawable.indian,R.drawable.veg_non,"Indian"));
       // myList.add(new ListBean("Chinese",R.drawable.chinese));
        myList.add(new ListBean(R.drawable.continental,R.drawable.veg_non,"Continental"));
        myList.add(new ListBean(R.drawable.mexican,R.drawable.veg_non,"Mexican"));
        myList.add(new ListBean(R.drawable.thai,R.drawable.veg_non,"Thai"));
        myList.add(new ListBean(R.drawable.desserts,R.drawable.veg_non,"Desserts"));
        adapter= new MyArrayAdapter(this,R.layout.list_item,myList);
        myLV.setAdapter(adapter);
       myLV.setOnItemClickListener(clickListener);

        TextView eShow = (TextView)findViewById(R.id.textViewShow);
        Intent rcv = getIntent();
        //String strrcvName = rcv.getStringExtra(Util.keyname);
        //eShow.setText("WELCOME"+ "  "+ strrcvName.toUpperCase()+" !!!");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_activity);
        myLV = (ListView)findViewById(R.id.listViewCuisines);
        initList();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       switch (id){

       }

        return super.onOptionsItemSelected(item);
    }
    AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                {
                     Intent i = new Intent(MyListView.this,Mocktails_Activity.class);
                    startActivity(i);}
                break;
                case 1:{
                    Intent i = new Intent(MyListView.this,Soups_Activity.class);
                    startActivity(i);
                }break;
                case 2:{
                    Intent i = new Intent(MyListView.this,Indian_Recipes.class);
                    startActivity(i);
                }break;
                case 3:{
                    Intent i = new Intent(MyListView.this,Continental_Activity.class);
                    startActivity(i);
                }break;
                case 4:{
                    Intent i = new Intent(MyListView.this,Mexican_Activity.class);
                    startActivity(i);
                }break;
                case 5:{
                    Intent i = new Intent(MyListView.this,Thai_Activity.class);
                    startActivity(i);
                }break;
                case 6:{
                    Intent i = new Intent(MyListView.this,Desserts_Activity.class);
                    startActivity(i);
                }break;

            }
        }
    };
}
