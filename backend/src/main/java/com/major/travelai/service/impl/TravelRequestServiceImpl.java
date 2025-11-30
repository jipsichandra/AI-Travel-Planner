package com.major.travelai.service.impl;

import com.major.travelai.dto.TravelRequestDto;
import com.major.travelai.model.TravelRequest;
import com.major.travelai.repository.TravelRequestRepository;
import com.major.travelai.service.TravelRequestService;
import org.springframework.stereotype.Service;

@Service
public class TravelRequestServiceImpl implements TravelRequestService {

    private final TravelRequestRepository repo;

    public TravelRequestServiceImpl(TravelRequestRepository repo) {
        this.repo = repo;
    }

    @Override
    public TravelRequest createTravelRequest(TravelRequestDto dto) {
        TravelRequest request = new TravelRequest();
        request.setSource(dto.getSource());
        request.setDestination(dto.getDestination());
        request.setStartDate(dto.getStartDate());
        request.setEndDate(dto.getEndDate());
        request.setBudget(dto.getBudget());
        request.setDays(dto.getDays());
        request.setTravelers(dto.getTravelers());

        return repo.save(request);

    }
}