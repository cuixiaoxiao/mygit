package com.xiao.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xiao.dactorforeverybody.R;

/**
 * Created by Administrator on 2016/3/9.
 */
public class MyInformationLlayout extends LinearLayout {
    private Context context;
    private TextView tv_name,tv_introduce;
    public MyInformationLlayout(Context context) {
        super(context);
        Init(context);
    }

    public MyInformationLlayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        Init(context);
    }

    public MyInformationLlayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Init(context);

    }

   private void Init(Context context){
       LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       inflater.inflate(R.layout.mine_llayout, this);
       tv_name = (TextView)findViewById(R.id.mine_llayout_tv_name);
       tv_introduce = (TextView)findViewById(R.id.mine_llayout_tv_introduce);
   }

    //给昵称赋值
    public void setUserName(String str){
        tv_name.setText(str+"");
    }

    //给introduce赋值
    public void setUserIntroduce(String str){
        tv_introduce.setText(str+"");
    }
}
