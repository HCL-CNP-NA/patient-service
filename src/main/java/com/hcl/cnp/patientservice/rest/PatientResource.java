package com.hcl.cnp.patientservice.rest;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.hcl.cnp.patientservice.domain.Patient;
import com.hcl.cnp.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by Tech Support on 7/22/2018.
 */
@RestController
public class PatientResource {

    @Autowired
    PatientService patientService;

    @GetMapping(path = "/test-patient")
    public String testRest() {
        return "Patient service working";
    }

    @GetMapping(path = "/find-all")
    public List<Patient> findAll() {
        return patientService.findAll();
    }

    @GetMapping(path = "/patient/{id}")
    public Patient findById(@PathVariable String id) {
        Optional<Patient> patient = patientService.findById(id);

        if (patient.isPresent())
            return patient.get();
        return null;
    }

}
