package com.major.travelai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.major.travelai.model.TravelRequest;

public interface TravelRequestRepository extends JpaRepository<TravelRequest,Long>{}