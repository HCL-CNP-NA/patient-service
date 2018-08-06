package com.hcl.cnp.patientservice.repository;

import com.hcl.cnp.patientservice.domain.PatientIdentifierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tech Support on 8/6/2018.
 */
public interface PatientIdentifierRepository extends JpaRepository<PatientIdentifierEntity, Integer> {
}
