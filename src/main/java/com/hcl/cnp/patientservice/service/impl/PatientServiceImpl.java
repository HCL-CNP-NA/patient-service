package com.hcl.cnp.patientservice.service.impl;

import com.hcl.cnp.patientservice.domain.Patient;
import com.hcl.cnp.patientservice.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Tech Support on 7/20/2018.
 */
@Service
public class PatientServiceImpl implements PatientService {

    public List<Patient> findAll() {
        return patientList;
    }

    public Optional<Patient> findById(String id) {
        return patientList.stream().filter(p -> p.getId().equalsIgnoreCase(id)).findAny();
    }

    private static final List<Patient> patientList = new ArrayList<Patient>(
            Arrays.asList(new Patient("001", "Mario", "Avalle"),
                    new Patient("002", "Dario", "Vega"),
                    new Patient("003", "Raul","Lopez"))
    );
}
