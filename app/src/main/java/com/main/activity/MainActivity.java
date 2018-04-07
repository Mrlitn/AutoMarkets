package com.main.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.main.utils.BaseActivity;
import com.main.fragment.TabFragment1;
import com.main.fragment.TabFragment2;
import com.main.fragment.TabFragment3;

/**
 * 主页面
 */

public class MainActivity extends BaseActivity {
    private Button tab1, tab2, tab3;

    private TabFragment1 tabFragment1;
    private TabFragment2 tabFragment2;
    private TabFragment3 tabFragment3;
    private Fragment[] fragments;

    private int index, currentIndex;
    private static boolean isExit = false;

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initView();
        initFragment();

    }

    private void initFragment() {
        tabFragment1 = new TabFragment1();
        tabFragment2 = new TabFragment2();
        tabFragment3 = new TabFragment3();
        fragments = new Fragment[]{tabFragment1, tabFragment2, tabFragment3};

        getSupportFragmentManager().beginTransaction().add(R.id.main_layout, fragments[0], "tab1").show(fragments[0]).commit();

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

        switch (view.getId()) {
            case R.id.main_tab1:
                index = 0;
                break;

            case R.id.main_tab2:
                index = 1;
                break;

            case R.id.main_tab3:
                index = 2;
                break;

        }

        showFragments();
    }

    //切换底部按钮
    private void showFragments() {
        if (currentIndex != index) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.hide(fragments[currentIndex]);
            if (!fragments[index].isAdded()) {
                transaction.add(R.id.main_layout, fragments[index]);
            }
            transaction.show(fragments[index]).commitAllowingStateLoss();
        }
        currentIndex = index;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitApp();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exitApp() {
        if (!isExit) {
            isExit = true;
            super.showToast("再按一次退出车易行");
            mHandler.sendEmptyMessageDelayed(0, 2000);
        } else {
            finish();
            System.exit(0);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}
