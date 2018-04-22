package com.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.main.activity.R;
import com.main.adapter.TabFragment2Adapter;
import com.main.utils.BaseFragment;

import java.util.ArrayList;

/**
 * 发现
 */

public class TabFragment2 extends BaseFragment {
    private View view;

    private TabFragment2Adapter adapter;
    private PullToRefreshListView pull2_listview;
    private ListView listView2;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, null);

        initView();
        return view;

    }

    private void initView() {
        view.findViewById(R.id.select_city).setVisibility(View.INVISIBLE);
        view.findViewById(R.id.search_cars).setVisibility(View.INVISIBLE);

        pull2_listview = view.findViewById(R.id.pull2_listview);
        pull2_listview.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
        listView2 = pull2_listview.getRefreshableView();
        listView2.setDividerHeight(0);

        for (int i = 0; i < 4; i++) {
            arrayList.add(i);
        }

        adapter = new TabFragment2Adapter(getActivity(), arrayList);
        listView2.setAdapter(adapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

}
