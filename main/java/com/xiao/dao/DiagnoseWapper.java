package com.xiao.dao;

import android.view.View;
import android.widget.TextView;

import com.xiao.dactorforeverybody.R;

/**
 * Created by Administrator on 2016/3/9.
 * 自我诊断界面的item
 */
public class DiagnoseWapper {
    private View view;
    private TextView tv_title,tv_introduce;

    public DiagnoseWapper(View view){
        this.view = view;
    }

    public TextView getTv_title(){
        if(tv_title==null){
            tv_title = (TextView)view.findViewById(R.id.diagnose_item_tv_title);
        }
        return tv_title;
    }

    public TextView getTv_introduce(){
        if(tv_introduce==null){
            tv_introduce = (TextView)view.findViewById(R.id.diagnose_item_tv_introduce);
        }
        return tv_introduce;
    }
}
