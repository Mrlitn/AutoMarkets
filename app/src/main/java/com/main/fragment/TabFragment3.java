package com.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.main.activity.R;
import com.main.base.BaseFragment;

/**
 * 我的
 */

public class TabFragment3 extends BaseFragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment3, null);
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
