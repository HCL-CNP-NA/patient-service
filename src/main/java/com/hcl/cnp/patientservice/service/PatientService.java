package com.hcl.cnp.patientservice.service;

import com.hcl.cnp.patientservice.domain.Patient;

import java.util.List;
import java.util.Optional;

/**
 * Created by Tech Support on 7/20/2018.
 */
public interface PatientService {

    List<Patient> findAll();

    Optional<Patient> findById(String id);
}
