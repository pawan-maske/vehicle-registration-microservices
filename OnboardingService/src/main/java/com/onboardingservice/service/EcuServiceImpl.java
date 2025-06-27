package com.onboardingservice.service;

import com.onboardingservice.model.Ecu;
import com.onboardingservice.repository.EcuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcuServiceImpl implements EcuService {

    private final EcuRepository ecuRepository;

    public EcuServiceImpl(EcuRepository ecuRepository) {
        this.ecuRepository = ecuRepository;
    }


    @Override
    public List<Ecu> getAllEcus() {
        return ecuRepository.findAll();
    }

    @Override
    public Ecu getEcu(long ecuId) {
        return ecuRepository.findById(ecuId).get();
    }

    @Override
    public void addEcus(List<Ecu> Ecus) {
        ecuRepository.saveAll(Ecus);
    }

    @Override
    public void addEcu(Ecu ecu) {
        ecuRepository.save(ecu);
    }
}
