package com.main.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.main.utils.BaseActivity;
import com.main.fragment.TabFragment1;
import com.main.fragment.TabFragment2;
import com.main.fragment.TabFragment3;
import com.main.views.SlideBarIndex;

import java.util.ArrayList;

/**
 * 主页面
 */

public class MainActivity extends BaseActivity {
    private Button tab1, tab2, tab3;

    private SlideBarIndex char_num;
    private TextView char_num_show;

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

        char_num_show = findViewById(R.id.char_num_show);
        char_num = findViewById(R.id.char_num);
        char_num.setOnTouchLetterChangeListenner(new SlideBarIndex.OnTouchLetterChangeListenner() {
            @Override
            public void onTouchLetterChange(boolean isTouched, String num) {
                if (isTouched) {
                    //这个是显示字母
                    char_num_show.setVisibility(View.VISIBLE);
                    char_num_show.setText(num);
                } else {
                    char_num_show.setVisibility(View.GONE);
                }
            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.main_tab1:
                index = 0;
                char_num.setVisibility(View.VISIBLE);
                break;

            case R.id.main_tab2:
                index = 1;
                char_num.setVisibility(View.INVISIBLE);
                break;

            case R.id.main_tab3:
                index = 2;
                char_num.setVisibility(View.INVISIBLE);
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
        mHandler.removeCallbacksAndMessages(null);
    }

}
