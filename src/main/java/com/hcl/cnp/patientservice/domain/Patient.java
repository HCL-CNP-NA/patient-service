package com.hcl.cnp.patientservice.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tech Support on 7/20/2018.
 */
public class Patient {

    private String id;
    private String firstName;
    private String lastName;
    private List<Observation> observations = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Patient() {}

    public Patient(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }
}
