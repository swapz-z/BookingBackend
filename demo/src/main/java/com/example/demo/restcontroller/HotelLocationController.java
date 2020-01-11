package com.example.demo.restcontroller;

import com.example.demo.bo.HotelLocation;
import com.example.demo.service.IHotelLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/allhotels")
public class HotelLocationController {

    @Autowired
    private IHotelLocationService hotelLocationService;

    @GetMapping
    public List<HotelLocation> getAllHotels(){
        return hotelLocationService.getAllHotels();
    }
}
