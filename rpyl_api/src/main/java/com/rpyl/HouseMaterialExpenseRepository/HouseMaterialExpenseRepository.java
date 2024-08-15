package com.rpyl.HouseMaterialExpenseRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpyl.houseMaterialExpense.HouseMaterialExpense;

@Repository
public interface HouseMaterialExpenseRepository extends JpaRepository<HouseMaterialExpense, Long>{

}
