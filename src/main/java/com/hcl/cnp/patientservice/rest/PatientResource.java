package com.hcl.cnp.patientservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tech Support on 7/22/2018.
 */
@RestController
@RequestMapping(path = "/patient")
public class PatientResource {

    @GetMapping(path = "/test-patient")
    public String testRest() {
        return "Patient service working";
    }
}
