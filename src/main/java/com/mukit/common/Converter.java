package com.mukit.common;

import java.util.List;

import com.mukit.model.data.CustomerMasterData;
import com.mukit.model.view.CustomerMasterView;

public class Converter {

	public static void viewToDataModelConverter(CustomerMasterView viewModel, CustomerMasterData dataModel) {
		dataModel.setId(viewModel.getId());
		dataModel.setCustomerId(viewModel.getCustomerId());
	}

}
