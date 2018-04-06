package com.main.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.main.base.BaseActivity;
import com.main.fragment.TabFragment1;
import com.main.fragment.TabFragment2;
import com.main.fragment.TabFragment3;

/**
 * 主页面
 */

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private Button tab1, tab2, tab3;

    private TabFragment1 fragment1;
    private TabFragment2 fragment2;
    private TabFragment3 fragment3;

    private Fragment[] fragments;
    private int index,currentTabIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initView();
        initFragment();
        initData();

    }

    private void initView() {
        tab1 = findViewById(R.id.main_tab1);
        tab2 = findViewById(R.id.main_tab2);
        tab3 = findViewById(R.id.main_tab3);

        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
        tab3.setOnClickListener(this);

    }

    private void initData() {

    }

    private void initFragment() {
        fragment1 = new TabFragment1();
        fragment2 = new TabFragment2();
        fragment3 = new TabFragment3();

        fragments = new Fragment[]{fragment1,fragment2,fragment3};

        getSupportFragmentManager().beginTransaction().add(R.id.main_layout,fragment1).show(fragment1).commit();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onClick(View view) {
        FragmentManager manager1 = getFragmentManager();
        FragmentTransaction transaction1 = manager1.beginTransaction();

        switch (view.getId()) {
            case R.id.main_tab1:
                break;

            case R.id.main_tab2:
                break;

            case R.id.main_tab3:

                break;

        }
        transaction1.commit();
    }

}
