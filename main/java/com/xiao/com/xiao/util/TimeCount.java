package com.xiao.com.xiao.util;

/**
 * Created by Administrator on 2016/3/9.
 */
/*public class TimeCount extends CountDownTimer {
    private Button btn;
    *//**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     *//*
    public TimeCount(long millisInFuture, long countDownInterval,Button btn) {
        super(millisInFuture, countDownInterval);
        this.btn = btn;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        btn.setBackgroundColor(Color.parseColor("#B6B6D8"));
        btn.setClickable(false);
        btn.setText(millisUntilFinished/1000+"");
    }

    @Override
    public void onFinish() {
        btn.setText("重新获取验证码");
        btn.setClickable(true);
        btn.setBackgroundColor(Color.parseColor("#4EB84A"));
    }
}*/
