package com.project.sms.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id
    private Integer id;
    //姓名
    private String name;
    //电话号码
    private Long tel;
    //QQ号
    private Integer QQ;
    //微信号
    private String wechatnum;
    //管理班级
    private  String clazz;

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

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Integer getQQ() {
        return QQ;
    }

    public void setQQ(Integer QQ) {
        this.QQ = QQ;
    }

    public String getWechatnum() {
        return wechatnum;
    }

    public void setWechatnum(String wechatnum) {
        this.wechatnum = wechatnum;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
