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
    String type = null;

    CTalkGuideLine m_TalkGuideLine = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_player);

        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        type = intent.getStringExtra("type");

        /** Initializing YouTube player view **/
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(CDeveloperKey.DEVELOPER_KEY, this);

        /**/
        pager = (ViewPager) findViewById(R.id.pager);
        m_TalkGuideLine = new CTalkGuideLine();

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

    private class CTalkGuideLine
    {
        CTalkGuideLine_List list = null;

        public CTalkGuideLine()
        {
            SetGuidLine();
        }

        private void SetGuidLine()
        {
            if(type.equals("우울"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("우울");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("질투"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("질투");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("눈물"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("눈물");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("미워하는마음"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("미워하는마음");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("두려움"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("두려움");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("정서의형성"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("정서의형성");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("폭력"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("폭력");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("가족관계"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("가족관계");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("소리지르기"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("소리지르기");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("비속어사용"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("비속어사용");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("교우관계"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("교우관계");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("습관"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("습관");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("간식남용"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("간식남용");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }
            else if(type.equals("떼쓰기"))
            {
                list = new CTalkGuideLine_List(getLayoutInflater());

                list.addItem("떼쓰기");
                list.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
                list.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
                list.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
                list.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                        "기억 사탕들도 소중하고 섞이면서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
                list.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
            }

            pager.setAdapter(list);
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
