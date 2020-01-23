package com.mukit.model.view;

public class CustomerLedgerView {
	private Integer transactionId;
	private Integer batchId;
	private Integer customerId;
	private String transactionType;
	private Double amount;
	private Long transactionDate;
	
	
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getBatchId() {
		return batchId;
	}
	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Long getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Long transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	public CustomerLedgerView() {

	}
	
	public CustomerLedgerView(Integer transactionId, Integer batchId, Integer customerId, String transactionType,
			Double amount, Long transactionDate) {

		this.transactionId = transactionId;
		this.batchId = batchId;
		this.customerId = customerId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}
	@Override
	public String toString() {
		return "CustomerLedgerView [transactionId=" + transactionId + ", batchId=" + batchId + ", customerId="
				+ customerId + ", transactionType=" + transactionType + ", amount=" + amount + ", transactionDate="
				+ transactionDate + "]";
	}
	
	
}
