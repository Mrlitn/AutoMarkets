package com.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.main.activity.R;
import com.main.base.BaseFragment;

/**
 * 首页
 */

public class TabFragment1 extends BaseFragment {
    private View view;
    private TextView center_name;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, null);

        initView();
        return view;
    }

    private void initView() {
        center_name = view.findViewById(R.id.center_name);
        center_name.setText("车易行");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
