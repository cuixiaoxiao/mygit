package com.xiao.com.xiao.util;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/3/1.
 */
public class Utility {
    public static void setListViewHeightBaseOnChildren(ListView listview)
    {
        //获取listview相应的adapter
        ListAdapter listAdapter = listview.getAdapter();
        if(listAdapter==null){
            return;
        }

        //存放所有item的总高度
        int totalHeight = 0;
        //获取数据源的长度
        int len = len=listAdapter.getCount();

        for(int i=0;i<len;i++){
            //得到listview中相应位置的item视图（布局）
        View listItem = listAdapter.getView(i,null,listview);
            //设置单个item的高度
        listItem.measure(0,0);
            //累加每个item的高度（即所有item的高度）
        totalHeight+=listItem.getMeasuredHeight();
    }

        //获得viewgroup中单个视图（可理解为获得LinearLayout中的textview）
        ViewGroup.LayoutParams params = listview.getLayoutParams();
        //listview.getDivideHeight是获得两个item之间的间距
        //item的长度+间距长度=listview的总长度
        params.height = totalHeight+(listview.getDividerHeight()*(listAdapter.getCount()-1));
        //将相应的params添加到listview中
        listview.setLayoutParams(params);
    }
}
