package com.example.user.first.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.user.first.Emotion.CEmotion;
import com.example.user.first.Setting.CSetting;
import com.example.user.first.R;
import com.example.user.first.Story.StoryList.View.CStoryListClient;

/**
 * Created by USER on 2016-06-26.
 */
public class CHome extends AppCompatActivity {

    TextView btnStory,btnEmotion,btnSetting,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btnStory = (TextView)findViewById(R.id.storybook);
        btnEmotion = (TextView)findViewById(R.id.emotion);
        btnSetting = (TextView)findViewById(R.id.setting);
        btn4 = (TextView)findViewById(R.id.btn4);
        btn5 = (TextView)findViewById(R.id.btn5);

        //타이틀 삭제 시작
        Window win = getWindow();
        win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //타이틀 삭제 끝



        btnStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CStoryListClient.class);
                startActivity(intent);
            }
        });

        btnEmotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CEmotion.class);
                startActivity(intent);
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CSetting.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
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