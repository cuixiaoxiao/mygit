package com.xiao.dactorforeverybody;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/3/2.
 */
public class RegisterActivity extends Activity {
    private Button btn_getNum;
    //获取验证码计时
    private TimeCount count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        count = new TimeCount(60000,1000);
        Init();


        //点击获取密码
        btn_getNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.start();
            }
        });
    }

    private void Init(){
        btn_getNum = (Button)findViewById(R.id.register_btn_getNum);
    }


    //点击获取验证码后的倒计时
    public class TimeCount extends CountDownTimer {
        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            btn_getNum.setBackgroundColor(Color.parseColor("#B6B6D8"));
            btn_getNum.setClickable(false);
            btn_getNum.setText(millisUntilFinished/1000+"秒后可重新发送");
        }

        @Override
        public void onFinish() {
            btn_getNum.setText("重新获取验证码");
            btn_getNum.setClickable(true);
            btn_getNum.setBackgroundColor(Color.parseColor("#4EB84A"));
        }
    }
}
