package com.material.collections.activity.card;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.material.collections.R;
import com.material.collections.utils.Tools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CardCheckable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_checkable);

        initToolbar();
        MaterialCardView card_1 = findViewById(R.id.card_1);
        MaterialCardView card_2 = findViewById(R.id.card_2);
        MaterialCardView card_3 = findViewById(R.id.card_3);
        card_2.setChecked(true);

        card_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                card_1.setChecked(!card_1.isChecked());
                return true;
            }
        });
        card_2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                card_2.setChecked(!card_2.isChecked());
                return true;
            }
        });
        card_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                card_3.setChecked(!card_3.isChecked());
                return true;
            }
        });
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Card Checked");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this);
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
}