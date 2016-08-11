package com.example.user.first.Lib;

import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by USER on 2016-08-11.
 */
public class CFileHelper
{
    private static CFileHelper current = null;

    public static CFileHelper getInstance()
    {
        if(current == null)
        {
            current = new CFileHelper();
        }
        return current;
    }

    public static void freeInstance()
    {
        current = null;
    }

    private CFileHelper()
    {
        super();
    }

    public boolean Write(String filePath, byte[] data)
    {
        boolean result = false;
        FileOutputStream out = null;

        try
        {
            out = new FileOutputStream(filePath);
            out.write(data);
            result = true;

            out.close();
        }
        catch (FileNotFoundException e)
        {
            Log.d("[ERROR", "지정된 경로를 찾을 수 없음 >>" + filePath);
            e.printStackTrace();
        }
        catch(IOException e) {}

        return result;
    }

    public boolean WriteString(String filePath, String content, String encType)
    {
        boolean result = false;
        byte[] data = null;

        try
        {
            data = content.getBytes(encType);
            result = this.Write(filePath, data);
        }
        catch (IOException e){}

        return result;
    }

    public byte[] Read(String filePath)
    {
        byte[] data = null;
        InputStream in = null;

        try
        {
            in = new FileInputStream(filePath);
            data = new byte[in.available()];
            in.read(data);

            in.close();
        }
        catch(IOException e) {}

        return data;
    }

    public String readString(String filePath, String encType)
    {
        String content = null;
        byte[] data = this.Read(filePath);

        try
        {
            content = new String(data, encType);
            content = content.trim();
        }
        catch (IOException e) {}

        return content;
    }
}
