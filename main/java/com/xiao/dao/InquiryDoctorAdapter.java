package com.xiao.dao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xiao.com.xiao.bean.Doctor;
import com.xiao.dactorforeverybody.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/3.
 */
public class InquiryDoctorAdapter extends BaseAdapter {
    private Context context;
    private List<Doctor> list = new ArrayList<Doctor>();
    private InquiryDoctorWapper wapper;
    private TextView tv_name,tv_title,tv_section,tv_hospital;

    public InquiryDoctorAdapter(Context context,List<Doctor> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.inquiry_selectdoctor_item,parent,false);
            wapper = new InquiryDoctorWapper(view);
            view.setTag(wapper);
        }
        wapper = (InquiryDoctorWapper)view.getTag();

        tv_hospital = wapper.getTv_hospital();
        tv_name = wapper.getTv_name();
        tv_section = wapper.getTv_section();
        tv_title = wapper.getTv_title();

        tv_title.setText(list.get(position).getDoctor_title()+"");
        tv_section.setText(list.get(position).getDoctor_section()+"");
        tv_name.setText(list.get(position).getDoctor_name()+"");
        tv_hospital.setText(list.get(position).getDoctor_hospital()+"");

        return view;
    }
}
