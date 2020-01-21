package com.mukit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukit.model.view.CustomerMasterView;

public interface CustomerMasterRepository extends JpaRepository<CustomerMasterView, Integer>{

}
