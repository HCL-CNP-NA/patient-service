package com.hcl.cnp.patientservice.repository;

import com.hcl.cnp.patientservice.domain.Observation;
import com.hcl.cnp.patientservice.domain.Patient;
import com.hcl.cnp.patientservice.domain.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Tech Support on 7/29/2018.
 */
@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {

}
