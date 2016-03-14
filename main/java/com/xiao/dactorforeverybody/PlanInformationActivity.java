package com.xiao.dactorforeverybody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/3/7.
 */
public class PlanInformationActivity extends Activity {
    private Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_information);
        Init();

        /*
        *
        * 点击返回
        *
        * */
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.DoctorForEverybody.action");
                startActivity(intent);
            }
        });
    }
    private void Init(){
        btn_back = (Button)findViewById(R.id.plan_information_btn_back);
    }
}
