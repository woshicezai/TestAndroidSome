package com.example.hll_mall.testandroidsome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String ceshi3;
    protected String ceshi2;
    @InjectView(id = R.id.txt_title)
    TextView mTitle;
    private String ceshi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectViewParser.inject(this);
        mTitle.setText("注入成功");
    }
}
