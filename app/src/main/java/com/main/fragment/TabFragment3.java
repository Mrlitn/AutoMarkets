package com.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.main.activity.R;
import com.main.utils.BaseFragment;

/**
 * 发现
 */

public class TabFragment3 extends BaseFragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment3, null);

        Log.d("TabFragment3", "TabFragment3");
        initView();
        return view;
    }

    private void initView() {

    }

}
