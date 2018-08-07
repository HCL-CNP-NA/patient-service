package com.hcl.cnp.patientservice.repository;

import com.hcl.cnp.patientservice.domain.PatientIdentifierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tech Support on 8/6/2018.
 */
@Repository
public interface PatientIdentifierRepository extends JpaRepository<PatientIdentifierEntity, Integer> {
}
