package com.xiao.dactorforeverybody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/3/1.
 */
public class LoginActivity extends Activity {
    private Button btn_login,btn_findpwd,btn_register;
    //手机号,密码
    private EditText et_phone,et_pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
        Init();

        //点击登录跳转
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //输入为空时进行提醒
                if((("").equals(et_phone.getText()+""))||(("").equals(et_pwd.getText()+""))){
                    Toast.makeText(LoginActivity.this,"输入不能为空！",Toast.LENGTH_SHORT).show();
                }else if(!((et_phone.getText()+"").equals("15369303201")||((et_pwd.getText()+"").equals("123")))){
                    //输入密码不正确时进行提醒
                    Toast.makeText(LoginActivity.this,"输入密码不正确！",Toast.LENGTH_SHORT).show();
                }else{
                    //输入正确时进行跳转
                    Intent intent = new Intent("android.DoctorForEverybody.action");
                    startActivity(intent);
                }
            }
        });

        //点击新用户跳转
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.RegisterActivity.action");
                startActivity(intent);
            }
        });

        //点击找密码跳转
        btn_findpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android..FindpwdActivity.action");
                startActivity(intent);
            }
        });
    }
    private void Init(){
        btn_login = (Button)findViewById(R.id.login_btn_login);
        btn_findpwd = (Button)findViewById(R.id.login_btn_findpwd);
        btn_register = (Button)findViewById(R.id.login_btn_register);
        et_phone = (EditText)findViewById(R.id.login_et_phone);
        et_pwd = (EditText)findViewById(R.id.login_et_pwd);
    }
}
