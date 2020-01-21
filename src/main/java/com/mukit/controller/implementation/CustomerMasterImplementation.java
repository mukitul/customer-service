package com.mukit.controller.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mukit.common.request.post.PostRequestEntity;
import com.mukit.controller.interfaces.CustomerMaster;
import com.mukit.model.view.CustomerMasterView;
import com.mukit.service.implementation.CustomerMasterServiceImplementation;

@CrossOrigin
@RestController
@RequestMapping("customermaster")
public class CustomerMasterImplementation implements CustomerMaster {
	@Autowired
	CustomerMasterServiceImplementation customerMasterServiceImplementation;

	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody PostRequestEntity<CustomerMasterView> postRequestEntity) {

		CustomerMasterView customerMasterView = new CustomerMasterView();
		customerMasterView = (CustomerMasterView) postRequestEntity.data.attributes;
		boolean success = customerMasterServiceImplementation.save(customerMasterView);
		if(success) {
			System.out.println("SUCCESS!!!");
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		System.out.println("Failed!!!");
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}
}
