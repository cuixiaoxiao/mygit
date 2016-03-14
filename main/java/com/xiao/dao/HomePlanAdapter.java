package com.xiao.dao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xiao.com.xiao.bean.HelthPlan;
import com.xiao.dactorforeverybody.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/7.
 */
public class HomePlanAdapter extends BaseAdapter {
    private List<HelthPlan> list = new ArrayList<HelthPlan>();
    private Context context;
    private HomePlanWapper wapper;
    private TextView tv_title,tv_type;

    public HomePlanAdapter(Context context, List<HelthPlan> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.home_plan_item,parent,false);
            wapper = new HomePlanWapper(view);
            view.setTag(wapper);
        }
        wapper = (HomePlanWapper)view.getTag();

        tv_title = wapper.getTv_name();
        tv_type = wapper.getTv_type();

        tv_type.setText(list.get(position).getPlan_type()+"");
        tv_title.setText(list.get(position).getPlan_name()+"");

        return view;
    }
}
