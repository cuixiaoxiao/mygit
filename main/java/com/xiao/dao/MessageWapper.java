package com.xiao.dao;

import android.view.View;
import android.widget.TextView;

import com.xiao.dactorforeverybody.R;

/**
 * Created by Administrator on 2016/3/7.
 */
public class MessageWapper {

    private TextView tv_name,tv_message;
    private View view;
    public MessageWapper(View view){
        this.view = view;
    }

    public TextView getTv_name(){
        if(tv_name==null){
            tv_name = (TextView)view.findViewById(R.id.message_item_tv_name);
        }
        return tv_name;
    }

    public TextView getTv_message(){
        if(tv_message==null){
            tv_message = (TextView)view.findViewById(R.id.message_item_tv_message);
        }
        return tv_message;
    }
}
