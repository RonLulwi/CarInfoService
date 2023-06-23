package com.ronlu.CarInformationService.logic;

import com.ronlu.CarInformationService.data.CarBoundary;
import java.util.List;

public interface CarService {

    CarBoundary getCar(String licenseNumber);
    List<CarBoundary> getCars();
    List<CarBoundary> getCarsByColor(String color);
    List<CarBoundary> getCarsByManufacture(String manufacture);



}
