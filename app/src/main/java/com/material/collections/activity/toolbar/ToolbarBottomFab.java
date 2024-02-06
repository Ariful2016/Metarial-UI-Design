package com.material.collections.activity.toolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.material.collections.R;
import com.material.collections.utils.Tools;

public class ToolbarBottomFab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_bottom_fab);

        BottomAppBar bottomAppBar = findViewById(R.id.bottomAppBar);
        bottomAppBar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.amber_900), PorterDuff.Mode.SRC_ATOP);
        Tools.changeOverflowMenuIconColor(bottomAppBar, getResources().getColor(R.color.amber_900));
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
        Tools.changeMenuIconColor(menu, getResources().getColor(R.color.amber_900));
        return true;
    }
}