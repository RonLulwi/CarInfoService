package com.ronlu.CarInformationService.logic.convertors;

import com.ronlu.CarInformationService.data.CarBoundary;
import com.ronlu.CarInformationService.data.CarEntity;
import org.springframework.stereotype.Component;

@Component
public class CarConvertor {

    public CarEntity toEntity(CarBoundary boundary){
        CarEntity entity = new CarEntity();

        entity.setLicenseNumber(boundary.getLicenseNumber());
        entity.setManufacture(boundary.getManufacture());
        entity.setManufactureYear(boundary.getManufactureYear());
        entity.setModelName(boundary.getModelName());
        entity.setColor(boundary.getColor());
        entity.setFinishLevel(boundary.getFinishLevel());
        entity.setCurrentOwnership(boundary.getCurrentOwnership());
        entity.setImagePath(boundary.getImagePath());
        return entity;
    }

    public CarBoundary toBoundary(CarEntity entity){
        CarBoundary boundary = new CarBoundary();

        boundary.setLicenseNumber(entity.getLicenseNumber());
        boundary.setManufacture(entity.getManufacture());
        boundary.setManufactureYear(entity.getManufactureYear());
        boundary.setModelName(entity.getModelName());
        boundary.setColor(entity.getColor());
        boundary.setFinishLevel(entity.getFinishLevel());
        boundary.setCurrentOwnership(entity.getCurrentOwnership());
        boundary.setImagePath(entity.getImagePath());
        return boundary;
    }



}
