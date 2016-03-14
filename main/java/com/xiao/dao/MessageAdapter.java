package com.xiao.dao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xiao.com.xiao.bean.InquiryMessage;
import com.xiao.dactorforeverybody.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/7.
 */
public class MessageAdapter extends BaseAdapter {
    private Context context;
    private MessageWapper wapper;
    private List<InquiryMessage> list = new ArrayList<InquiryMessage>();
    private TextView tv_send_user,tv_text;

    public MessageAdapter(Context context,List<InquiryMessage> list){
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
            view = LayoutInflater.from(context).inflate(R.layout.message_item,parent,false);
            wapper = new MessageWapper(view);
            view.setTag(wapper);
        }
            wapper = (MessageWapper)view.getTag();

        tv_send_user = wapper.getTv_name();
        tv_text = wapper.getTv_message();

        tv_send_user.setText(list.get(position).getSend_user()+"");
        tv_text.setText(list.get(position).getText()+"");

        return view;
    }
}
