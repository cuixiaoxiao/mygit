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

import com.xiao.com.xiao.bean.Doctor;
import com.xiao.com.xiao.util.Utility;
import com.xiao.dao.InquiryRecentDoctorAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/25.
 */
public class InquiryFragment extends Fragment {
    private Button btn_select,btn_message;
    private ListView lv_recentdoctor;
    private List<Doctor> list = new ArrayList<Doctor>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.inquiry,null);
        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //关联控件
        btn_select = (Button)view.findViewById(R.id.inquiry_btn_select);
        lv_recentdoctor = (ListView)view.findViewById(R.id.inquiry_lv_recent);
        btn_message = (Button)view.findViewById(R.id.inquiry_btn_message);

        if(list.size()==0){
            list.add(new Doctor("张三", "骨科", "主治医生", "北京儿童医院", "骨科治疗", "硕士毕业"));
            list.add(new Doctor("李四", "骨科", "主治医生", "北京儿童医院", "骨科治疗", "硕士毕业"));
            list.add(new Doctor("王五", "骨科", "主治医生", "北京儿童医院", "骨科治疗", "硕士毕业"));
            list.add(new Doctor("张三", "骨科", "主治医生", "北京儿童医院", "骨科治疗", "硕士毕业"));
            list.add(new Doctor("张三", "骨科", "主治医生", "北京儿童医院", "骨科治疗", "硕士毕业"));
            list.add(new Doctor("张三", "骨科", "主治医生", "北京儿童医院", "骨科治疗", "硕士毕业"));
        }

        //给listview添加适配器
        lv_recentdoctor.setAdapter(new InquiryRecentDoctorAdapter(getActivity(),list));
        Utility.setListViewHeightBaseOnChildren(lv_recentdoctor);
        //Toast.makeText(getActivity(), list.size(), Toast.LENGTH_SHORT).show();
        //点击搜索按钮，跳转到搜索界面
        btn_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.inquiryDoctorActivity.action");
                startActivity(intent);
            }
        });

        //点击消息按钮，跳转到消息消息列表界面
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.MessageActivity.action");
                startActivity(intent);
            }
        });

        //点击item跳转到医生详细界面
        lv_recentdoctor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //点击跳转到医生详细信息界面
                Intent intent = new Intent("android.DoctorInformationActivity.action");
                startActivity(intent);
            }
        });


    }
}
