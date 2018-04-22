package com.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.main.activity.AboutUs;
import com.main.activity.CarHistory;
import com.main.activity.MyInfo;
import com.main.activity.R;
import com.main.activity.UserFeedback;
import com.main.utils.BaseFragment;

/**
 * 我的
 */

public class TabFragment3 extends BaseFragment {
    private View view;
    private TextView myinfo, buycity, carhistory, userfeedback, clearcache, joinus, aboutus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment3, null);

        initView();
        return view;

    }

    private void initView() {
        myinfo = view.findViewById(R.id.myinfo);
        buycity = view.findViewById(R.id.buycity);
        carhistory = view.findViewById(R.id.carhistory);
        userfeedback = view.findViewById(R.id.userfeedback);
        clearcache = view.findViewById(R.id.clearcache);
        joinus = view.findViewById(R.id.joinus);
        aboutus = view.findViewById(R.id.aboutus);

        myinfo.setOnClickListener(this);
        buycity.setOnClickListener(this);
        carhistory.setOnClickListener(this);
        userfeedback.setOnClickListener(this);
        clearcache.setOnClickListener(this);
        joinus.setOnClickListener(this);
        aboutus.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        Intent intent = null;

        switch (view.getId()) {
            case R.id.myinfo:
                intent = new Intent(getActivity(), MyInfo.class);
                startActivity(intent);
                break;

            case R.id.buycity:
//                intent = new Intent(getActivity(), );
//        startActivity(intent);
                break;

            case R.id.carhistory:
                intent = new Intent(getActivity(), CarHistory.class);
                startActivity(intent);
                break;

            case R.id.userfeedback:
                intent = new Intent(getActivity(), UserFeedback.class);
                startActivity(intent);
                break;

            case R.id.clearcache:
                clearCache();
                break;

            case R.id.joinus:
                intent = new Intent(getActivity(), AboutUs.class);
                startActivity(intent);
                break;

            case R.id.aboutus:
                intent = new Intent(getActivity(), AboutUs.class);
                startActivity(intent);
                break;
        }
    }

    //清除缓存
    private void clearCache() {

    }

}
