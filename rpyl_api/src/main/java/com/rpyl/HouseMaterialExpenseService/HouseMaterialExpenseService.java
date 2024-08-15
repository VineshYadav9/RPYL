package com.rpyl.HouseMaterialExpenseService;

import java.util.List;

import com.rpyl.houseMaterialExpense.HouseMaterialExpense;



public interface HouseMaterialExpenseService {

	public HouseMaterialExpense createExpense(HouseMaterialExpense  houseMaterialExpense);
	public HouseMaterialExpense getHouseMaterialExpenseById(Long id);
	public List<HouseMaterialExpense> getAllHouseMaterialExpense();
}
