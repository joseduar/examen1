package com.example.ana.todojose.database;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by ANA on 05/02/2018.
 */

public class TodoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
