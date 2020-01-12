package com.example.demo.restcontroller;

import com.example.demo.bo.HotelLocation;
import com.example.demo.bo.HotelRequest;
import com.example.demo.entity.HotelLocationEntity;
import com.example.demo.service.IHotelLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelLocationController {

    @Autowired
    private IHotelLocationService hotelLocationService;

    @GetMapping("/all")
    public List<HotelLocation> getAllHotels() {
        return hotelLocationService.getAllHotels();
    }

    @GetMapping("/allinfo")
    public List<HotelLocationEntity> getAllHotelInfo() {
        return hotelLocationService.getAllHotelInfo();
    }

    @PostMapping("/addHotelInfo")
    public void addHotel(@RequestBody HotelRequest hotelInfo) {
//        HotelLocationEntity hotelLocationEntity = new HotelLocationEntity();
//        hotelLocationEntity.setCatagories(hotelInfo.getRequestData().getCatagories());
        hotelLocationService.addHotel(hotelInfo);
    }

}
