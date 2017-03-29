package com.temptilicious.therecipetree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * Created by Admin on 18-07-2015.
 */
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        mainHandler.sendEmptyMessageDelayed(Util.msg,3000);
    }
    Handler mainHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what == Util.msg){
                Intent i = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        }
    };
}
