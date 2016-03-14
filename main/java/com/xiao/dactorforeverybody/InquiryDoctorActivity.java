package com.xiao.dactorforeverybody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.xiao.com.xiao.bean.Doctor;
import com.xiao.dao.InquiryDoctorAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/3.
 * 问诊，搜索医生界面
 */
public class InquiryDoctorActivity extends Activity {
    private ListView listview;
    private Button btn_ok;
    private List<Doctor> list = new ArrayList<Doctor>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inquiry_selectdoctor);
        Init();

        //给listview添加适配器
        listview.setAdapter(new InquiryDoctorAdapter(InquiryDoctorActivity.this, list));

        //点击listview中的item跳转到医生详细信息界面
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent("android.DoctorInformationActivity.action");
                startActivity(intent);
            }
        });
        {

        }
        //点击确定按钮进行搜索
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
            }
        });
    }

    private void Init(){
        listview = (ListView)findViewById(R.id.inquiry_doctor_lv);
        btn_ok = (Button)findViewById(R.id.inquiry_doctor_btn_ok);
        list.add(new Doctor("张三","骨科","主治医生","北京儿童医院","骨科类诊疗","博士毕业"));
        list.add(new Doctor("张三","骨科","主治医生","北京儿童医院","骨科类诊疗","博士毕业"));
        list.add(new Doctor("张三", "骨科", "主治医生", "北京儿童医院", "骨科类诊疗", "博士毕业"));
    }
}
