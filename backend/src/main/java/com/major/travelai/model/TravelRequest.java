package com.major.travelai.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TravelRequest{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String source;
    private String destination;
    private String startDate;
    private String endDate;
    private int budget;
    private int days;
    private int travelers;


}
