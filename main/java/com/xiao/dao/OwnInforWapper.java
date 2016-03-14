package com.xiao.dao;

import android.view.View;
import android.widget.TextView;

import com.xiao.dactorforeverybody.R;

/**
 * Created by Administrator on 2016/3/10.
 */
public class OwnInforWapper {
    private View view;
    private TextView tv_type,ty_content;

    public OwnInforWapper(View view){
        this.view = view;
    }

    public TextView getTv_type(){
        if(tv_type==null){
            tv_type = (TextView)view.findViewById(R.id.own_infor_item_tv_type);
        }
        return tv_type;
    }

    public TextView getTy_content(){
        if(ty_content==null){
            ty_content = (TextView)view.findViewById(R.id.own_infor_item_tv_content);
        }
        return ty_content;
    }
}
