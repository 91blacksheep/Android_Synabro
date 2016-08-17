package com.example.user.first.Story.StoryList.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.user.first.Emotion.CEmotion_List;
import com.example.user.first.Home.CHome;
import com.example.user.first.Loading.Parsing.Interface.CStoryList;
import com.example.user.first.Loading.Parsing.Lib.CStoryData;
import com.example.user.first.R;
import com.example.user.first.Setting.CSetting_List;
import com.example.user.first.Story.Story.PlayerView.CStory_Player;
import com.example.user.first.UiSetting.CMyText;

/**
 * Created by KICT-15 on 2016-07-06.
 */
public class CStoryListClient extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    /* value */
    ScrollView scrollView;
    Toolbar toolbar;
    View nav_header_view;
    TextView nav_header_txt;
    NavigationView navigationView;

    String message;

    public ListView listView;
    public CStoryList cStoryList = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_list_layout);

        /**/
        cStoryList = new CStoryList(this);

        scrollView = (ScrollView)findViewById(R.id.scrView);
        listView = (ListView)findViewById(R.id.listView);

        /* 네비게이션 드로어 초기화 */
        SetNav();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        nav_header_view = navigationView.getHeaderView(0);
        nav_header_txt = (TextView)nav_header_view.findViewById(R.id.mytext);

        /* 나만의 글귀 */
        Intent intent = getIntent();
        message = intent.getStringExtra(CMyText.EXTRA_MESSAGE);
        nav_header_txt.setText(message);

        /* 리스트 아이템 Init*/
        listView.setAdapter(cStoryList);
        listView.setOnItemClickListener(mItemClickListener);
    }

    private void SetNav()
    {
        /**/
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void onClickButton(View v)
    {
        switch(v.getId())
        {
            case R.id.btnAll:
                cStoryList.OnClickTapAll();
                listView.smoothScrollToPosition(0);
                break;
            case R.id.btnInner:
                cStoryList.OnClickTapInner();
                listView.smoothScrollToPosition(0);
                break;
            case R.id.btnEx:
                cStoryList.OnClickTapEx();
                listView.smoothScrollToPosition(0);
                break;
            case R.id.btnTop:
                listView.smoothScrollToPosition(0);
                break;
        }
    }

    private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long l_position)
        {
            CStoryData item = (CStoryData)parent.getItemAtPosition(position);

            String url = item.Get_url();
            String type = item.Get_type();

            Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
            intent.putExtra("url", url);
            intent.putExtra("type", type);
            startActivityForResult(intent, 0);
        }
    };

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if(id == R.id.nav_home)
        {
            Intent intent = new Intent(getApplicationContext(), CHome.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_storybook)
        {
            Intent intent = new Intent(getApplicationContext(), CStoryListClient.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_emotion_list)
        {
            Intent intent = new Intent(getApplicationContext(), CEmotion_List.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_setting)
        {
            Intent intent = new Intent(getApplicationContext(), CSetting_List.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_btn4)
        {
            Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_btn5)
        {

        }
        else if (id == R.id.changetext)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}