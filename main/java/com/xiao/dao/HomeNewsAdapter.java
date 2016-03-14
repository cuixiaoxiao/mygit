package com.xiao.dao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xiao.com.xiao.bean.HelthNews;
import com.xiao.dactorforeverybody.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/8.
 */
public class HomeNewsAdapter extends BaseAdapter {
    private TextView tv_title,tv_introduce;
    private List<HelthNews> list = new ArrayList<HelthNews>();
    private Context context;
    private HomeNewsWapper wapper;

    public HomeNewsAdapter(Context context,List<HelthNews> list){
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
            view = LayoutInflater.from(context).inflate(R.layout.home_helthnews_item,parent,false);
            wapper = new HomeNewsWapper(view);
            view.setTag(wapper);
        }
            wapper = (HomeNewsWapper)view.getTag();
            tv_introduce = wapper.getIv_introduce();
            tv_title = wapper.getTv_title();

        tv_title.setText(list.get(position).getHelthnews_title()+"");
        tv_introduce.setText(list.get(position).getHelthnews_introduce()+"");

        return view;
    }
}
