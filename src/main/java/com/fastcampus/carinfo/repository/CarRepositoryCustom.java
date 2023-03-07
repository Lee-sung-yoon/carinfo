package com.fastcampus.carinfo.repository;

import com.fastcampus.carinfo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepositoryCustom {
    List<Car> getCarListByFetchJoin();
}
