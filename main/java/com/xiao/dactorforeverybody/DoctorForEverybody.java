package com.xiao.dactorforeverybody;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class DoctorForEverybody extends FragmentActivity {
    private FragmentTabHost fragmentTabHost;
    private HomepageFregment homepageFregment = new HomepageFregment();
    private InquiryFragment inquiryFragment = new InquiryFragment();
    private HealthmallFragment healthmallFragment = new HealthmallFragment();
    private MineFragment mineFragment = new MineFragment();
    //布局填充器
    private LayoutInflater mLayoutInflater;
    //存放Fragment界面的数组
    private Class mFragmentArray[] = {HomepageFregment.class,InquiryFragment.class,HealthmallFragment.class,MineFragment.class};
    //存放图片位置的数组
    private int mImgArray[] = {R.drawable.homepage_btn,R.drawable.inquiry_btn,R.drawable.healthmall_item,R.drawable.mine_btn};
    //存放选项卡文字的数组
    private String mTextArray[] = {"首页","问诊","商城","我的"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Init();


        //四个fragment的添加
        //给每个图标设置图片和文字
        fragmentTabHost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);
        for(int i=0;i<4;i++){
            TabHost.TabSpec tabSpec = fragmentTabHost.newTabSpec(mTextArray[i]).setIndicator(getTabItemView(i));
            //将tab按钮添加到Tab选项卡中
            fragmentTabHost.addTab(tabSpec,mFragmentArray[i],null);
            //去掉底部分割线
            fragmentTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        }
    }

    //添加底部标签的格式
    private View getTabItemView(int i){
        View view = mLayoutInflater.inflate(R.layout.main_tab_item,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.main_tab_item_iv);
        imageView.setImageResource(mImgArray[i]);
        TextView textView = (TextView)view.findViewById(R.id.main_tab_item_tv);
        textView.setText(mTextArray[i]);
        return view;
    }
    //关联
    private void Init(){
        fragmentTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mLayoutInflater = LayoutInflater.from(this);
    }

}
