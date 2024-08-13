package com.example.uberprojectentityservice.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Booking booking;

    @Column(nullable = false)
    private String content;

    private Double rating;

    @Override
    public String toString(){
        return "Review"+this.content+" "+this.rating+" "+this.createdAt;
    }
}
