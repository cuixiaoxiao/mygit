package com.xiao.dao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xiao.com.xiao.bean.Diagnose;
import com.xiao.dactorforeverybody.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/9.
 * 自我诊断界面中的item
 */
public class DiagnoseAdapter extends BaseAdapter {
    private List<Diagnose> list = new ArrayList<Diagnose>();
    private Context context;
    private TextView tv_title,tv_introduce;
    private DiagnoseWapper wapper;

    public DiagnoseAdapter(Context context,List<Diagnose> list){
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
        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.diagnose_item,parent,false);
            wapper = new DiagnoseWapper(view);
            view.setTag(wapper);
        }
        wapper = (DiagnoseWapper)view.getTag();

        tv_introduce = wapper.getTv_introduce();
        tv_title = wapper.getTv_title();

        tv_introduce.setText(list.get(position).getDiagnose_introduce()+"");
        tv_title.setText(list.get(position).getDiagnose_title()+"");

        return view;
    }
}
