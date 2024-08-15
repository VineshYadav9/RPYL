package com.rpyl.driverRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rpyl.driverEntity.DriverEntity;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {

}
