package com.example.user.first.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.user.first.Emotion.CEmotion_List;
import com.example.user.first.R;
import com.example.user.first.Setting.CSetting_List;
import com.example.user.first.Story.StoryList.View.CStoryListClient;
import com.example.user.first.UiSetting.ToolBarSetting;

public class CHome extends ToolBarSetting
{

    TextView btnStory,btnEmotion,btnSetting,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_home_layout);

        toolbar();

        btnStory = (TextView)findViewById(R.id.storybook);
        btnEmotion = (TextView)findViewById(R.id.emotion);
        btnSetting = (TextView)findViewById(R.id.setting);
        btn4 = (TextView)findViewById(R.id.btn4);
        btn5 = (TextView)findViewById(R.id.btn5);

        textposition(btnStory,0,-17);
        textposition(btnEmotion,23,-5);
        textposition(btnSetting,16,13);
        textposition(btn4,-10,13);
        textposition(btn5,-17,-5);

        btnStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
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
