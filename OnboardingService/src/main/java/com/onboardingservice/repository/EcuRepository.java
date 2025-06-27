package com.onboardingservice.repository;

import com.onboardingservice.model.Ecu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcuRepository extends JpaRepository<Ecu, Long> {
}
