package com.xiao.dactorforeverybody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.xiao.com.xiao.bean.InquiryMessage;
import com.xiao.dao.MessageAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/4.
 */
public class MessageActivity extends Activity {
    private ListView listview;
    private List<InquiryMessage> list = new ArrayList<InquiryMessage>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);
        Init();

        listview.setAdapter(new MessageAdapter(MessageActivity.this,list));
        //点击消息列表中的item调到聊天界面
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent("android.ChatActivity.action");
                startActivity(intent);
            }
        });

    }
    private void Init(){
        listview = (ListView)findViewById(R.id.message_listview);
        list.add(new InquiryMessage("张三","李四","你好","2012-2-12"));
        list.add(new InquiryMessage("张三","李四","你好","2012-2-12"));
        list.add(new InquiryMessage("张三","李四","你好","2012-2-12"));
        list.add(new InquiryMessage("张三","李四","你好","2012-2-12"));
    }
}
