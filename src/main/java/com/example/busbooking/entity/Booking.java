package com.example.busbooking.entity;
import jakarta.persistence.*;
@Entity
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passengerName;
    private String busName;
}