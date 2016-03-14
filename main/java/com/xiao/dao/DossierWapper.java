package com.xiao.dao;

import android.view.View;
import android.widget.TextView;

import com.xiao.dactorforeverybody.R;

/**
 * Created by Administrator on 2016/3/1.
 */
public class DossierWapper {
    private View view;
    private TextView tv_time,tv_hospital;
    public DossierWapper(View view){
        this.view = view;
    }

    public TextView getTv_time(){
        if(tv_time==null){
            tv_time = (TextView)view.findViewById(R.id.dossier_item_tv_time);
        }
        return tv_time;
    }

    public TextView getTv_hospital(){
        if(tv_hospital==null){
            tv_hospital = (TextView)view.findViewById(R.id.dossier_item_tv_hospital);
        }
        return tv_hospital;
    }
}
