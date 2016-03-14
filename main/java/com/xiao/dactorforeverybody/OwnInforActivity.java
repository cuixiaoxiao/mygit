package com.xiao.dactorforeverybody;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.xiao.com.xiao.bean.OwnInfor;
import com.xiao.dao.OwnInforAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/10.
 * 个人信息界面（我的界面中点击头像跳转到的界面）
 */
public class OwnInforActivity extends Activity {
    private ListView listView;
    private Button btn_back;
    private List<OwnInfor> list = new ArrayList<OwnInfor>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.own_information);
        Init();

        /*
        *
        * 点击返回键，跳转到“我的”界面
        *
        * */
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        //添加适配器
        listView.setAdapter(new OwnInforAdapter(OwnInforActivity.this,list));
    }

    private void Init(){
        listView = (ListView)findViewById(R.id.own_information_listview);
        btn_back = (Button)findViewById(R.id.own_information_btn_back);
        list.add(new OwnInfor("头像","头像"));
        list.add(new OwnInfor("昵称","张三"));
        list.add(new OwnInfor("性别","男"));
    }
}
