package com.example.user.first.UiSetting;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.first.Emotion.CEmotion_List;
import com.example.user.first.Home.CHome;
import com.example.user.first.R;
import com.example.user.first.Setting.CSetting_List;
import com.example.user.first.Story.Story.PlayerView.CStory_Player;
import com.example.user.first.Story.StoryList.View.CStoryListClient;

/**
 * Created by Administrator on 2016-07-21.
 */
public class ToolBarSetting extends TextPosition implements NavigationView.OnNavigationItemSelectedListener
{
    public void toolbar()
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Button change = (Button)findViewById(R.id.changetext);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

        TextView textView = (TextView)findViewById(R.id.mytext);
        Button change = (Button)findViewById(R.id.changetext);

        textView.setSelected(true);

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
