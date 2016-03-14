package com.xiao.com.xiao.bean;

/**
 * Created by Administrator on 2016/3/8.
 */
public class HelthNews {
    private String helthnews_title;
    private String helthnews_introduce;
    private String helthnews_context;

    public HelthNews(String helthnews_title, String helthnews_context, String helthnews_introduce) {
        this.helthnews_title = helthnews_title;
        this.helthnews_context = helthnews_context;
        this.helthnews_introduce = helthnews_introduce;
    }

    public String getHelthnews_title() {
        return helthnews_title;
    }

    public void setHelthnews_title(String helthnews_title) {
        this.helthnews_title = helthnews_title;
    }

    public String getHelthnews_introduce() {
        return helthnews_introduce;
    }

    public void setHelthnews_introduce(String helthnews_introduce) {
        this.helthnews_introduce = helthnews_introduce;
    }

    public String getHelthnews_context() {
        return helthnews_context;
    }

    public void setHelthnews_context(String helthnews_context) {
        this.helthnews_context = helthnews_context;
    }
}
