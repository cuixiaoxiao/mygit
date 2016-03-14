package com.xiao.dao;

import android.view.View;
import android.widget.TextView;

import com.xiao.dactorforeverybody.R;

/**
 * Created by Administrator on 2016/3/4.
 */
public class InquiryRecentDoctorWapper {
    private View view;
    private TextView tv_name,tv_hospital,tv_title,tv_section;
    public InquiryRecentDoctorWapper(View view){
        this.view = view;
    }

    public TextView getTv_name(){
        if(tv_name==null){
            tv_name = (TextView)view.findViewById(R.id.inquiry_recentdoctor_item_tv_name);
        }
        return tv_name;
    }

    public TextView getTv_hospital(){
        if(tv_hospital==null){
            tv_hospital = (TextView)view.findViewById(R.id.inquiry_recentdoctor_item_tv_hospital);
        }
        return tv_hospital;
    }

    public TextView getTv_title(){
        if(tv_title==null){
            tv_title = (TextView)view.findViewById(R.id.inquiry_recentdoctor_item_tv_title);
        }
        return tv_title;
    }

    public TextView getTv_section(){
        if(tv_section==null){
            tv_section = (TextView)view.findViewById(R.id.inquiry_recentdoctor_item_tv_section);
        }
        return tv_section;
    }
}
