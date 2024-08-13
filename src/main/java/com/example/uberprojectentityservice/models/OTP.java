package com.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OTP extends BaseModel{

    private String code;

    private String sentToNumber;

    public static OTP generateOtp(String phoneNumber){
        Random random = new Random();

        Integer code = random.nextInt(9000) + 1000;

        return OTP.builder().code(code.toString()).sentToNumber(phoneNumber).build();
    }

}
