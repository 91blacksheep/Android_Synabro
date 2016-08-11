package com.example.user.first.Story.Story.PlayerView;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;

import com.example.user.first.Lib.CDeveloperKey;
import com.example.user.first.Loading.Parsing.Interface.CTalkGuideLine_List;
import com.example.user.first.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by KICT-15 on 2016-07-08.
 */
public class CStory_Player extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener
{
    ViewPager pager;
    String url = null;

    CTalkGuideLine_List adapter = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_player);

        Intent intent = getIntent();
        url = intent.getStringExtra("m_url");

        /** Initializing YouTube player view **/
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(CDeveloperKey.DEVELOPER_KEY, this);

        /**/
        pager = (ViewPager) findViewById(R.id.pager);

        adapter = new CTalkGuideLine_List(getLayoutInflater());
        pager.setAdapter(adapter);
    }

    public void onClickButton(View v)
    {
        switch(v.getId())
        {
            case R.id.btn_pre:
                int position = pager.getCurrentItem();
                pager.setCurrentItem(position - 1, true);
                break;
            case R.id.btn_next:
                int position2 = pager.getCurrentItem();
                pager.setCurrentItem(position2 + 1, true);
                break;
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result)
    {
        Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored)
    {
        /** add listeners to YouTubePlayer instance **/
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

        /** Start buffering **/
        if (!wasRestored)
        {
            //player.cueVideo(url);
            player.cueVideo("i1jSCpo1Vq0");
        }
    }

    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener()
    {
        @Override
        public void onBuffering(boolean arg0)
        {
        }

        @Override
        public void onPaused()
        {
        }

        @Override
        public void onPlaying()
        {
        }

        @Override
        public void onSeekTo(int arg0)
        {
        }

        @Override
        public void onStopped()
        {
        }
    };

    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener()
    {
        @Override
        public void onAdStarted()
        {
        }

        @Override
        public void onError(YouTubePlayer.ErrorReason arg0)
        {
        }

        @Override
        public void onLoaded(String arg0)
        {
        }

        @Override
        public void onLoading()
        {
        }

        @Override
        public void onVideoEnded()
        {
        }

        @Override
        public void onVideoStarted()
        {
        }
    };
}
