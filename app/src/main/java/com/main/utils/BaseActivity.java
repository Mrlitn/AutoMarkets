package com.main.utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

/**
 *
 */

public class BaseActivity extends FragmentActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onClick(View view) {

    }

    public void showToast(String txt) {
        Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
    }
}
