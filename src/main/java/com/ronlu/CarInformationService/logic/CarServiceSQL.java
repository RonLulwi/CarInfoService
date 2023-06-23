package com.ronlu.CarInformationService.logic;

import com.ronlu.CarInformationService.data.CarBoundary;
import com.ronlu.CarInformationService.logic.convertors.CarConvertor;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceSQL implements CarService{
    private CarCrud crud;
    private CarConvertor convertor;
    private RestTemplate restTemplate;

    @Autowired
    public CarServiceSQL(CarCrud crud, CarConvertor convertor) {
        this.crud = crud;
        this.convertor =convertor;
    }

    @PostConstruct
    public void init(){
        this.restTemplate = new RestTemplate();
    }

    @Override
    public CarBoundary getCar(String licenseNumber) {
        return convertor.toBoundary(this.crud.findByLicenseNumber(licenseNumber));
    }

    @Override
    public List<CarBoundary> getCars() {
        return crud.findAll()
                .stream()
                .map(convertor::toBoundary)
                .collect(Collectors.toList());
    }

    @Override
    public List<CarBoundary> getCarsByColor(String color) {
        return crud.findAllByColor(color)
                .stream()
                .map(convertor::toBoundary)
                .collect(Collectors.toList());
    }

    @Override
    public List<CarBoundary> getCarsByManufacture(String manufacture) {
        return crud.findAllByManufacture(manufacture)
                .stream()
                .map(convertor::toBoundary)
                .collect(Collectors.toList());
    }
}
