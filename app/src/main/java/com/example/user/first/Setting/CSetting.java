package com.example.user.first.Setting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.user.first.R;
import com.example.user.first.Story.Story.PlayerView.CStory_Player;

/**
 * Created by USER on 2016-06-26.
 */
public class CSetting extends AppCompatActivity {

    TextView btnWording,btnQnA,btnTutorial,btnCreate,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀 삭제 시작
        Window win = getWindow();
        win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //타이틀 삭제 끝
        setContentView(R.layout.setting);

        btnWording = (TextView)findViewById(R.id.wording);
        btnQnA = (TextView)findViewById(R.id.QnA);
        btnTutorial = (TextView)findViewById(R.id.tutorial);
        btnCreate = (TextView)findViewById(R.id.create);
        btn5 = (TextView)findViewById(R.id.btn5);



        btnWording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                startActivity(intent);
            }
        });

        btnQnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                startActivity(intent);
            }
        });

        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                startActivity(intent);
            }
        });

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
}
