package com.hcl.cnp.patientservice.repository;

import com.hcl.cnp.patientservice.domain.PatientEntity;
import com.hcl.cnp.patientservice.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tech Support on 7/29/2018.
 */
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

}
