package com.xiao.dao;

import android.view.View;
import android.widget.TextView;

import com.xiao.dactorforeverybody.R;

/**
 * Created by Administrator on 2016/3/7.
 */
public class HomePlanWapper {
    private View view;
    private TextView tv_name,tv_type;
    public HomePlanWapper(View view){
        this.view = view;
    }

    public TextView getTv_name(){
        if(tv_name==null){
            tv_name = (TextView)view.findViewById(R.id.home_plan_item_tv_title);
        }
        return tv_name;
    }

    public TextView getTv_type(){
        if(tv_type==null){
            tv_type = (TextView)view.findViewById(R.id.home_plan_item_tv_type);
        }
        return tv_type;
    }
}
