package com.material.collections.activity.toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.material.collections.R;
import com.material.collections.utils.Tools;

import androidx.appcompat.app.AppCompatActivity;

public class ToolbarBottomBasic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_bottom_basic);

        BottomAppBar bottomAppBar = findViewById(R.id.bottomAppBar);
        setSupportActionBar(bottomAppBar);

        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Tools.setSystemBarLight(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search_setting, menu);
        return true;
    }
}