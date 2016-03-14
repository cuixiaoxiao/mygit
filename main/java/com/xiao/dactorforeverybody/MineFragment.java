package com.xiao.dactorforeverybody;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.xiao.view.MyInformationLlayout;

/**
 * Created by Administrator on 2016/2/25.
 */
public class MineFragment extends Fragment {
    private Button btn_dossier,btn_calendar,btn_message;
    private MyInformationLlayout llayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mine,null);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //关联控件
        btn_dossier = (Button)view.findViewById(R.id.mine_btn_dossier);
        btn_calendar = (Button)view.findViewById(R.id.mine_btn_calendar);
        btn_message = (Button)view.findViewById(R.id.mine_btn_message);
        llayout = (MyInformationLlayout)view.findViewById(R.id.mine_llayout_head);

        /*
        *
        * 点击跳转到消息列表界面
        *
        * */
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.MessageActivity.action");
                startActivity(intent);
            }
        });

        /*
        *
        *
        * 点击头像跳转到修改信息界面
        *
        * */
        llayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.OwnInforActivity.action");
                startActivity(intent);
            }
        });

        //点击跳转到日历界面(调用日历)
        btn_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.android.calendar","com.android.calendar.LaunchActivity"));
                startActivity(intent);
            }
        });


        //点击跳转到病例列表界面
        btn_dossier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.DossierActivity.action");
                startActivity(intent);
            }
        });
    }
}
