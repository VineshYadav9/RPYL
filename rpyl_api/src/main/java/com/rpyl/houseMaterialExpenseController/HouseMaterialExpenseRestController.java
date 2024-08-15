package com.rpyl.houseMaterialExpenseController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpyl.HouseMaterialExpenseService.HouseMaterialExpenseService;
import com.rpyl.houseMaterialExpense.HouseMaterialExpense;

@RestController
@RequestMapping("/materialExpense")
@CrossOrigin(origins = "http://localhost:4200")

public class HouseMaterialExpenseRestController {
	
	    @Autowired(required = false)
		private HouseMaterialExpenseService houseMaterialExpenseService;

		@PostMapping("/createHouseExpense")
		public ResponseEntity<HouseMaterialExpense> createExpense(@RequestBody HouseMaterialExpense HouseMaterialExpense) {
			HouseMaterialExpense ExpenseCreated = this.houseMaterialExpenseService.createExpense(HouseMaterialExpense);
			return new ResponseEntity<HouseMaterialExpense>(ExpenseCreated, HttpStatus.CREATED);
		}
		

		@GetMapping("/Expense")
		public ResponseEntity<List<HouseMaterialExpense>> getAllHouseMaterialExpense(HouseMaterialExpense HouseMaterialExpense) {
			List<HouseMaterialExpense> houseMaterialExpenseList = this.houseMaterialExpenseService.getAllHouseMaterialExpense();
			return new ResponseEntity<List<HouseMaterialExpense>>(houseMaterialExpenseList, HttpStatus.OK);
		}
}
