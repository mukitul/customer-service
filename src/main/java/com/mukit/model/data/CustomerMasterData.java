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


	public CustomerMasterData() {
		
	}
	
	public CustomerMasterData(Integer id, @NotNull Integer customerId) {
		super();
		this.id = id;
		this.customerId = customerId;
	}


	@Override
	public String toString() {
		return "CustomerMasterData [id=" + id + ", customerId=" + customerId + "]";
	}
	
	
	
	
}
