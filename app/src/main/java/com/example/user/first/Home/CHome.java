package com.example.user.first.Home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.user.first.Emotion.CEmotion_List;
import com.example.user.first.R;
import com.example.user.first.Setting.CSetting_List;
import com.example.user.first.Story.StoryList.View.CStoryListClient;
import com.example.user.first.UiSetting.CDrawer;
import com.example.user.first.UiSetting.CTextPosition;

public class CHome extends AppCompatActivity
{
    TextView btnStory, btnEmotion, btnSetting, btn4, btn5;

    CDrawer cDrawer = null;
    CTextPosition cTextPosition = null;
    /*CTextPosition emotionCTextPosition = null;
    CTextPosition settingCTextPosition = null;
    CTextPosition ex4CTextPosition = null;
    CTextPosition ex5CTextPosition = null;*/

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_home_layout);

        btnStory = (TextView)findViewById(R.id.storybook);
        btnEmotion = (TextView)findViewById(R.id.emotion);
        btnSetting = (TextView)findViewById(R.id.setting);
        btn4 = (TextView)findViewById(R.id.btn4);
        btn5 = (TextView)findViewById(R.id.btn5);

        //cDrawer = new CDrawer();
        cTextPosition = new CTextPosition(btnStory, btnEmotion, btnSetting, btn4, btn5, this);

        btnStory.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), CStoryListClient.class);
                startActivity(intent);
            }
        });

        btnEmotion.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), CEmotion_List.class);
                startActivity(intent);
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), CSetting_List.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
    }
}
