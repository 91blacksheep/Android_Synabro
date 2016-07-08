package com.example.user.first.List;

import android.graphics.drawable.Drawable;

/**
 * Created by KICT-15 on 2016-07-05.
 */
public class CStory_Data
{
    private Drawable m_thumbnail;
    private String m_title;
    private String m_ex;
    private String m_url;
    private String m_group;
    private String m_type;

    public CStory_Data()
    {

    }

    public CStory_Data(Drawable thumbnail, String title, String ex, String url, String group, String type)
    {
        this.m_thumbnail = thumbnail;
        this.m_title = title;
        this.m_ex = ex;
        this.m_url = url;
        this.m_group = group;
        this.m_type = type;
    }

    public Drawable Get_m_thumbnail()
    {
        return this.m_thumbnail;
    }
    public void Set_m_thumbnail(Drawable m_thumbnail)
    {
        this.m_thumbnail = m_thumbnail;
    }

    public String Get_m_title()
    {
        return this.m_title;
    }
    public void Set_m_title(String m_title)
    {
        this.m_title = m_title;
    }

    public String Get_m_ex()
    {
        return this.m_ex;
    }
    public void Set_m_ex(String m_ex)
    {
        this.m_ex = m_ex;
    }

    public String Get_m_url()
    {
        return this.m_url;
    }
    public void Set_m_url(String m_url)
    {
        this.m_url = m_url;
    }

    public String Get_m_group()
    {
        return this.m_group;
    }
    public void Set_m_group(String m_group)
    {
        this.m_group = m_group;
    }

    public String Get_m_type()
    {
        return this.m_type;
    }
    public void Set_m_type(String m_type)
    {
        this.m_type = m_type;
    }
}