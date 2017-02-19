package com.example.leanh.partymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mainPic;
    private Button joinBtn;
    private Button hostBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinBtn= (Button) findViewById(R.id.joinButton);
        hostBtn= (Button) findViewById(R.id.hostButton);

        joinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hostSessionIntent = new Intent(MainActivity.this, HostSession.class);
                startActivity(hostSessionIntent);
            }
        });

        hostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent joinSessionIntent = new Intent(MainActivity.this, JoinSession.class);
                startActivity(joinSessionIntent);
            }
        });

    }
}
