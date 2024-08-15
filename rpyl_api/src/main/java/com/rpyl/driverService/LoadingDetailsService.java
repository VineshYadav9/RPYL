package com.rpyl.driverService;
import java.util.List;

import com.rpyl.driverEntity.LoadingDetailsEntity;

public interface LoadingDetailsService {
	public LoadingDetailsEntity createLoadingDetails(LoadingDetailsEntity  loadingDetailsEntity);
	public LoadingDetailsEntity getLoadingById(Long id);
	public List<LoadingDetailsEntity> getAllLoadingDetails();
	 
}
