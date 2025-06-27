package com.onboardingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ecu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ecuId;
    private String ecuName;
    private String ecuModel;
    private int ecuMfgYear;
    private long vehicleId;


}
