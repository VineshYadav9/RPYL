package com.rpyl.driverServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpyl.driverEntity.LoadingDetailsEntity;
import com.rpyl.driverRepository.LoadingDetailsRepository;
import com.rpyl.driverService.LoadingDetailsService;

@Service
public class LoadingDetailsServiceImp implements LoadingDetailsService {

	@Autowired
	private LoadingDetailsRepository loadingDetailsRepository;

	@Override
	public LoadingDetailsEntity createLoadingDetails(LoadingDetailsEntity loadingDetailsEntity) {
		LoadingDetailsEntity loadingSavedToDB = this.loadingDetailsRepository.save(loadingDetailsEntity);
		return loadingSavedToDB;
	}

	@Override
	public List<LoadingDetailsEntity> getAllLoadingDetails() {	
		return loadingDetailsRepository.findAll();
	}

	@Override
	public LoadingDetailsEntity getLoadingById(Long id) {
		return loadingDetailsRepository.findById(id).get();
	}

}
