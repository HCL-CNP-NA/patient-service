package com.hcl.cnp.patientservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/8/2018.
 */
@Entity
@Table(name = "patient_state")
public class PatientStateEntity {

    @Id
    @Column(name = "patient_state_id")
    private Integer patientStateId;

    @Basic
    @Column(name = "start_date")
    private Date startDate;
    @Basic
    @Column(name = "end_date")
    private Date endDate;
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

    public Integer getPatientStateId() {
        return patientStateId;
    }

    public void setPatientStateId(Integer patientStateId) {
        this.patientStateId = patientStateId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

        PatientStateEntity that = (PatientStateEntity) o;

        if (patientStateId != null ? !patientStateId.equals(that.patientStateId) : that.patientStateId != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
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
        int result = patientStateId != null ? patientStateId.hashCode() : 0;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateChanged != null ? dateChanged.hashCode() : 0);
        result = 31 * result + (voided != null ? voided.hashCode() : 0);
        result = 31 * result + (dateVoided != null ? dateVoided.hashCode() : 0);
        result = 31 * result + (voidReason != null ? voidReason.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }
}
