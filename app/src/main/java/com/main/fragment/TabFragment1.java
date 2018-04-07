package com.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.main.activity.CitysName;
import com.main.activity.R;
import com.main.activity.SearchCars;
import com.main.utils.BaseFragment;

/**
 * 首页
 */

public class TabFragment1 extends BaseFragment {
    private View view;
    private TextView center_name, select_city, search_cars;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, null);

        Log.d("TabFragment1", "TabFragment1");
        initView();
        return view;
    }

    //Test
    private void initView() {
        center_name = view.findViewById(R.id.center_name);
        select_city = view.findViewById(R.id.select_city);
        search_cars = view.findViewById(R.id.search_cars);

        center_name.setText("车易行");

        select_city.setOnClickListener(this);
        search_cars.setOnClickListener(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        Intent intent = null;

        switch (view.getId()) {
            case R.id.select_city:
                intent = new Intent(getActivity(), CitysName.class);
                break;

            case R.id.search_cars:
                intent = new Intent(getActivity(), SearchCars.class);
                break;
        }
        startActivity(intent);
    }

}
