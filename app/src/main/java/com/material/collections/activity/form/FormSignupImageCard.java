package com.material.collections.activity.form;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Toast;

import com.material.collections.R;

public class FormSignupImageCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_signup_image_card);

        (findViewById(R.id.bt_create_account)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Create Account", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
