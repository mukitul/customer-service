package com.mukit.controller;

import java.util.ArrayList;
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

import com.mukit.common.request.post.PostRequestEntity;
import com.mukit.common.response.get.GetRequestResponseBody;
import com.mukit.common.response.get.GetRequestResponseEntityForList;
import com.mukit.model.view.CustomerMasterView;
import com.mukit.service.CustomerMasterService;

@CrossOrigin
@RestController
@RequestMapping("customermaster")
public class CustomerMasterController {
	@Autowired
	CustomerMasterService customerMasterServiceImplementation;

	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody PostRequestEntity<CustomerMasterView> postRequestEntity) {

		CustomerMasterView customerMasterView = new CustomerMasterView();
		customerMasterView = (CustomerMasterView) postRequestEntity.data.attributes;
		boolean success = customerMasterServiceImplementation.save(customerMasterView);
		if (success) {
			System.out.println("SUCCESS!!!");
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		System.out.println("Failed!!!");
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}

	@GetMapping
	public ResponseEntity<?> findAll() {
		GetRequestResponseEntityForList<CustomerMasterView, Integer> responseObject = new GetRequestResponseEntityForList<CustomerMasterView, Integer>();
		List<CustomerMasterView> customerMasterList = customerMasterServiceImplementation.findAll();
		if (customerMasterList != null) {
			List<GetRequestResponseBody<CustomerMasterView, Integer>> responseBody = new ArrayList<GetRequestResponseBody<CustomerMasterView, Integer>>();
			for (int i = 0; i < customerMasterList.size(); i++) {
				GetRequestResponseBody<CustomerMasterView, Integer> getRequestResponseBody = new GetRequestResponseBody<CustomerMasterView, Integer>();
				getRequestResponseBody.id = customerMasterList.get(i).getId();
				getRequestResponseBody.type = "customermaster";
				getRequestResponseBody.attributes = customerMasterList.get(i);
				responseBody.add(getRequestResponseBody);
			}
			responseObject.data = responseBody;
			return new ResponseEntity<GetRequestResponseEntityForList<CustomerMasterView, Integer>>(responseObject,
					HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
