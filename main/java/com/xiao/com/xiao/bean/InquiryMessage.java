package com.xiao.com.xiao.bean;

/**
 * Created by Administrator on 2016/3/7.
 */
public class InquiryMessage {
    //发送方
    private String send_user;
    //接收方
    private String tosend_user;
    //消息内容
    private String text;
    //发送时间
    private String time;

    public InquiryMessage(String send_user, String tosend_user, String text, String time) {
        this.send_user = send_user;
        this.tosend_user = tosend_user;
        this.text = text;
        this.time = time;
    }

    public String getSend_user() {
        return send_user;
    }

    public void setSend_user(String send_user) {
        this.send_user = send_user;
    }

    public String getTosend_user() {
        return tosend_user;
    }

    public void setTosend_user(String tosend_user) {
        this.tosend_user = tosend_user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
