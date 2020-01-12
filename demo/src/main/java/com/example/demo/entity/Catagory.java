package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CATEGORY")
public class Catagory {

    @Id
    @Column(name = "c_id")
    private Long cId;

    @Column(name = "category_name")
    private String cname;

    @Column(name = "category_desc")
    private String cdescription;

    @ManyToMany(mappedBy = "catagories")
    private List<HotelLocationEntity> hotelLocationEntityList;

//    public List<HotelLocationEntity> getHotelLocationEntityList() {
//        return hotelLocationEntityList;
//    }
//
//    public void setHotelLocationEntityList(List<HotelLocationEntity> hotelLocationEntityList) {
//        this.hotelLocationEntityList = hotelLocationEntityList;
//    }

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

    @Override
    public String toString() {
        return "Catagory{" + "cId=" + cId + ", cname='" + cname + '\'' + ", cdescription='" + cdescription + '\'' + '}';
    }
}

