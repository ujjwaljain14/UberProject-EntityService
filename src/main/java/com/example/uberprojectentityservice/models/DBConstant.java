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
public class DBConstant extends BaseModel{

    @Column(unique=true,nullable = false)
    private String name;

    private String value;
}
