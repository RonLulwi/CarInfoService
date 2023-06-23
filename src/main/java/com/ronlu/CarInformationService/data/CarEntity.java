package com.ronlu.CarInformationService.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @Column(name = "license_number")
    private String licenseNumber;
    @Column(name = "manufacture")
    private String manufacture;
    @Column(name = "manufacture_year")
    private String manufactureYear;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "color")
    private String color;
    @Column(name = "finish_level")
    private String finishLevel;
    @Column(name = "current_ownership")
    private String currentOwnership;

    public CarEntity() {
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFinishLevel() {
        return finishLevel;
    }

    public void setFinishLevel(String finishLevel) {
        this.finishLevel = finishLevel;
    }

    public String getCurrentOwnership() {
        return currentOwnership;
    }

    public void setCurrentOwnership(String currentOwnership) {
        this.currentOwnership = currentOwnership;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", manufactureYear='" + manufactureYear + '\'' +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", finishLevel='" + finishLevel + '\'' +
                ", currentOwnership='" + currentOwnership + '\'' +
                '}';
    }
}
