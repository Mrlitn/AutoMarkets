package com.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.main.activity.R;
import com.main.bean.CarsName;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Tab2 的适配器
 */

public class TabFragment2Adapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Integer> arrayList;
    private LayoutInflater inflater;

    private final int TYPE_ONE = 0;
    private final int TYPE_TWO = 1;
    private final int TYPE_THREE = 2;
    private int currentType;


    public TabFragment2Adapter(Context context, ArrayList<Integer> arrayList) {
        this.mContext = context;
        this.arrayList = arrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        int type = arrayList.get(position);

        switch (type) {
            case TYPE_ONE:
                return TYPE_ONE;

            case TYPE_TWO:
                return TYPE_TWO;

            case TYPE_THREE:
                return TYPE_THREE;

            default:
                return -1;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        currentType = getItemViewType(position);

        if (currentType == TYPE_ONE) {
            ViewHolderOne viewHolderOne;
            if (convertView == null) {
                viewHolderOne = new ViewHolderOne();
                convertView = inflater.inflate(R.layout.tab2_buytools, null);

                convertView.setTag(viewHolderOne);
            } else {
                viewHolderOne = (ViewHolderOne) convertView.getTag();
            }

        } else if (currentType == TYPE_TWO) {
            ViewHolderTwo viewHolderTwo;
            if (convertView == null) {
                viewHolderTwo = new ViewHolderTwo();
                convertView = inflater.inflate(R.layout.tab2_buyservice, null);

                convertView.setTag(viewHolderTwo);
            } else {
                viewHolderTwo = (ViewHolderTwo) convertView.getTag();
            }

        } else if (currentType == TYPE_THREE) {
            //上下轮播
            ViewHolderThree viewHolderThree;
            if (convertView == null) {
                viewHolderThree = new ViewHolderThree();
                convertView = inflater.inflate(R.layout.tab2_yours, null);

                convertView.setTag(viewHolderThree);
            } else {
                viewHolderThree = (ViewHolderThree) convertView.getTag();
            }

        }

        return convertView;
    }

     class ViewHolderOne {
        TextView ad_item;
    }

     class ViewHolderTwo {
        TextView type2_item, type2_item2;

    }

     class ViewHolderThree {

    }

}
