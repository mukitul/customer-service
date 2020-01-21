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

		System.out.println("111111");
		CustomerMasterView customerMasterView = new CustomerMasterView();
		System.out.println("222222");
		customerMasterView = (CustomerMasterView) postRequestEntity.data.attributes;
		System.out.println("333333");
		System.out.println(customerMasterView);
		customerMasterServiceImplementation.save(customerMasterView);
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}
}
