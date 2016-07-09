package com.example.user.first.Story.StoryList.Client;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.user.first.Story.Story.CStory_Player;
import com.example.user.first.Story.StoryList.Lib.CStoryData;
import com.example.user.first.Story.StoryList.Interface.CStoryList;
import com.example.user.first.R;

/**
 * Created by KICT-15 on 2016-07-06.
 */
public class CStoryListClient extends AppCompatActivity
{
    /* value */
    Button btnMeStory, btnAll, btnInner, btnEx, btnTop;
    ScrollView scrollView;

    final String url = "https://www.youtube.com/watch?v";

    public ListView listView;

    public CStoryList cStoryList = null;

    /*
    * *
    */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
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

        setContentView(R.layout.story_layout);

        btnMeStory = (Button)findViewById(R.id.btnMeStory);
        btnMeStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        cStoryList = new CStoryList(this);

        scrollView = (ScrollView)findViewById(R.id.scrView);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(cStoryList);

        btnAll = (Button)findViewById(R.id.btnAll);
        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                cStoryList.OnClickTapAll();
                listView.smoothScrollToPosition(0);
            }
        });

        btnInner = (Button)findViewById(R.id.btnInner);
        btnInner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                cStoryList.OnClickTapInner();
                listView.smoothScrollToPosition(0);
            }
        });

        btnEx = (Button)findViewById(R.id.btnEx);
        btnEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                cStoryList.OnClickTapEx();
                listView.smoothScrollToPosition(0);
            }
        });

        btnTop = (Button)findViewById(R.id.btnTop);
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.smoothScrollToPosition(0);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get item
                CStoryData item = (CStoryData)parent.getItemAtPosition(position);

                Drawable icon = item.Get_m_thumbnail();
                String title = item.Get_m_title();
                String ex = item.Get_m_ex();
                String url = item.Get_m_url();

                 /* TODO */
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                intent.putExtra("m_url", url);
                startActivityForResult(intent, 0);
                finish();
            }
        });
    }
}
