package com.example.uberauthservice.dto;

import com.example.uberauthservice.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private String id;
    private String name;
    private String email;
    private String password;  // encrypted password
    private String phoneNumber;
    private Date createdAt;

    public static PassengerDto from(Passenger p){
        PassengerDto result = PassengerDto.builder()
                .id(p.getId().toString())
                .name(p.getName())
                .email(p.getEmail())
                .password(p.getPassword())
                .createdAt(p.getCreatedAt())
                .phoneNumber(p.getPhoneNumber())
                .build();

        return result;
    }
}
