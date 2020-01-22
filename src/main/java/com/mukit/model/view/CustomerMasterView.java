package com.mukit.model.view;

public class CustomerMasterView {
	private Integer id;
	private Integer customerId;
	private Double amount;
	private Long lastTransactionDate;
	
	
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



	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(Long lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	public CustomerMasterView() {
		
	}

	public CustomerMasterView(Integer id, Integer customerId, Double amount, Long lastTransactionDate) {
		this.id = id;
		this.customerId = customerId;
		this.amount = amount;
		this.lastTransactionDate = lastTransactionDate;
	}

	@Override
	public String toString() {
		return "CustomerMasterView [id=" + id + ", customerId=" + customerId + ", amount=" + amount
				+ ", lastTransactionDate=" + lastTransactionDate + "]";
	}
	
	
	
	
	
	
}
