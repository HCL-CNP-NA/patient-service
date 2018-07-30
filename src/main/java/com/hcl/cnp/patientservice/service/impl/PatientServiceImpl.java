package com.hcl.cnp.patientservice.service.impl;

import com.hcl.cnp.patientservice.domain.Patient;
import com.hcl.cnp.patientservice.repository.PatientRepository;
import com.hcl.cnp.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tech Support on 7/20/2018.
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public List<Patient> findById(String id) {
        return patientRepository.findByPatient(id);
    }

//    private static final List<Patient> patientList = new ArrayList<Patient>(
//            Arrays.asList(new Patient("001", "Mario", "Avalle"),
//                    new Patient("002", "Dario", "Vega"),
//                    new Patient("003", "Raul","Lopez"))
//    );
}
