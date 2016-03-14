package com.xiao.com.xiao.bean;

/**
 * Created by Administrator on 2016/2/29.
 */
public class Dossier {
    private String dossier_time;
    private int dossier_lastTime;
    private String dossier_height;
    private String dossier_weight;
    private String dossier_diseaseName;
    private String dossier_hospital;
    private String dossier_drug;
    private int dossier_pay;
    private String dossier_remarks;

    public Dossier(String dossier_time, int dossier_lastTime, String dossier_height,
                   String dossier_weight, String dossier_diseaseName, String dossier_hospital,
                   String dossier_drug, int dossier_pay, String dossier_remarks) {
        this.dossier_time = dossier_time;
        this.dossier_lastTime = dossier_lastTime;
        this.dossier_height = dossier_height;
        this.dossier_weight = dossier_weight;
        this.dossier_diseaseName = dossier_diseaseName;
        this.dossier_hospital = dossier_hospital;
        this.dossier_drug = dossier_drug;
        this.dossier_pay = dossier_pay;
        this.dossier_remarks = dossier_remarks;
    }

    public Dossier(String dossier_time, String dossier_diseaseName) {
        this.dossier_time = dossier_time;
        this.dossier_diseaseName = dossier_diseaseName;
    }

    public String getDossier_time() {
        return dossier_time;
    }

    public void setDossier_time(String dossier_time) {
        this.dossier_time = dossier_time;
    }

    public int getDossier_lastTime() {
        return dossier_lastTime;
    }

    public void setDossier_lastTime(int dossier_lastTime) {
        this.dossier_lastTime = dossier_lastTime;
    }

    public String getDossier_height() {
        return dossier_height;
    }

    public void setDossier_height(String dossier_height) {
        this.dossier_height = dossier_height;
    }

    public String getDossier_weight() {
        return dossier_weight;
    }

    public void setDossier_weight(String dossier_weight) {
        this.dossier_weight = dossier_weight;
    }

    public String getDossier_diseaseName() {
        return dossier_diseaseName;
    }

    public void setDossier_diseaseName(String dossier_diseaseName) {
        this.dossier_diseaseName = dossier_diseaseName;
    }

    public String getDossier_hospital() {
        return dossier_hospital;
    }

    public void setDossier_hospital(String dossier_hospital) {
        this.dossier_hospital = dossier_hospital;
    }

    public String getDossier_drug() {
        return dossier_drug;
    }

    public void setDossier_drug(String dossier_drug) {
        this.dossier_drug = dossier_drug;
    }

    public int getDossier_pay() {
        return dossier_pay;
    }

    public void setDossier_pay(int dossier_pay) {
        this.dossier_pay = dossier_pay;
    }

    public String getDossier_remarks() {
        return dossier_remarks;
    }

    public void setDossier_remarks(String dossier_remarks) {
        this.dossier_remarks = dossier_remarks;
    }
}
