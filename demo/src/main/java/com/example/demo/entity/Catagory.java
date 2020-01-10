package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Catagory {

    @Id
    @GeneratedValue
    @Column(name = "c_id", insertable=true, updatable=true, unique=true, nullable=false)
    private Long cId;

    @Column(name = "category_name")
    private String cname;

    @Column(name = "category_desc")
    private String cdescription;

    public Catagory() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription;
    }

    @Override public String toString() {
        return "Catagory{" + "cId=" + cId + ", cname='" + cname + '\'' + ", cdescription='" + cdescription + '\'' + '}';
    }
}

