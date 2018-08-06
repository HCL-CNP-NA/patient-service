package com.hcl.cnp.patientservice.service.impl;

import com.hcl.cnp.patientservice.domain.Observation;
import com.hcl.cnp.patientservice.domain.Patient;
import com.hcl.cnp.patientservice.domain.PatientEntity;
import com.hcl.cnp.patientservice.repository.PatientRepository;
import com.hcl.cnp.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Tech Support on 7/20/2018.
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public List<Patient> findById(String id) {
        return null;
    }

    @Override
    public List<PatientEntity> findAll() {
        return patientRepository.findAll();
    }

    private List<Patient> patients = new ArrayList<>();

    public Patient add(Patient patient) {
        patient.setId(String.valueOf(patients.size()+1));
        patients.add(patient);
        return patient;
    }
//    public Patient findById(Long id) {
//        Optional<Patient> Patient = patients.stream().filter(a -> a.getId().equals(id)).findFirst();
//        if (Patient.isPresent())
//            return Patient.get();
//        else
//            return null;
//    }

    public List<Patient> findByPatient(String patientId) {
        return patients.stream().filter(p -> p.getId().equals(patientId)).collect(Collectors.toList());
    }

    public List<Patient> findAllFake() {
        return patients;
    }

    public List<Patient> findByObservation(Observation observation) {
        return patients.stream().filter(p -> p.getObservations().contains(observation)).collect(Collectors.toList());
    }

//    private static final List<Patient> patientList = new ArrayList<Patient>(
//            Arrays.asList(new Patient("001", "Mario", "Avalle"),
//                    new Patient("002", "Dario", "Vega"),
//                    new Patient("003", "Raul","Lopez"))
//    );
}
