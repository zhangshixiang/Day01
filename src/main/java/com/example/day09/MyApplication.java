package com.example.day09;

import android.app.Application;

import com.example.day09.Utils.ImageloaderUtil;


/**
 * Created by e531 on 2017/10/17.
 */
public class MyApplication  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ImageloaderUtil.initConfig(this);
    }
}
