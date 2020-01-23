package com.mukit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mukit.model.data.CustomerMasterData;

public interface CustomerMasterRepository extends JpaRepository<CustomerMasterData, Integer>{

	@Query("SELECT g.amount FROM CustomerMasterData g where g.customerId=:customerId")
	public Double findMasterAmountByCustomerId(Integer customerId);

}
