package com.xiao.dao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xiao.com.xiao.bean.OwnInfor;
import com.xiao.dactorforeverybody.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/10.
 */
public class OwnInforAdapter extends BaseAdapter {
    private Context context;
    private List<OwnInfor> list = new ArrayList<OwnInfor>();
    private OwnInforWapper wapper;
    private TextView tv_type,ty_content;
    public OwnInforAdapter(Context context,List<OwnInfor> list){
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
            view = LayoutInflater.from(context).inflate(R.layout.own_infor_item,parent,false);
            wapper = new OwnInforWapper(view);
            view.setTag(wapper);
        }
        wapper = (OwnInforWapper)view.getTag();

        tv_type = wapper.getTv_type();
        ty_content = wapper.getTy_content();

        tv_type.setText(list.get(position).getType()+"");
        ty_content.setText(list.get(position).getContent()+"");
        return view;
    }
}
