package com.hcl.cnp.patientservice.rest;

import com.hcl.cnp.patientservice.domain.Patient;
import com.hcl.cnp.patientservice.domain.PatientEntity;
import com.hcl.cnp.patientservice.service.PatientService;
import com.hcl.cnp.patientservice.service.client.ObservationServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tech Support on 7/22/2018.
 */
@RestController
public class PatientResource {

    @Autowired
    PatientService patientService;

    @Autowired
    ObservationServiceClient observationServiceClient;

    @GetMapping(path = "/test-patient")
    public String testRest() {
        return "Patient service working";
    }

    @GetMapping(path = "/find-all-fake")
    public List<Patient> findAllFake() {
        return patientService.findAllFake();
    }

    @GetMapping(path = "/find-one/{id}")
    public Patient findById(@PathVariable String id) {
        return patientService.findById(id).stream().findFirst().get();
    }

    @GetMapping(path = "/find-one/{id}/with-observations")
    public Patient findWithObservations(@PathVariable("id") String id) {
        Patient patient = patientService.findById(id).stream().findFirst().get();
        patient.setObservations(observationServiceClient.findByPatient(id));
        return patient;
    }

    @GetMapping(path = "/find-all")
    public List<PatientEntity> findAll() {
        return patientService.findAll();
    }

}
