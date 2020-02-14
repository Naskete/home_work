package com.project.sms.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familier")
public class Familier {
    @Id
    private Integer id;
    private String name;
    private String Ffamilier;
    private Integer Ftel;
    private String Fworkplace;
    private String Frelative;
    private String Sfamilier;
    private Integer Stel;
    private String Sworkplace;
    private String Srelative;

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
        return Ffamilier;
    }

    public void setFfamilier(String ffamilier) {
        Ffamilier = ffamilier;
    }

    public String getFworkplace() {
        return Fworkplace;
    }

    public void setFworkplace(String fworkplace) {
        Fworkplace = fworkplace;
    }

    public String getFrelative() {
        return Frelative;
    }

    public void setFrelative(String frelative) {
        Frelative = frelative;
    }

    public String getSfamilier() {
        return Sfamilier;
    }

    public void setSfamilier(String sfamilier) {
        Sfamilier = sfamilier;
    }

    public String getSworkplace() {
        return Sworkplace;
    }

    public void setSworkplace(String sworkplace) {
        Sworkplace = sworkplace;
    }

    public String getSrelative() {
        return Srelative;
    }

    public void setSrelative(String srelative) {
        Srelative = srelative;
    }
}
