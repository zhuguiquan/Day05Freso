package com.bw.day05freso;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * DateTime:2020/2/25 0025
 * author:朱贵全(Administrator)
 * function:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
