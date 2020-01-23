package com.mukit.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mukit.common.Converter;
import com.mukit.model.data.CustomerLedgerData;
import com.mukit.model.view.CustomerLedgerView;
import com.mukit.repository.CustomerLedgerRepository;

@Service
public class CustomerLedgerServiceImplementation {

	@Autowired
	private CustomerLedgerRepository customerLedgerRepository;
	
	public boolean save(CustomerLedgerView customerLedgerView) {
		CustomerLedgerData customerLedgerData = new CustomerLedgerData();
		try {
			Converter.viewToDataModelConverterForLedger(customerLedgerView, customerLedgerData);
			customerLedgerRepository.save(customerLedgerData);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<CustomerLedgerView> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
