package com.example.demo.service.impl;

import com.example.demo.bo.HotelLocation;
import com.example.demo.bo.HotelRequest;
import com.example.demo.dao.CategoryDao;
import com.example.demo.dao.IHotelLocationDao;
import com.example.demo.entity.Catagory;
import com.example.demo.entity.HotelLocationEntity;
import com.example.demo.service.IHotelLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class HotelLocationServiceImpl extends Catagory implements IHotelLocationService {


    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private IHotelLocationDao iHotelLocationDao;

    @Override
    public List<HotelLocation> getAllHotels() {
        List<HotelLocation> hotelList = new ArrayList<>();
        List<HotelLocationEntity> all = iHotelLocationDao.findAll();
        all.forEach(x -> {
            HotelLocation hotelLocation = new HotelLocation();
            hotelLocation.setHotelId(x.getHotelId());
            hotelLocation.setAddress(x.getAddress());
            hotelLocation.setCity(x.getCity());
            hotelLocation.setCountry(x.getCountry());
            hotelLocation.setName(x.getName());
            hotelLocation.setPostalCode(x.getPostalCode());
            hotelLocation.setProvince(x.getProvince());
            hotelList.add(hotelLocation);
        });
        return hotelList;
    }

    @Override
    public List<HotelLocationEntity> getAllHotelInfo() {
        return iHotelLocationDao.findAll();
    }


    @Override
    public void addHotel(HotelRequest hotelInfo) {
        if (hotelInfo.getRequestData().getCatagories()!=null) {
            List<Catagory> catagories = hotelInfo.getRequestData().getCatagories();
            catagories.forEach(x -> categoryDao.save(x));
        }
        iHotelLocationDao.save(hotelInfo.getRequestData());
    }
}
