package com.example.leanh.partymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mainPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPic = (ImageView)findViewById(R.id.mainPic);
        mainPic.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeRight() {
                Intent hostSessionIntent = new Intent(MainActivity.this, HostSession.class);
                startActivity(hostSessionIntent);
            }
            public void onSwipeLeft() {
                Intent joinSessionIntent = new Intent(MainActivity.this, JoinSession.class);
                startActivity(joinSessionIntent);
            }

        });

    }
}
