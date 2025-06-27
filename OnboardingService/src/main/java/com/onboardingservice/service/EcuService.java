package com.onboardingservice.service;

import com.onboardingservice.model.Ecu;

import java.util.List;

public interface EcuService {
    List<Ecu> getAllEcus();
    Ecu getEcu(long ecuId);
    void addEcus(List<Ecu> ecus);
    void addEcu(Ecu ecu);
}
