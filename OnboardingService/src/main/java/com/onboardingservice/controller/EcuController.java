package com.onboardingservice.controller;

import com.onboardingservice.VO.ResponseTemplateVO;
import com.onboardingservice.VO.Vehicle;
import com.onboardingservice.model.Ecu;
import com.onboardingservice.service.EcuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/Ecus")
@Slf4j
public class EcuController {

    public static final String GET_VEHICLE_BY_ID_URL = "http://localhost:8080/vehicles/";
    private final EcuService ecuService;

    private final RestTemplate restTemplate;

    public EcuController(EcuService ecuService, RestTemplate restTemplate) {
        this.ecuService = ecuService;
        this.restTemplate = restTemplate;

    }

    @GetMapping
    public ResponseEntity<List<Ecu>> getEcus(){

        return new ResponseEntity<>(ecuService.getAllEcus(), HttpStatus.OK);
    }

    @GetMapping("/{ecuId}")
    public ResponseEntity<Ecu> getEcu(@PathVariable long ecuId){

        return new ResponseEntity<>(ecuService.getEcu(ecuId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> AddEcus(@RequestBody List<Ecu> ecus){

        ecuService.addEcus(ecus);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/{ecuId}")
    public ResponseEntity<Void> AddEcu(@RequestBody Ecu ecu){

        ecuService.addEcu(ecu);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{ecuId}/vehicle")
    public ResponseEntity<ResponseTemplateVO> getVehicleWithEcu(@PathVariable long ecuId){

        ResponseTemplateVO vo = new ResponseTemplateVO();
        Ecu ecu = ecuService.getEcu(ecuId);
        Vehicle vehicle = restTemplate.getForObject("VehicleRegistrationApp" + ecu.getVehicleId(),Vehicle.class);
        vo.setEcu(ecu);
        vo.setVehicle(vehicle);
        vo.setVehicle(vehicle);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }


}
