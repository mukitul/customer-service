package com.mukit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukit.model.data.CustomerLedgerData;
import com.mukit.model.data.CustomerMasterData;

public interface CustomerLedgerRepository extends JpaRepository<CustomerLedgerData, Integer>{

}
