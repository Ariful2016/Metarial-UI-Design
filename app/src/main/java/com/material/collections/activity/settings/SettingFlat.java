package com.material.collections.activity.settings;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.material.collections.R;
import com.material.collections.utils.Tools;

public class SettingFlat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_flat);
        Tools.setSystemBarColor(this, android.R.color.white);
        Tools.setSystemBarLight(this);
    }

}
