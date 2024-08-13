package com.example.uberprojectentityservice.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModel{

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String phoneNumber;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings = new ArrayList<>();

    @OneToOne
    private Booking activeBooking;

    @DecimalMin(value="0.00",message = "Rating must be between 0 and 5")
    @DecimalMax(value="5.00",message = "Rating must be between 0 and 5")
    private Double rating; //daily at night we can update this property this will reduce our queries

    @OneToOne
    private ExactLocation exactLocation;

    @OneToOne
    private ExactLocation homeLocation;

}
