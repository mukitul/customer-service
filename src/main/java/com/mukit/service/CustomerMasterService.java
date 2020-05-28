package com.mukit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mukit.common.Converter;
import com.mukit.model.data.CustomerMasterData;
import com.mukit.model.view.CustomerMasterView;
import com.mukit.repository.CustomerMasterRepository;

@Service
public class CustomerMasterService {

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

	public List<CustomerMasterView> findAll() {
		List<CustomerMasterView> customerMasterList = new ArrayList<CustomerMasterView>();
		try {
			List<CustomerMasterData> data = customerMasterRepository.findAll();
			Converter.dataToViewModelConverterForList(customerMasterList, data);

		} catch (Exception e) {

		}
		return customerMasterList;

	}

	public CustomerMasterView findCustomerById(Integer customerId) {
		CustomerMasterView customerMaster = new CustomerMasterView();
		try {
			CustomerMasterData data = customerMasterRepository.getOne(customerId);
			Converter.dataToViewModelConverter(customerMaster, data);

		} catch (Exception e) {

		}
		return customerMaster;

	}

	public Double getCustomerMasterAmountById(Integer customerId) {
		Double data = null;
		try {
			data = customerMasterRepository.findMasterAmountByCustomerId(customerId);
		} catch (Exception e) {

		}

		return data;
	}

}
