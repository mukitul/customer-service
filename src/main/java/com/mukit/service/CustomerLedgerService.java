package com.mukit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mukit.common.Converter;
import com.mukit.model.data.CustomerLedgerData;
import com.mukit.model.view.CustomerLedgerView;
import com.mukit.model.view.CustomerMasterView;
import com.mukit.repository.CustomerLedgerRepository;

@Service
public class CustomerLedgerService {

	@Autowired
	private CustomerLedgerRepository customerLedgerRepository;

	@Autowired
	private CustomerMasterService customerMasterServiceImplementation;

	public boolean save(CustomerLedgerView customerLedgerView) {
		CustomerLedgerData customerLedgerData = new CustomerLedgerData();

		Integer customerId = customerLedgerView.getCustomerId();
		String transactionType = customerLedgerView.getTransactionType();

		CustomerMasterView customerMaster = customerMasterServiceImplementation.findCustomerById(customerId);

		Double ledgerAmount = customerLedgerView.getAmount();
		Double masterAmount = customerMaster.getAmount();

		try {
			if (transactionType.equals("debit")) {
				System.out.println("debit");
				if (masterAmount < ledgerAmount)
					return false;

				customerMaster.setAmount(masterAmount - ledgerAmount);
			}
			if (transactionType.equals("credit")) {
				System.out.println("credit");
				customerMaster.setAmount(masterAmount + ledgerAmount);
				System.out.println(customerLedgerView.toString());
			}

			Converter.viewToDataModelConverterForLedger(customerLedgerView, customerLedgerData);
			customerLedgerRepository.save(customerLedgerData);

			customerMasterServiceImplementation.save(customerMaster);

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public CustomerLedgerView findByCustomerId(Integer cId) {
		CustomerLedgerView customerLedgerView = new CustomerLedgerView();
		try {
			CustomerLedgerData data = customerLedgerRepository.findByCustomerId(cId);
			Converter.dataToViewModelConverterForLedger(customerLedgerView, data);
			System.out.println(customerLedgerView.toString());

		} catch (Exception e) {

		}

		return customerLedgerView;
	}

	public List<CustomerLedgerView> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
