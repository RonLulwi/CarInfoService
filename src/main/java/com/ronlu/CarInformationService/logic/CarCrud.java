package com.ronlu.CarInformationService.logic;

import com.ronlu.CarInformationService.data.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.List;

@EnableJpaRepositories
@Repository
public interface CarCrud extends JpaRepository<CarEntity, String> {


    CarEntity findByLicenseNumber(String licenseNumber);
    List<CarEntity> findAllByColor(String color);

    List<CarEntity> findAllByManufacture(String manufacture);



}
