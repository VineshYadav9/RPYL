package com.rpyl.driverRestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rpyl.driverEntity.DriverEntity;
import com.rpyl.driverService.DriverService;

@RestController
@RequestMapping("/driver")
@CrossOrigin(origins = "http://localhost:4200")
public class DriverRestController {
	
	@Autowired
	private DriverService driverService;

	@PostMapping("/create")
	public ResponseEntity<DriverEntity> createDriver(@RequestBody DriverEntity driverEntity) {
		DriverEntity driverCreated = this.driverService.createDriver(driverEntity);
		return new ResponseEntity<DriverEntity>(driverCreated, HttpStatus.CREATED);
	}

	@GetMapping("/drivers")
	public ResponseEntity<List<DriverEntity>> getAllDrivers(DriverEntity driverEntity) {
		List<DriverEntity> driverList = this.driverService.getAllDriver();
		return new ResponseEntity<List<DriverEntity>>(driverList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/driver/{id}", method = RequestMethod.GET)
	public ResponseEntity<DriverEntity> getDriver(@PathVariable("id") Long id) {
		DriverEntity driverDetails = this.driverService.getDriverById(id);
		return new ResponseEntity<DriverEntity>(driverDetails, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/drivers/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object>  updateProduct(@PathVariable("id") String id, @RequestBody DriverEntity driverEntity) {	      
//			driverService.updateProduct(id, driverEntity);
	      return new ResponseEntity<Object>("Updated successfully", HttpStatus.OK);
	   }
}