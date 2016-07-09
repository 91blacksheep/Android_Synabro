package com.example.user.first.Lib;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.first.Story.StoryList.Lib.CStoryData;
import com.example.user.first.R;

import java.util.ArrayList;

/**
 * Created by KICT-15 on 2016-07-06.
 */
public class CListViewAdapter extends BaseAdapter
{
    //  Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<CStoryData> listViewItemList = new ArrayList<CStoryData>();

    //  ListViewAdapter의 생성자
    public CListViewAdapter()
    {

    }

    //  Adapter에 사용되는 데이터의 개수를 리턴 : 필수 구현
    @Override
    public int getCount()
    {
        return listViewItemList.size();
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴 : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.story_list_all, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.thumbnail) ;
        TextView titleTextView = (TextView) convertView.findViewById(R.id.titleText) ;
        TextView descTextView = (TextView) convertView.findViewById(R.id.exText) ;

        /* TODO */
        titleTextView.setSelected(true);
        descTextView.setSelected(true);


        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        CStoryData listViewItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        iconImageView.setImageDrawable(listViewItem.Get_m_thumbnail());
        titleTextView.setText(listViewItem.Get_m_title());
        descTextView.setText(listViewItem.Get_m_ex());

        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position)
    {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position)
    {
        return listViewItemList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(Drawable icon, String title, String desc)
    {
        CStoryData item = new CStoryData();

        item.Set_m_thumbnail(icon);
        item.Set_m_title(title);
        item.Set_m_ex(desc);
        /* TODO */

        listViewItemList.add(item);
    }
    /* TODO */

}
