package com.xiao.com.xiao.bean;

/**
 * Created by Administrator on 2016/3/9.
 * 自我诊断的实体类（存放自我诊断界面里列表中，单个item中的标题和简介的数据）
 */
public class Diagnose {
    //自我诊断中标题
    private String diagnose_title;
    //简介
    private String diagnose_introduce;

    public Diagnose(String diagnose_title, String diagnose_introduce) {
        this.diagnose_title = diagnose_title;
        this.diagnose_introduce = diagnose_introduce;
    }

    public String getDiagnose_title() {
        return diagnose_title;
    }

    public void setDiagnose_title(String diagnose_title) {
        this.diagnose_title = diagnose_title;
    }

    public String getDiagnose_introduce() {
        return diagnose_introduce;
    }

    public void setDiagnose_introduce(String diagnose_introduce) {
        this.diagnose_introduce = diagnose_introduce;
    }
}
