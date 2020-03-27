package com.kunminx.puremusic;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyPresenter implements IPresenter {
    private static final String TAG = "test";

    @Override
    public void onResume() {
        Log.d(TAG, "Lifecycle call onResume");
    }

    @Override
    public void onPause() {
        Log.d(TAG, "Lifecycle call onPause");
    }
}

interface IPresenter extends LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause();
}