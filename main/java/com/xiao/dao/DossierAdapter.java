package com.xiao.dao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xiao.com.xiao.bean.Dossier;
import com.xiao.dactorforeverybody.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/1.
 */
public class DossierAdapter extends BaseAdapter {
    private List<Dossier> list = new ArrayList<Dossier>();
    private Context context;
    private DossierWapper wapper;
    private TextView tv_time,tv_hospital;
    public DossierAdapter(Context context,List<Dossier> list){
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
            view = LayoutInflater.from(context).inflate(R.layout.dossier_item,parent,false);
            wapper = new DossierWapper(view);
            view.setTag(wapper);
        }
            wapper = (DossierWapper)view.getTag();

        tv_hospital = wapper.getTv_hospital();
        tv_time = wapper.getTv_time();

        tv_time.setText(list.get(position).getDossier_time()+"");
        tv_hospital.setText(list.get(position).getDossier_hospital()+"");
        return view;
    }
}
