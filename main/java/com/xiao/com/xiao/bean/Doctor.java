package com.xiao.com.xiao.bean;

/**
 * Created by Administrator on 2016/3/2.
 */
public class Doctor {
    //医生姓名
    private String doctor_name;
    //医生科室
    private String doctor_section;
    //医生职称
    private String doctor_title;
    //医生所属医院
    private String doctor_hospital;
    //擅长
    private String doctor_beGoodat;
    //简介
    private String doctor_introduce;

    public Doctor(String doctor_name, String doctor_section, String doctor_title,
                  String doctor_hospital, String doctor_beGoodat, String doctor_introduce) {
        this.doctor_name = doctor_name;
        this.doctor_section = doctor_section;
        this.doctor_title = doctor_title;
        this.doctor_hospital = doctor_hospital;
        this.doctor_beGoodat = doctor_beGoodat;
        this.doctor_introduce = doctor_introduce;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_section() {
        return doctor_section;
    }

    public void setDoctor_section(String doctor_section) {
        this.doctor_section = doctor_section;
    }

    public String getDoctor_title() {
        return doctor_title;
    }

    public void setDoctor_title(String doctor_title) {
        this.doctor_title = doctor_title;
    }

    public String getDoctor_hospital() {
        return doctor_hospital;
    }

    public void setDoctor_hospital(String doctor_hospital) {
        this.doctor_hospital = doctor_hospital;
    }

    public String getDoctor_beGoodat() {
        return doctor_beGoodat;
    }

    public void setDoctor_beGoodat(String doctor_beGoodat) {
        this.doctor_beGoodat = doctor_beGoodat;
    }

    public String getDoctor_introduce() {
        return doctor_introduce;
    }

    public void setDoctor_introduce(String doctor_introduce) {
        this.doctor_introduce = doctor_introduce;
    }
}
