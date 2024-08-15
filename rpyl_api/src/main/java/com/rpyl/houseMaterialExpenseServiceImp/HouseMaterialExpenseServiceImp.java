package com.rpyl.houseMaterialExpenseServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpyl.HouseMaterialExpenseRepository.HouseMaterialExpenseRepository;
import com.rpyl.HouseMaterialExpenseService.HouseMaterialExpenseService;
import com.rpyl.houseMaterialExpense.HouseMaterialExpense;

@Service
public class HouseMaterialExpenseServiceImp implements HouseMaterialExpenseService {
	
	@Autowired
	private HouseMaterialExpenseRepository houseMaterialExpenseRepository;

	@Override
	public List<HouseMaterialExpense> getAllHouseMaterialExpense() {	
		return houseMaterialExpenseRepository.findAll();
	}

	@Override
	public HouseMaterialExpense createExpense(HouseMaterialExpense houseMaterialExpense) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HouseMaterialExpense getHouseMaterialExpenseById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
