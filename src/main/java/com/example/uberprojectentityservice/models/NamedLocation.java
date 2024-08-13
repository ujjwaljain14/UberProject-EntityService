package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NamedLocation extends BaseModel{

    @OneToOne
    private ExactLocation exactLocation;

    private String name;

    private String zipcode;

    private String city;

    private String country;

    private String state;

}
