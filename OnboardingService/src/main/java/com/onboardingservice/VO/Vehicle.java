package com.onboardingservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private long vehicleId;
    private String vin;
    private String vehicleModel;
    private int vehicleMfgYear;
}
