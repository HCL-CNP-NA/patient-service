package com.hcl.cnp.patientservice.domain;

/**
 * Created by Tech Support on 7/29/2018.
 */
public class Observation {

    private String id;
    private String description;
    private Patient patientId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Observation() {
    }

    public Observation(String id, String description, Patient patientId) {
        this.id = id;
        this.description = description;
        this.patientId = patientId;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }
}
