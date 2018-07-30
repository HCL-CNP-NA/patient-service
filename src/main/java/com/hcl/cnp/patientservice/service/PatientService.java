package com.hcl.cnp.patientservice.service;

import com.hcl.cnp.patientservice.domain.Patient;

import java.util.List;

/**
 * Created by Tech Support on 7/20/2018.
 */
public interface PatientService {

    List<Patient> findAll();

    List<Patient> findById(String id);
}
