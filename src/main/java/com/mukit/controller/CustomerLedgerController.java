package com.mukit.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RestController;

import com.mukit.common.request.post.PostRequestEntity;
import com.mukit.common.response.get.GetRequestResponseBody;
import com.mukit.common.response.get.GetRequestResponseEntity;
import com.mukit.common.response.get.GetRequestResponseEntityForList;
import com.mukit.model.view.CustomerLedgerView;
import com.mukit.service.CustomerLedgerService;

@CrossOrigin
@RestController
@RequestMapping("customerledger")
public class CustomerLedgerController {

	@Autowired
	CustomerLedgerService customerLedgerServiceImplementation;

	@PostMapping
	public ResponseEntity<?> addLedger(@RequestBody PostRequestEntity<CustomerLedgerView> postRequestEntity) {

		CustomerLedgerView customerLedgerView = new CustomerLedgerView();
		customerLedgerView = (CustomerLedgerView) postRequestEntity.data.attributes;
		boolean success = customerLedgerServiceImplementation.save(customerLedgerView);
		if (success) {
			System.out.println("SUCCESS!!!");
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		System.out.println("Failed!!!");
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/customerId/{customerId}")
	public ResponseEntity<?> findByCustomerId(@PathVariable("customerId") Integer cId) {
		GetRequestResponseEntity<CustomerLedgerView, Integer> responseObject = new GetRequestResponseEntity<CustomerLedgerView, Integer>();
		CustomerLedgerView customerLedger = customerLedgerServiceImplementation.findByCustomerId(cId);
		if (customerLedger != null) {
			GetRequestResponseBody<CustomerLedgerView, Integer> responseBody = new GetRequestResponseBody<CustomerLedgerView, Integer>();
			responseBody.id = customerLedger.getTransactionId();
			responseBody.type = "customerledger";
			responseBody.attributes = customerLedger;

			responseObject.data = responseBody;
			return new ResponseEntity<GetRequestResponseEntity<CustomerLedgerView, Integer>>(responseObject,
					HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping
	public ResponseEntity<?> findAll() {
		GetRequestResponseEntityForList<CustomerLedgerView, Integer> responseObject = new GetRequestResponseEntityForList<CustomerLedgerView, Integer>();
		List<CustomerLedgerView> customerLedgerList = customerLedgerServiceImplementation.findAll();
		if (customerLedgerList != null) {
			List<GetRequestResponseBody<CustomerLedgerView, Integer>> responseBody = new ArrayList<GetRequestResponseBody<CustomerLedgerView, Integer>>();
			for (int i = 0; i < customerLedgerList.size(); i++) {
				GetRequestResponseBody<CustomerLedgerView, Integer> getRequestResponseBody = new GetRequestResponseBody<CustomerLedgerView, Integer>();
				getRequestResponseBody.id = customerLedgerList.get(i).getTransactionId();
				getRequestResponseBody.type = "customermaster";
				getRequestResponseBody.attributes = customerLedgerList.get(i);
				responseBody.add(getRequestResponseBody);
			}
			responseObject.data = responseBody;
			return new ResponseEntity<GetRequestResponseEntityForList<CustomerLedgerView, Integer>>(responseObject,
					HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}
}
