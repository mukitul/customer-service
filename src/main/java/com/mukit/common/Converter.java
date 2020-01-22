package com.mukit.common;

import java.util.List;

import com.mukit.model.data.CustomerMasterData;
import com.mukit.model.view.CustomerMasterView;

public class Converter {

	public static void viewToDataModelConverter(CustomerMasterView viewModel, CustomerMasterData dataModel) {
		dataModel.setId(viewModel.getId());
		dataModel.setCustomerId(viewModel.getCustomerId());
		dataModel.setAmount(viewModel.getAmount());
		dataModel.setLastTransactionDate(viewModel.getLastTransactionDate());
	}
	
	public static void dataToViewModelConverter(CustomerMasterView viewModel, CustomerMasterData dataModel) {
		viewModel.setId(dataModel.getId());
		viewModel.setCustomerId(dataModel.getCustomerId());
		viewModel.setAmount(dataModel.getAmount());
		viewModel.setLastTransactionDate(dataModel.getLastTransactionDate());
	}

	public static void dataToViewModelConverterForList(List<CustomerMasterView> viewModel,
			List<CustomerMasterData> dataModel) {
		for(int i=0;i<dataModel.size();i++) {
			CustomerMasterView customerMasterView = new CustomerMasterView();
			dataToViewModelConverter(customerMasterView,dataModel.get(i));
			viewModel.add(customerMasterView);
		}
	}

}
