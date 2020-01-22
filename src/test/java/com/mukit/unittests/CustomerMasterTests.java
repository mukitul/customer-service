package com.mukit.unittests;

import static org.junit.Assert.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mukit.model.data.CustomerMasterData;
import com.mukit.model.view.CustomerMasterView;
import com.mukit.repository.CustomerMasterRepository;
import com.mukit.service.implementation.CustomerMasterServiceImplementation;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerMasterTests {

	/*
	 * @Autowired private CustomerMasterRepository customerMasterRepository;
	 */
	
	@Autowired
	private CustomerMasterServiceImplementation customerMasterServiceImplementation;
	
	/*
	 * @Before public void setUp() { customerMasterRepository.save(new
	 * CustomerMasterData(1, 12)); customerMasterRepository.save(new
	 * CustomerMasterData(2, 0)); }
	 */

	@Test
	public void save() {
		boolean saveResult = customerMasterServiceImplementation.save(new CustomerMasterView(3, 12));
		assertEquals("Passed", true, saveResult);
	}

}
