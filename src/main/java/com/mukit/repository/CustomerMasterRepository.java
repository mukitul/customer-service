package com.mukit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukit.model.data.CustomerMasterData;

public interface CustomerMasterRepository extends JpaRepository<CustomerMasterData, Integer>{

}
