package com.rpyl.driverRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpyl.driverEntity.LoadingDetailsEntity;


	public interface LoadingDetailsRepository extends JpaRepository<LoadingDetailsEntity, Long> {
}
