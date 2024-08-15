package com.rpyl.driverService;

import java.util.List;

import com.rpyl.driverEntity.DriverEntity;

public interface DriverService {
	
	public DriverEntity createDriver(DriverEntity  driverEntity);
	public DriverEntity getDriverById(Long id);
	public List<DriverEntity> getAllDriver();
	 
}
