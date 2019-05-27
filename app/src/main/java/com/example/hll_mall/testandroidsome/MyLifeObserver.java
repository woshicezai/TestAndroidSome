package com.example.hll_mall.testandroidsome;

import android.arch.lifecycle.DefaultLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import android.util.Log;

public class MyLifeObserver implements DefaultLifecycleObserver {
    private Lifecycle mLifecycle;

    public MyLifeObserver() {
    }

    public MyLifeObserver(Lifecycle lifecycle) {
        mLifecycle = lifecycle;
    }

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        Log.d("MyLifeObserver", "onCreate");
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        Log.d("MyLifeObserver", "onStart");
    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        Log.d("MyLifeObserver", "onResume");
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        Log.d("MyLifeObserver", "onPause");
    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
        Log.d("MyLifeObserver", "onStop");
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        Log.d("MyLifeObserver", "onDestroy");
    }
}
