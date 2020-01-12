package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotel_info")
public class HotelLocationEntity {

    @Id
    @Column(name = "hotel_id")
    public int hotelId;

    @Column(name = "address")
    public String address;

    @Column(name = "city")
    public String city;

    @Column(name = "country")
    public String country;

    @Column(name = "hotel_name")
    public String name;

    @Column(name = "pincode")
    public long postalCode;

    @Column(name = "province")
    public String province;

    @OneToOne
    @JoinColumn(name = "gps_id")
    public GeolocationEntity geolocationEntity;

    public GeolocationEntity getGeolocationEntity() {
        return geolocationEntity;
    }

    public void setGeolocationEntity(GeolocationEntity geolocationEntity) {
        this.geolocationEntity = geolocationEntity;
    }

    @ManyToMany
    @JoinTable(name = "hotel_category",
            joinColumns = @JoinColumn(name = "hotelloca_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    public List<Catagory> catagories;

    public HotelLocationEntity() {
    }

    public List<Catagory> getCatagories() {
        return catagories;
    }

    public void addCatagories(Catagory catagory) {
        this.catagories.add(catagory);
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "HotelLocationEntity{" +
                "hotelId=" + hotelId +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", postalCode=" + postalCode +
                ", province='" + province + '\'' +
                '}';
    }
}
