package com.project.sms.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familier")
public class Familier {
    @Id
    //学生学号
    private Integer id;
    //学生姓名
    private String name;
    //家庭成员姓名（F,S分别代表first,second)
    private String ffamilier;
    //联系电话
    private Long ftel;
    //工作地址
    private String fworkplace;
    //与学生关系
    private String frelative;
    private String sfamilier;
    private Long stel;
    private String sworkplace;
    private String srelative;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFfamilier() {
        return ffamilier;
    }

    public void setFfamilier(String ffamilier) {
        this.ffamilier = ffamilier;
    }

    public Long getFtel() {
        return ftel;
    }

    public void setFtel(Long ftel) {
        this.ftel = ftel;
    }

    public String getFworkplace() {
        return fworkplace;
    }

    public void setFworkplace(String fworkplace) {
        this.fworkplace = fworkplace;
    }

    public String getFrelative() {
        return frelative;
    }

    public void setFrelative(String frelative) {
        this.frelative = frelative;
    }

    public String getSfamilier() {
        return sfamilier;
    }

    public void setSfamilier(String sfamilier) {
        this.sfamilier = sfamilier;
    }

    public Long getStel() {
        return stel;
    }

    public void setStel(Long stel) {
        this.stel = stel;
    }

    public String getSworkplace() {
        return sworkplace;
    }

    public void setSworkplace(String sworkplace) {
        this.sworkplace = sworkplace;
    }

    public String getSrelative() {
        return srelative;
    }

    public void setSrelative(String srelative) {
        this.srelative = srelative;
    }
}
