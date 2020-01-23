package com.mukit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mukit.model.data.CustomerLedgerData;


public interface CustomerLedgerRepository extends JpaRepository<CustomerLedgerData, Integer>{
	@Query("SELECT g FROM CustomerLedgerData g where g.customerId=:customerId")
	public CustomerLedgerData findByCustomerId(@Param("customerId") Integer customerId);
}
