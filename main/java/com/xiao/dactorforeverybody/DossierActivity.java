package com.xiao.dactorforeverybody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.xiao.com.xiao.bean.Dossier;
import com.xiao.dao.DossierAdapter;
import com.xiao.com.xiao.util.Utility;

import java.util.ArrayList;
import java.util.List;

public class DossierActivity extends AppCompatActivity {
    private Button btn_add;
    private ListView listview;
    private List<Dossier> list = new ArrayList<Dossier>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dossier);
        Init();

        //添加适配器
        listview.setAdapter(new DossierAdapter(DossierActivity.this, list));
        Utility.setListViewHeightBaseOnChildren(listview);

        //点击item跳转到相应界面
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent("android.DossierInformationActivity.action");
                startActivity(intent);
            }
        });


        //点击跳转到添加病例的界面
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.AddDossierActivity.action");
                startActivity(intent);
            }
        });


    }
    private void Init(){
        btn_add = (Button)findViewById(R.id.dossier_btn_add);
        listview = (ListView)findViewById(R.id.dossier_lv);
        list.add(new Dossier("String dossier_time", 2, "String dossier_height",
                "String dossier_weight", "String dossier_diseaseName", "String dossier_hospital",
                "String dossier_drug", 2, "String dossier_remarks"));
        list.add(new Dossier("String dossier_time", 2, "String dossier_height",
                "String dossier_weight", "String dossier_diseaseName", "String dossier_hospital",
                "String dossier_drug", 2, "String dossier_remarks"));
        list.add(new Dossier("String dossier_time", 2, "String dossier_height",
                "String dossier_weight", "String dossier_diseaseName", "String dossier_hospital",
                "String dossier_drug", 2, "String dossier_remarks"));
        list.add(new Dossier("String dossier_time", 5, "String dossier_height",
                "String dossier_weight", "String dossier_diseaseName", "String dossier_hospital",
                "String dossier_drug", 2, "String dossier_remarks"));
    }

}
