package com.major.travelai.controller;

//This is the API where the frontend will send trip details → we save → then generate AI itinerary.

import com.major.travelai.dto.TravelRequestDto;
import com.major.travelai.model.TravelRequest;
import com.major.travelai.service.TravelRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/travel")
@CrossOrigin(origins="*")
public class TravelRequestController{
    private final TravelRequestService service;

    public TravelRequestController(TravelRequestService service)
    {
        this.service=service;
    }

    @PostMapping("/request")
    public ResponseEntity<TravelRequest> createTravelRequest(@RequestBody TravelRequestDto dto)
    {
        TravelRequest saved=service.createTravelRequest(dto);
        return ResponseEntity.ok(saved);
    }

}