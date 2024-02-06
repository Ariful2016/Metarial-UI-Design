package com.material.collections.activity.verification;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.material.collections.R;
import com.material.collections.utils.Tools;

public class VerificationPhone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_phone);
        Tools.setSystemBarColor(this, R.color.grey_20);
    }
}
