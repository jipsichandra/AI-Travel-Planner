package com.major.travelai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
public class Plan{
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String destination;
    private LocalDate startDate;
    private Integer days;
    private BigDecimal budget;
    @Lob
    private String intrests;
    @Lob
    private String aiResponseRaw;
    @Lob
    private String planJson;
    private LocalDateTime createdAt;
//     getters/setters . @PrePersist for createdAt
}