package com.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.main.activity.R;
import com.main.model.CarsName;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Tab1 的适配器
 */

public class TabFragment1Adapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Integer> arrayList;
    private LayoutInflater inflater;

    private List<CarsName> list;
    private List<Map<String, String>> car_item;
    private String title;

    private final int TYPE_ONE = 0;
    private final int TYPE_TWO = 1;
    private final int TYPE_THREE = 2;
    private final int TYPE_FOUR = 3;
    private final int TYPE_FIVE = 4;
    private int currentType;


    public TabFragment1Adapter(Context context, ArrayList<Integer> arrayList) {
        this.mContext = context;
        this.arrayList = arrayList;
        inflater = LayoutInflater.from(context);
        initData();
    }

    private void initData() {
        list = new ArrayList<>();
        car_item = new ArrayList<>();
        Map<String, String> a = new LinkedHashMap<>();
        a.put("aodi", "奥迪");
        a.put("mading", "阿斯顿马丁");
        a.put("aerfa", "阿尔法罗密欧");


        Map<String, String> b = new LinkedHashMap<>();
        a.put("bentian", "本田");
        a.put("bieke", "别克");
        a.put("baojun", "宝骏");
        a.put("baoma", "宝马");

        Map<String, String> c = new LinkedHashMap<>();
        a.put("changan", "长安轿车");
        a.put("changcheng", "长城");
        a.put("beiqichanghe", "北汽昌河");

        car_item.add(a);
        car_item.add(b);
        car_item.add(c);

        CarsName aa = new CarsName("A", car_item);
        CarsName bb = new CarsName("B", car_item);
        CarsName cc = new CarsName("C", car_item);

        list.add(aa);
        list.add(bb);
        list.add(cc);

    }

    @Override
    public int getCount() {
        return 5;
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

            case TYPE_FOUR:
                return TYPE_FOUR;

            case TYPE_FIVE:
                return TYPE_FIVE;

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
                convertView = inflater.inflate(R.layout.tab1_aditem, null);

                convertView.setTag(viewHolderOne);
            } else {
                viewHolderOne = (ViewHolderOne) convertView.getTag();
            }


        } else if (currentType == TYPE_TWO) {
            ViewHolderTwo viewHolderTwo;
            if (convertView == null) {
                viewHolderTwo = new ViewHolderTwo();
                convertView = inflater.inflate(R.layout.tab1_aditem2, null);

                convertView.setTag(viewHolderTwo);
            } else {
                viewHolderTwo = (ViewHolderTwo) convertView.getTag();
            }

        } else if (currentType == TYPE_THREE) {
            //上下轮播
            ViewHolderThree viewHolderThree;
            if (convertView == null) {
                viewHolderThree = new ViewHolderThree();
                convertView = inflater.inflate(R.layout.tab1_aditem3, null);

                convertView.setTag(viewHolderThree);
            } else {
                viewHolderThree = (ViewHolderThree) convertView.getTag();
            }


//            Intent intent = new Intent(mContext,);
//            mContext.startActivity();
        } else if (currentType == TYPE_FOUR) {
            //热门推荐
            ViewHolderFour viewHolderFour;
            if (convertView == null) {
                viewHolderFour = new ViewHolderFour();
                convertView = inflater.inflate(R.layout.tab1_aditem4, null);
                convertView.setTag(viewHolderFour);
            } else {
                viewHolderFour = (ViewHolderFour) convertView.getTag();
            }
        } else if (currentType == TYPE_FIVE) {
            //汽车品牌列表
            ViewHolderFive viewHolderFive;
            if (convertView == null) {
                viewHolderFive = new ViewHolderFive();
                convertView = inflater.inflate(R.layout.tab1_aditem5, null);
                viewHolderFive.car_char_num = convertView.findViewById(R.id.car_char_num);
                viewHolderFive.cars_listview = convertView.findViewById(R.id.cars_listview);

                convertView.setTag(viewHolderFive);
            } else {
                viewHolderFive = (ViewHolderFive) convertView.getTag();
            }

        }

        return convertView;
    }

    static class ViewHolderOne {
        TextView ad_item;
    }

    static class ViewHolderTwo {
        TextView type2_item, type2_item2;
    }

    static class ViewHolderThree {

    }

    static class ViewHolderFour {

    }

    static class ViewHolderFive {
        TextView car_char_num;
        ListView cars_listview;
    }

}
