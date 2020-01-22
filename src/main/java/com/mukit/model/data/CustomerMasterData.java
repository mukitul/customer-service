package com.mukit.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer_master")
public class CustomerMasterData {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	
	@NotNull
	@Column(name = "customer_id")
	private Integer customerId;

	@NotNull
	@Column(name = "amount")
	private Double amount;
	

	@Column(name = "last_transaction_date")
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


	public CustomerMasterData() {
		
	}


	public CustomerMasterData(Integer id, @NotNull Integer customerId, @NotNull Double amount,
			Long lastTransactionDate) {
		this.id = id;
		this.customerId = customerId;
		this.amount = amount;
		this.lastTransactionDate = lastTransactionDate;
	}


	@Override
	public String toString() {
		return "CustomerMasterData [id=" + id + ", customerId=" + customerId + ", amount=" + amount
				+ ", lastTransactionDate=" + lastTransactionDate + "]";
	}
	
	
	
	
	
	
	
}
