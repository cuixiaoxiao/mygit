package com.xiao.dactorforeverybody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/3/8.
 */
public class HelthNewsInformationActivity extends Activity {
    private Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helthnews_information);
        Init();

        /*
        *
        * 点击返回按钮，返回到首页界面
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
       btn_back = (Button)findViewById(R.id.helthnews_information_btn_back);
   }
}
