package com.ronlu.CarInformationService.api;

import com.ronlu.CarInformationService.data.CarBoundary;
import com.ronlu.CarInformationService.logic.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CarController {
    private CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }



    @RequestMapping(
            method = RequestMethod.GET,
            path = "/cars/v1/get-car/{carLicenseNumber}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CarBoundary getCarByLicenseNumber(@PathVariable("carLicenseNumber") String carLicenseNumber){
        return service.getCar(carLicenseNumber);
    }
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/cars/v1/get-cars",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<CarBoundary> getCars(){
        return service.getCars();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/cars/v1/get-cars/color/{color}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<CarBoundary> getCarsByColor(@PathVariable("color") String color){
        return service.getCarsByColor(color);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/cars/v1/get-cars/manufacture/{manufacture}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<CarBoundary> getCarsByManufacture(@PathVariable("manufacture") String manufacture){
        return service.getCarsByManufacture(manufacture);
    }
}


