package com.main.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.main.utils.BaseActivity;
import com.main.fragment.TabFragment1;
import com.main.fragment.TabFragment2;
import com.main.fragment.TabFragment3;

/**
 * 主页面
 */

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Button tab1, tab2, tab3;

    private TabFragment1 tabFragment1;
    private TabFragment2 tabFragment2;
    private TabFragment3 tabFragment3;
    private Fragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initView();
        initFragment();

    }

    private void initFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        tabFragment1 = new TabFragment1();
        tabFragment2 = new TabFragment2();
        tabFragment3 = new TabFragment3();
        fragments = new Fragment[]{tabFragment1, tabFragment2, tabFragment3};

        transaction.add(R.id.main_layout, fragments[0], "tab1").commit();

    }

    private void initView() {
        tab1 = findViewById(R.id.main_tab1);
        tab2 = findViewById(R.id.main_tab2);
        tab3 = findViewById(R.id.main_tab3);

        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
        tab3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        FragmentManager manager1 = getSupportFragmentManager();
        FragmentTransaction transaction1 = manager1.beginTransaction();

        switch (view.getId()) {

            case R.id.main_tab1:
                transaction1.replace(R.id.main_layout, fragments[0]);
                break;

            case R.id.main_tab2:
                transaction1.replace(R.id.main_layout, fragments[1]);
                break;

            case R.id.main_tab3:
                transaction1.replace(R.id.main_layout, fragments[2]);
                break;
        }

        transaction1.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }


}
