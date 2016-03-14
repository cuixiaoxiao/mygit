package com.xiao.com.xiao.bean;

/**
 * Created by Administrator on 2016/3/10.
 * 跟人信息界面的类，用于更改个人信息
 */
public class OwnInfor {
    private String type;
    private String content;

    public OwnInfor(String type,String content){
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
