package com.example.behzad.tictac;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float x1,x2,y1,y2;
    private Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.startbtn);
        boolean ane = checkinternet();
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               opentwo();
            }
        });
    }
    public boolean onTouchEvent(MotionEvent touchevent){
        switch (touchevent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchevent.getX();
                y2 = touchevent.getY();
                if(x1 > x2){
                    Intent i = new Intent(MainActivity.this, winner.class);
                    Bundle bndlAnimation = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.slideleft, R.anim.slideright).toBundle();
                    startActivity(i, bndlAnimation);
                    finish();
                }
                break;

        }
        return  false;
    }
    private void opentwo(){
        Intent intent = new Intent(MainActivity.this, game.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        //intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    public boolean checkinternet(){
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            return true;
        }
        else {
            Toast.makeText(this, "Not connect to a Network", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

}
