package com.hcl.cnp.patientservice.repository;

import com.hcl.cnp.patientservice.domain.Observation;
import com.hcl.cnp.patientservice.domain.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Tech Support on 7/29/2018.
 */
public class PatientRepository {

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

    public List<Patient> findAll() {
        return patients;
    }

    public List<Patient> findByObservation(Observation observation) {
        return patients.stream().filter(p -> p.getObservations().contains(observation)).collect(Collectors.toList());
    }


}
