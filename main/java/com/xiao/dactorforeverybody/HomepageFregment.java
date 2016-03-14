package com.xiao.dactorforeverybody;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.xiao.com.xiao.bean.HelthNews;
import com.xiao.com.xiao.bean.HelthPlan;
import com.xiao.com.xiao.util.Utility;
import com.xiao.dao.HomeNewsAdapter;
import com.xiao.dao.HomePlanAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/25.
 */
  //首页
public class HomepageFregment extends Fragment{
    private Button btn_message,btn_clock,btn_create,btn_diagnose;
    private ListView lv_plan,lv_news;
    private List<HelthPlan> list_plan = new ArrayList<HelthPlan>();
    //存放健康资讯
    private List<HelthNews> list_news = new ArrayList<HelthNews>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homepage,null);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_message = (Button)view.findViewById(R.id.homepage_btn_message);
        btn_clock = (Button)view.findViewById(R.id.home_btn_clock);
        btn_create = (Button)view.findViewById(R.id.home_btn_create_dossier);
        btn_diagnose = (Button)view.findViewById(R.id.home_btn_diagnose);
        lv_plan = (ListView)view.findViewById(R.id.homepage_listview_plan);

        if(list_plan.size()==0){
            list_plan.add(new HelthPlan("称体重","健身","未完成","2016-3-7","俯卧撑"));
            list_plan.add(new HelthPlan("健身计划","健身","未完成","2016-3-7","俯卧撑"));
            list_plan.add(new HelthPlan("健身计划", "健身", "未完成", "2016-3-7", "俯卧撑"));
            list_plan.add(new HelthPlan("健身计划", "健身", "未完成", "2016-3-7", "俯卧撑"));
        }
        //存放健康资讯的listview
        lv_news = (ListView)view.findViewById(R.id.homepage_listview_news);
        if(list_news.size()==0){
            list_news.add(new HelthNews("跑步姿势不对=毁身体！","1.全脚掌着地；" +
                    "2.脚尖着地；3.内外八字脚","注意啦，4种错误的跑步姿势会影响身材"));
            list_news.add(new HelthNews("跑步姿势不对=毁身体！","1.全脚掌着地；" +
                    "2.脚尖着地；3.内外八字脚","注意啦，4种错误的跑步姿势会影响身材"));
            list_news.add(new HelthNews("跑步姿势不对=毁身体！","1.全脚掌着地；" +
                    "2.脚尖着地；3.内外八字脚","注意啦，4种错误的跑步姿势会影响身材"));
        }



        /*
        *
        * 点击进入自我诊断界面
        *
        * */
        btn_diagnose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.DiagnoseActivity.action");
                startActivity(intent);
            }
        });


        /*//点击消息，进入消息列表界面
        *
        * */
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.MessageActivity.action");
                startActivity(intent);
            }
        });


        /*//点击跳转到闹钟界面
        *
        *
        * */
        btn_clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.xiao.com.xiao.util.StartClock.action");
                startActivity(intent);
            }
        });


        /*
        *
        * 点击创建病例，进入病例创建界面
        *
        * */
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.AddDossierActivity.action");
                startActivity(intent);
            }
        });

        /*//健康计划
        *
        *
        * */
        //添加适配器
        lv_plan.setAdapter(new HomePlanAdapter(getActivity(), list_plan));
        Utility.setListViewHeightBaseOnChildren(lv_plan);
        //点击跳转到计划详情界面
        lv_plan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent("android.PlanInformationActivity.action");
                startActivity(intent);
            }
        });


        /*//健康资讯，添加适配器
        *
        * */
        lv_news.setAdapter(new HomeNewsAdapter(getActivity(),list_news));
        Utility.setListViewHeightBaseOnChildren(lv_news);
        //点击资讯跳转到详细信息界面
        lv_news.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent("android.HelthNewsInformationActivity.action");
                startActivity(intent);
            }
        });

    }


}

