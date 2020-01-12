package com.example.demo.bo;

import com.example.demo.entity.HotelLocationEntity;

public class HotelRequest {
    private HotelLocationEntity requestData;

    public HotelRequest(HotelLocationEntity requestData) {
        this.requestData = requestData;
    }

    public HotelRequest() {
    }

    public HotelLocationEntity getRequestData() {
        return requestData;
    }

    public void setRequestData(HotelLocationEntity requestData) {
        this.requestData = requestData;
    }
}
