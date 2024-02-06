package com.material.collections.activity.slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.material.collections.R;
import com.material.collections.utils.Tools;

public class SliderRange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_range);
        initToolbar();
    }


    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Range Seekbar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this);
    }

}