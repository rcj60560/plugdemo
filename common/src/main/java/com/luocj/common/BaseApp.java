package com.luocj.common;

import android.app.Application;

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("base : app");
    }
}
