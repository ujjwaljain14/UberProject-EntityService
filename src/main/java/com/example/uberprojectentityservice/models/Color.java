package com.example.uberprojectentityservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Color extends BaseModel{

    @Column(nullable = false,unique = true)
    String color;
}
