package com.xiao.com.xiao.bean;

/**
 * Created by Administrator on 2016/3/7.
 * 健康计划
 */
public class HelthPlan {
    //健康计划的名称
    private String plan_name;
    //计划的类别
    private String plan_type;
    //计划的完成状态
    private String plan_status;
    //计划的时间
    private String plan_time;
    //计划的具体内容
    private String plan_content;

    public HelthPlan(String plan_name, String plan_type, String plan_status, String plan_time, String plan_content) {
        this.plan_name = plan_name;
        this.plan_type = plan_type;
        this.plan_status = plan_status;
        this.plan_time = plan_time;
        this.plan_content = plan_content;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public String getPlan_type() {
        return plan_type;
    }

    public void setPlan_type(String plan_type) {
        this.plan_type = plan_type;
    }

    public String getPlan_status() {
        return plan_status;
    }

    public void setPlan_status(String plan_status) {
        this.plan_status = plan_status;
    }

    public String getPlan_time() {
        return plan_time;
    }

    public void setPlan_time(String plan_time) {
        this.plan_time = plan_time;
    }

    public String getPlan_content() {
        return plan_content;
    }

    public void setPlan_content(String plan_content) {
        this.plan_content = plan_content;
    }
}
