package com.material.collections.activity.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.material.collections.R;
import com.material.collections.utils.Tools;

public class FabExtend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_extend);

        Tools.setSystemBarLight(this);
    }
}