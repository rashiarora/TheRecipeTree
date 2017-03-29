package com.temptilicious.therecipetree;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;


public class AllRecipesActivity extends ActionBarActivity {

    TextView txtShowRecipe,getTxtShowRecipeName;
    ImageView imgShowRecipe,imgShowMarker;
    RecipeBean rcvrb;
     EditText search;
    //String search;
    Button btnHelp,btnVideo,btnSearch;
    AlertDialog dialog,dialog1;
    boolean isInternetPresent = false;
   ConnectionDetector cd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_recipes);
        txtShowRecipe = (TextView)findViewById(R.id.textViewRecipe);
        getTxtShowRecipeName = (TextView)findViewById(R.id.textViewRecipeName);
        imgShowRecipe =(ImageView)findViewById(R.id.imageViewRecipeShow);
        imgShowMarker =(ImageView)findViewById(R.id.imageViewMarker);
        Intent rcv = getIntent();
        rcvrb =(RecipeBean) rcv.getSerializableExtra(Util.keyRecipe);
        txtShowRecipe.setText(rcvrb.getRecipe());
        imgShowRecipe.setImageResource(rcvrb.getImage());
        getTxtShowRecipeName.setText(rcvrb.getTitle());
        imgShowMarker.setImageResource(rcvrb.getMarker());
        btnHelp=(Button)findViewById(R.id.buttonGoToHelp);
        btnVideo=(Button)findViewById(R.id.buttonVideo);
        btnSearch = (Button)findViewById(R.id.buttonAlert);
        btnHelp.setOnClickListener(clickListener);
        btnVideo.setOnClickListener(clickListener);
        search = (EditText)findViewById(R.id.editTextHelp);
         //ConnectionDetector cd;
        cd = new ConnectionDetector(getApplicationContext());
    }
    void showCustomDialog(){
        final Dialog dialog = new Dialog(this);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.alert);

        final EditText et =(EditText)dialog.findViewById(R.id.editTextHelp);
        Button btn = (Button)dialog.findViewById(R.id.buttonAlert);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alert = (et.getText().toString().trim());
                Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
                i.putExtra(Util.query, alert);
                startActivity(i);
                dialog.dismiss();

            }
        });
        dialog.show();
    }

void showAlertDialog(){
    AlertDialog.Builder builder= new AlertDialog.Builder(this);
    builder.setTitle("Internet not Enabled");
    builder.setMessage("Kindly enable Internet");
    builder.setCancelable(false);
    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Intent i= new Intent(Settings.ACTION_WIRELESS_SETTINGS);
            startActivity(i);

        }
    });
    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog1.dismiss();
            finish();
        }
    });
    dialog1 = builder.create();
    dialog1.show();
}
   // public boolean isOnline(){
       // ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
   //NetworkInfo netinfo= conMgr.getActiveNetworkInfo();
        //if(netinfo==null || !netinfo.isConnected()|| !netinfo.isAvailable()){
            //return false;
        //}
        //final NetworkInfo wifi = conMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        //final NetworkInfo mobile = conMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        //if (wifi.isAvailable()|| mobile.isAvailable()) {
            //return true;
        //}
        //else
            //return false;
    //}

    View.OnClickListener clickListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.buttonGoToHelp :
            {    showCustomDialog();
//                Intent i = new Intent(AllRecipesActivity.this,MainActivity.class);
//                startActivity(i);
            }break;
            case R.id.buttonVideo:
            {
                isInternetPresent = cd.isConnectingToInternet();
                if(! isInternetPresent){
                    showAlertDialog();
                }
                else {
                    Intent rcv = getIntent();
                    String vid_ID = rcv.getStringExtra("VideoID");
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + vid_ID));
                    //intent.putExtra("VideoID",videoId);
                    startActivity(intent);
                }
            }
        }
    }
};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_all_recipes, menu);
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
