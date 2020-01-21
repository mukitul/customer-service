package com.mukit.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mukit.model.data.CustomerMasterData;
import com.mukit.model.view.CustomerMasterView;
import com.mukit.repository.CustomerMasterRepository;
import com.mukit.common.Converter;

@Service
public class CustomerMasterServiceImplementation {

	@Autowired
	private CustomerMasterRepository customerMasterRepository;

	public boolean save(CustomerMasterView customerMasterView) {
		CustomerMasterData customerMasterData = new CustomerMasterData();
		try {
			Converter.viewToDataModelConverter(customerMasterView, customerMasterData);
			customerMasterRepository.save(customerMasterData);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
