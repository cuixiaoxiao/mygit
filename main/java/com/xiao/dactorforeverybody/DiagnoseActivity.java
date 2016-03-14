package com.xiao.dactorforeverybody;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.xiao.com.xiao.bean.Diagnose;
import com.xiao.dao.DiagnoseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/9.
 */
public class DiagnoseActivity extends Activity {
    private ListView listview;
    private List<Diagnose> list = new ArrayList<Diagnose>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagnose);
        Init();

        //添加适配器
        listview.setAdapter(new DiagnoseAdapter(DiagnoseActivity.this,list));
    }
    public void Init(){
        listview = (ListView)findViewById(R.id.diagnose_listview);
        //给listview赋值
        list.add(new Diagnose("症状自诊","帮您判断身体的不适"));
        list.add(new Diagnose("自测工具箱","帮您自测身体健康情况"));
        list.add(new Diagnose("疾病库","权威疾病知识介绍"));
        list.add(new Diagnose("药品库","上千种常用药品"));
    }
}
