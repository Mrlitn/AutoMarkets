package com.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.main.activity.CitysName;
import com.main.activity.R;
import com.main.activity.SearchCars;
import com.main.adapter.TabFragment1Adapter;
import com.main.utils.BaseFragment;

import java.util.ArrayList;

/**
 * 首页
 */

public class TabFragment1 extends BaseFragment {
    private View view;
    private TextView center_name, select_city, search_cars;

    private PullToRefreshListView pull_listview;
    private ListView listView;
    private TabFragment1Adapter adapter;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, null);

        initView();
        initRefreshListView();

        return view;
    }

    //
    private void initRefreshListView() {
        pull_listview = view.findViewById(R.id.pull_listview);
        pull_listview.setMode(PullToRefreshBase.Mode.PULL_FROM_START);

        //下拉刷新
        pull_listview.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {

            }
        });

        listView = pull_listview.getRefreshableView();
        listView.setDividerHeight(0);

        for (int i = 0; i < 6; i++) {
            arrayList.add(i);
        }

        adapter = new TabFragment1Adapter(getActivity(), arrayList);
        listView.setAdapter(adapter);

    }

    //
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
