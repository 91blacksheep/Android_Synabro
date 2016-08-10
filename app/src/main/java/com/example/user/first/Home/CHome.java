package com.example.user.first.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.first.Emotion.CEmotion_List;
import com.example.user.first.R;
import com.example.user.first.Setting.CSetting_List;
import com.example.user.first.Story.Story.PlayerView.CStory_Player;
import com.example.user.first.Story.StoryList.View.CStoryListClient;
import com.example.user.first.UiSetting.CTextPosition;

public class CHome extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    TextView btnStory, btnEmotion, btnSetting, btn4, btn5;
    TextView nav_header_text;
    Button nav_header_btn;
    View nav_header_view;
    Toolbar toolbar;

    CTextPosition cTextPosition = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_home_layout);

        /**/
        btnStory = (TextView)findViewById(R.id.storybook);
        btnEmotion = (TextView)findViewById(R.id.emotion);
        btnSetting = (TextView)findViewById(R.id.setting);
        btn4 = (TextView)findViewById(R.id.btn4);
        btn5 = (TextView)findViewById(R.id.btn5);
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        /**/
        cTextPosition = new CTextPosition(btnStory, btnEmotion, btnSetting, btn4, btn5, this);

        /**/
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        nav_header_view = navigationView.getHeaderView(0);
        nav_header_text = (TextView)nav_header_view.findViewById(R.id.mytext);
        nav_header_btn = (Button)nav_header_view.findViewById(R.id.changetext);

        /**/
        nav_header_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                nav_header_text.setText("123");
            }
        });

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
            // Handle the camera action
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
