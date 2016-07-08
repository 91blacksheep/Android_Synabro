package com.example.user.first.Story;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.user.first.R;

/**
 * Created by KICT-15 on 2016-07-08.
 */
public class CStory_Player extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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
        setContentView(R.layout.story_player);

        Intent intent = getIntent();
        String url = intent.getStringExtra("m_url");
        Uri uri = Uri.parse(url);
        intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
