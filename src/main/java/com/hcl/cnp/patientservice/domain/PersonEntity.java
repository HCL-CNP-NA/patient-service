package com.hcl.cnp.patientservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/6/2018.
 */
@Entity
@Table(name = "person", schema = "openmrs", catalog = "")
public class PersonEntity {

    @Id
    @Column(name = "person_id")
    private Integer personId;

    @Basic
    @Column(name = "gender")
    private String gender;

    @Basic
    @Column(name = "birthdate")
    private Date birthdate;

    @Basic
    @Column(name = "birthdate_estimated")
    private Byte birthdateEstimated;

    @Basic
    @Column(name = "dead")
    private Byte dead;

    @Basic
    @Column(name = "death_date")
    private Timestamp deathDate;

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

    @Basic
    @Column(name = "deathdate_estimated")
    private Byte deathdateEstimated;

    @Basic
    @Column(name = "birthtime")
    private Time birthtime;

    //We need to discuss this relation
//    @OneToOne(mappedBy = "personByPatientId")
//    private PatientEntity patientByPersonId;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Byte getBirthdateEstimated() {
        return birthdateEstimated;
    }

    public void setBirthdateEstimated(Byte birthdateEstimated) {
        this.birthdateEstimated = birthdateEstimated;
    }

    public Byte getDead() {
        return dead;
    }

    public void setDead(Byte dead) {
        this.dead = dead;
    }

    public Timestamp getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Timestamp deathDate) {
        this.deathDate = deathDate;
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

    public Byte getDeathdateEstimated() {
        return deathdateEstimated;
    }

    public void setDeathdateEstimated(Byte deathdateEstimated) {
        this.deathdateEstimated = deathdateEstimated;
    }

    public Time getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(Time birthtime) {
        this.birthtime = birthtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (birthdateEstimated != null ? !birthdateEstimated.equals(that.birthdateEstimated) : that.birthdateEstimated != null)
            return false;
        if (dead != null ? !dead.equals(that.dead) : that.dead != null) return false;
        if (deathDate != null ? !deathDate.equals(that.deathDate) : that.deathDate != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (dateChanged != null ? !dateChanged.equals(that.dateChanged) : that.dateChanged != null) return false;
        if (voided != null ? !voided.equals(that.voided) : that.voided != null) return false;
        if (dateVoided != null ? !dateVoided.equals(that.dateVoided) : that.dateVoided != null) return false;
        if (voidReason != null ? !voidReason.equals(that.voidReason) : that.voidReason != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (deathdateEstimated != null ? !deathdateEstimated.equals(that.deathdateEstimated) : that.deathdateEstimated != null)
            return false;
        if (birthtime != null ? !birthtime.equals(that.birthtime) : that.birthtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (birthdateEstimated != null ? birthdateEstimated.hashCode() : 0);
        result = 31 * result + (dead != null ? dead.hashCode() : 0);
        result = 31 * result + (deathDate != null ? deathDate.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateChanged != null ? dateChanged.hashCode() : 0);
        result = 31 * result + (voided != null ? voided.hashCode() : 0);
        result = 31 * result + (dateVoided != null ? dateVoided.hashCode() : 0);
        result = 31 * result + (voidReason != null ? voidReason.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (deathdateEstimated != null ? deathdateEstimated.hashCode() : 0);
        result = 31 * result + (birthtime != null ? birthtime.hashCode() : 0);
        return result;
    }

//    public PatientEntity getPatientByPersonId() {
//        return patientByPersonId;
//    }
//
//    public void setPatientByPersonId(PatientEntity patientByPersonId) {
//        this.patientByPersonId = patientByPersonId;
//    }
}
