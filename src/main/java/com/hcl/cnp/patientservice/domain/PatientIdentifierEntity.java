package com.hcl.cnp.patientservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/6/2018.
 */
@Entity
@Table(name = "patient_identifier", schema = "openmrs", catalog = "")
public class PatientIdentifierEntity {

    @Id
    @Column(name = "patient_identifier_id")
    private Integer patientIdentifierId;

    @Basic
    @Column(name = "identifier")
    private String identifier;

    @Basic
    @Column(name = "preferred")
    private Byte preferred;

    @Basic
    @Column(name = "date_created")
    private Timestamp dateCreated;

    @Basic
    @Column(name = "date_changed")
    private Timestamp dateChanged;

    @Basic
    @Column(name = "voided")
    private Byte voided;

    @Basic
    @Column(name = "date_voided")
    private Timestamp dateVoided;

    @Basic
    @Column(name = "void_reason")
    private String voidReason;

    @Basic
    @Column(name = "uuid")
    private String uuid;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "patient_id", nullable = false)
    private PatientEntity patientByPatientId;

    public Integer getPatientIdentifierId() {
        return patientIdentifierId;
    }

    public void setPatientIdentifierId(Integer patientIdentifierId) {
        this.patientIdentifierId = patientIdentifierId;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Byte getPreferred() {
        return preferred;
    }

    public void setPreferred(Byte preferred) {
        this.preferred = preferred;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Timestamp dateChanged) {
        this.dateChanged = dateChanged;
    }

    public Byte getVoided() {
        return voided;
    }

    public void setVoided(Byte voided) {
        this.voided = voided;
    }

    public Timestamp getDateVoided() {
        return dateVoided;
    }

    public void setDateVoided(Timestamp dateVoided) {
        this.dateVoided = dateVoided;
    }

    public String getVoidReason() {
        return voidReason;
    }

    public void setVoidReason(String voidReason) {
        this.voidReason = voidReason;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientIdentifierEntity that = (PatientIdentifierEntity) o;

        if (patientIdentifierId != null ? !patientIdentifierId.equals(that.patientIdentifierId) : that.patientIdentifierId != null)
            return false;
        if (identifier != null ? !identifier.equals(that.identifier) : that.identifier != null) return false;
        if (preferred != null ? !preferred.equals(that.preferred) : that.preferred != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (dateChanged != null ? !dateChanged.equals(that.dateChanged) : that.dateChanged != null) return false;
        if (voided != null ? !voided.equals(that.voided) : that.voided != null) return false;
        if (dateVoided != null ? !dateVoided.equals(that.dateVoided) : that.dateVoided != null) return false;
        if (voidReason != null ? !voidReason.equals(that.voidReason) : that.voidReason != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = patientIdentifierId != null ? patientIdentifierId.hashCode() : 0;
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + (preferred != null ? preferred.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateChanged != null ? dateChanged.hashCode() : 0);
        result = 31 * result + (voided != null ? voided.hashCode() : 0);
        result = 31 * result + (dateVoided != null ? dateVoided.hashCode() : 0);
        result = 31 * result + (voidReason != null ? voidReason.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }

    public PatientEntity getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(PatientEntity patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }
}
