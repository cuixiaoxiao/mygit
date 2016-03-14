package com.xiao.dao;

import android.view.View;
import android.widget.TextView;

import com.xiao.dactorforeverybody.R;

/**
 * Created by Administrator on 2016/3/8.
 * 首页中健康资讯
 */
public class HomeNewsWapper {
    private View view;
    private TextView tv_title,tv_introduce;
    public HomeNewsWapper(View view){
        this.view = view;
    }

    public TextView getTv_title(){
        if(tv_title==null){
            tv_title = (TextView)view.findViewById(R.id.home_helthnews_tv_title);
        }
        return tv_title;
    }

    public TextView getIv_introduce(){
        if(tv_introduce==null){
            tv_introduce = (TextView)view.findViewById(R.id.home_helthnews_tv_introduce);
        }
        return tv_introduce;
    }
}
