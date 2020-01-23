package com.mukit.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer_ledger")
public class CustomerLedgerData {
	
	@Id
	@Column(name = "transaction_id")
	private Integer transactionId;
	
	@NotNull
	@Column(name = "batch_id")
	private Integer batchId;
	
	
	@NotNull
	@Column(name = "customer_id")
	private Integer customerId;
	
	@NotNull
	@Column(name = "transaction_type")
	private String transactionType;
	

	
	@NotNull
	@Column(name = "amount")
	private Double amount;
	
	
	@NotNull
	@Column(name = "transaction_date")
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


	public CustomerLedgerData() {
		
	}
	
	public CustomerLedgerData(Integer transactionId, @NotNull Integer batchId, @NotNull Integer customerId,
			@NotNull String transactionType, @NotNull Double amount, @NotNull Long transactionDate) {
		super();
		this.transactionId = transactionId;
		this.batchId = batchId;
		this.customerId = customerId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}


	@Override
	public String toString() {
		return "CustomerLedgerData [transactionId=" + transactionId + ", batchId=" + batchId + ", customerId="
				+ customerId + ", transactionType=" + transactionType + ", amount=" + amount + ", transactionDate="
				+ transactionDate + "]";
	}
	
}
