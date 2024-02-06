package com.material.collections.activity.toolbar;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.Snackbar;
import com.material.collections.R;
import com.material.collections.adapter.AdapterListNews;
import com.material.collections.data.DataGenerator;
import com.material.collections.model.News;
import com.material.collections.utils.Tools;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ToolbarBottomScroll extends AppCompatActivity {

    private View parent_view;

    private RecyclerView recyclerView;
    private AdapterListNews mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_bottom_scroll);

        parent_view = findViewById(android.R.id.content);

        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);

        initComponent();
    }

    private void initComponent() {
        BottomAppBar bottomAppBar = findViewById(R.id.bottomAppBar);
        bottomAppBar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);
        Tools.changeOverflowMenuIconColor(bottomAppBar, getResources().getColor(R.color.colorPrimary));
        setSupportActionBar(bottomAppBar);

        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        List<News> items = DataGenerator.getNewsData(this, 10);

        //set data and list adapter
        mAdapter = new AdapterListNews(this, items, R.layout.item_news_card);
        recyclerView.setAdapter(mAdapter);

        // on item list clicked
        mAdapter.setOnItemClickListener(new AdapterListNews.OnItemClickListener() {
            @Override
            public void onItemClick(View view, News obj, int position) {
                Snackbar.make(parent_view, "Item " + obj.title + " clicked", Snackbar.LENGTH_SHORT).show();
            }
        });

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
        Tools.changeMenuIconColor(menu, getResources().getColor(R.color.colorPrimary));
        return true;
    }
}