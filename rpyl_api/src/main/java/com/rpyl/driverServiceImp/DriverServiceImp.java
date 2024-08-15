package com.rpyl.driverServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpyl.driverEntity.DriverEntity;
import com.rpyl.driverRepository.DriverRepository;
import com.rpyl.driverService.DriverService;

@Service
public class DriverServiceImp implements DriverService {

	@Autowired
	private DriverRepository driverRepository;

	@Override
	public DriverEntity createDriver(DriverEntity driverEntity) {
		DriverEntity driverSavedToDB = this.driverRepository.save(driverEntity);
		return driverSavedToDB;
	}

	@Override
	public List<DriverEntity> getAllDriver() {	
		return driverRepository.findAll();
	}

	@Override
	public DriverEntity getDriverById(Long id) {
		return driverRepository.findById(id).get();
	}

}
