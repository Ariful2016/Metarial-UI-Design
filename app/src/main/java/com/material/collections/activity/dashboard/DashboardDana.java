package com.material.collections.activity.dashboard;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.material.collections.R;
import com.material.collections.utils.Tools;

public class DashboardDana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_dana);
        initToolbar();
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.blue_500);
    }
}
