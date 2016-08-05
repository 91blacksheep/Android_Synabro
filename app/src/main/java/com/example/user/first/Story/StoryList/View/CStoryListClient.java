package com.example.user.first.Story.StoryList.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.user.first.Loading.Parsing.Interface.CStoryList;
import com.example.user.first.Loading.Parsing.Lib.CStoryData;
import com.example.user.first.R;
import com.example.user.first.Story.Story.PlayerView.CStory_Player;
import com.example.user.first.UiSetting.ToolBarSetting;

/**
 * Created by KICT-15 on 2016-07-06.
 */
public class CStoryListClient extends ToolBarSetting
{
    /* value */
    Button btnAll, btnInner, btnEx, btnTop;
    ScrollView scrollView;

    public ListView listView;

    public CStoryList cStoryList = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_list_layout);

        toolbar();

        cStoryList = new CStoryList(this);

        scrollView = (ScrollView)findViewById(R.id.scrView);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(cStoryList);

        btnAll = (Button)findViewById(R.id.btnAll);
        btnAll.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                cStoryList.OnClickTapAll();
                listView.smoothScrollToPosition(0);
            }
        });

        btnInner = (Button)findViewById(R.id.btnInner);
        btnInner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                cStoryList.OnClickTapInner();
                listView.smoothScrollToPosition(0);
            }
        });

        btnEx = (Button)findViewById(R.id.btnEx);
        btnEx.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                cStoryList.OnClickTapEx();
                listView.smoothScrollToPosition(0);
            }
        });

        btnTop = (Button)findViewById(R.id.btnTop);
        btnTop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                listView.smoothScrollToPosition(0);
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                startActivity(intent);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                // get item
                CStoryData item = (CStoryData)parent.getItemAtPosition(position);

                String url = item.Get_m_url();

                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                intent.putExtra("m_url", url);
                startActivityForResult(intent, 0);
            }
        });
    }
}