package com.example.user.first.Story.Story.PlayerView;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
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

        pager = (ViewPager) findViewById(R.id.pager);

        //ViewPager에 설정할 Adapter 객체 생성
        //ListView에서 사용하는 Adapter와 같은 역할.
        //다만. ViewPager로 스크롤 될 수 있도록 되어 있다는 것이 다름
        //PagerAdapter를 상속받은 CustomAdapter 객체 생성
        //CustomAdapter에게 LayoutInflater 객체 전달
        CTalkGuideLine_List adapter = new CTalkGuideLine_List(getLayoutInflater());

        //ViewPager에 Adapter 설정
        pager.setAdapter(adapter);

        Button btnPre = (Button) findViewById(R.id.btn_pre);
        if (btnPre != null)
        {
            btnPre.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    int position = pager.getCurrentItem();//현재 보여지는 아이템의 위치를 리턴

                    //현재 위치(position)에서 -1 을 해서 이전 position으로 변경
                    //이전 Item으로 현재의 아이템 변경 설정(가장 처음이면 더이상 이동하지 않음)
                    //첫번째 파라미터: 설정할 현재 위치
                    //두번째 파라미터: 변경할 때 부드럽게 이동하는가? false면 팍팍 바뀜
                    pager.setCurrentItem(position - 1, true);
                }
            });
        }
        Button btnNext = (Button) findViewById(R.id.btn_next);
        if (btnNext != null)
        {
            btnNext.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    int position = pager.getCurrentItem();//현재 보여지는 아이템의 위치를 리턴

                    //현재 위치(position)에서 -1 을 해서 이전 position으로 변경
                    //이전 Item으로 현재의 아이템 변경 설정(가장 처음이면 더이상 이동하지 않음)
                    //첫번째 파라미터: 설정할 현재 위치
                    //두번째 파라미터: 변경할 때 부드럽게 이동하는가? false면 팍팍 바뀜
                    pager.setCurrentItem(position + 1, true);
                }
            });
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
            //player.cueVideo(url);i1jSCpo1Vq0
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
