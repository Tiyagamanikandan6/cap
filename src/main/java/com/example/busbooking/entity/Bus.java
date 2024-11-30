package com.example.busbooking.entity;
import jakarta.persistence.*;
@Entity
public class Bus {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String route;
    private int seats;
}