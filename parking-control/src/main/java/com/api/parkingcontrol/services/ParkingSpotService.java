package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final ParkingSpotService service;

    public ParkingSpotService(ParkingSpotService service) {
        this.service = service;
    }
}
