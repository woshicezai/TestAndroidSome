package com.example.hll_mall.testandroidsome;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @InjectView(id = R.id.txt_title)
    TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLifeObserver myLifeObserver = new MyLifeObserver();
        getLifecycle().addObserver(myLifeObserver);
        InjectViewParser.inject(this);
        mTitle.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        LifecycleOwner lifecycleOwner = this;
    }



}
