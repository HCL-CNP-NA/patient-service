package com.hcl.cnp.patientservice;

import com.hcl.cnp.patientservice.domain.PatientEntity;
import com.hcl.cnp.patientservice.repository.PatientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceApplicationTests {

	@Autowired
	PatientRepository patientRepository;

//	@Test
//	public void contextLoads() {
//	}

	@Test
	public void repository() {
		List<PatientEntity> list = patientRepository.findAll();
		System.out.print(list);
	}

}
