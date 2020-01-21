package com.mukit.model.view;

public class CustomerMasterView {
	private Integer id;
	private Integer customerId;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}




	public CustomerMasterView() {
		
	}

	public CustomerMasterView(Integer id, Integer customerId) {
		this.id = id;
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "CustomerMasterView [id=" + id + ", customerId=" + customerId + "]";
	}
	
	
	
	
}
