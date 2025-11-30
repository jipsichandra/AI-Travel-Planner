package com.major.travelai.service;

import com.major.travelai.dto.TravelRequestDto;
import com.major.travelai.model.TravelRequest;

public interface TravelRequestService {
    TravelRequest createTravelRequest(TravelRequestDto dto);
}