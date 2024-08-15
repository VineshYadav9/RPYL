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

import com.rpyl.driverEntity.LoadingDetailsEntity;
import com.rpyl.driverService.LoadingDetailsService;

@RestController
@RequestMapping("/loading")
@CrossOrigin(origins = "http://localhost:4200")
public class LoadingDetailsController {
	@Autowired
	private LoadingDetailsService loadingDetailsService;

	@PostMapping("/create")
	public ResponseEntity<LoadingDetailsEntity> createLoadingDetails(@RequestBody LoadingDetailsEntity loadingDetailsEntity) {
		LoadingDetailsEntity loadingCreated = this.loadingDetailsService.createLoadingDetails(loadingDetailsEntity);
		return new ResponseEntity<LoadingDetailsEntity>(loadingCreated, HttpStatus.CREATED);
	}

	@GetMapping("/loadingDetails")
	public ResponseEntity<List<LoadingDetailsEntity>> getAllLoading(LoadingDetailsEntity loadingDetailsEntity) {
		List<LoadingDetailsEntity> loadingDetailsList = this.loadingDetailsService.getAllLoadingDetails();
		return new ResponseEntity<List<LoadingDetailsEntity>>(loadingDetailsList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/loadingDetails/{id}", method = RequestMethod.GET)
	public ResponseEntity<LoadingDetailsEntity> getLoadingDetails(@PathVariable("id") Long id) {
		LoadingDetailsEntity loadingDetails = this.loadingDetailsService.getLoadingById(id);
		return new ResponseEntity<LoadingDetailsEntity>(loadingDetails, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/loadingDetails/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object>  updateProduct(@PathVariable("id") String id, @RequestBody LoadingDetailsEntity loadingDetailsEntity) {	      
//			driverService.updateProduct(id, driverEntity);
	      return new ResponseEntity<Object>("Updated successfully", HttpStatus.OK);
	   }
}
