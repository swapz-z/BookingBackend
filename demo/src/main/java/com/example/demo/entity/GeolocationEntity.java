package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Hotel_gps")
public class GeolocationEntity {

    @Id
    @GeneratedValue
    public int gid;

    public double latitude;

    public double longitude;


}
