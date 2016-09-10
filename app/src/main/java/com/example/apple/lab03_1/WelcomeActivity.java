package com.example.apple.lab03_1;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class WelcomeActivity extends AppCompatActivity {

    private Button btNext, btSkip;
    private SmartTabLayout indicator;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btNext = (Button) findViewById(R.id.btNext);
        btSkip = (Button) findViewById(R.id.btSkip);
    }
}
