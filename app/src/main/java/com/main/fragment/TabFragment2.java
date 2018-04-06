package com.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.main.activity.R;
import com.main.utils.BaseFragment;

/**
 * 发现
 */

public class TabFragment2 extends BaseFragment {
    private View view;
    private TextView tv;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, null);

        Log.d("TabFragment2", "TabFragment2");
        initView();
        return view;
    }

    private void initView() {
        view.findViewById(R.id.select_city).setVisibility(View.INVISIBLE);
        view.findViewById(R.id.search_cars).setVisibility(View.INVISIBLE);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
