package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExactLocation extends BaseModel {

    private Double latitude;
    private Double longitude;

}
