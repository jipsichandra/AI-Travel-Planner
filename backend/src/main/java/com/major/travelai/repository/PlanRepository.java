package com.major.travelai.repository;

import com.major.travelai.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository <Plan,Long>{}