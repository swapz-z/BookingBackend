package com.example.demo.service;

import com.example.demo.bo.HotelLocation;
import com.example.demo.bo.HotelRequest;
import com.example.demo.entity.HotelLocationEntity;

import java.util.List;

public interface IHotelLocationService {
    List<HotelLocation> getAllHotels();

    List<HotelLocationEntity> getAllHotelInfo();

    void addHotel(HotelRequest hotelInfo);
}
