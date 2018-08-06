package com.hcl.cnp.patientservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/6/2018.
 */
@Entity
@Table(name = "person_name", schema = "openmrs", catalog = "")
public class PersonNameEntity {
    @Id
    @Column(name = "person_name_id")
    private Integer personNameId;
    @Basic
    @Column(name = "preferred")
    private Byte preferred;
    @Basic
    @Column(name = "prefix")
    private String prefix;
    @Basic
    @Column(name = "given_name")
    private String givenName;
    @Basic
    @Column(name = "middle_name")
    private String middleName;
    @Basic
    @Column(name = "family_name_prefix")
    private String familyNamePrefix;
    @Basic
    @Column(name = "family_name")
    private String familyName;
    @Basic
    @Column(name = "family_name2")
    private String familyName2;
    @Basic
    @Column(name = "family_name_suffix")
    private String familyNameSuffix;
    @Basic
    @Column(name = "degree")
    private String degree;
    @Basic
    @Column(name = "date_created")
    private Timestamp dateCreated;
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
    @Column(name = "changed_by")
    private Integer changedBy;
    @Basic
    @Column(name = "date_changed")
    private Timestamp dateChanged;
    @Basic
    @Column(name = "uuid")
    private String uuid;
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id", nullable = false)
    private PersonEntity personByPersonId;

    public Integer getPersonNameId() {
        return personNameId;
    }

    public void setPersonNameId(Integer personNameId) {
        this.personNameId = personNameId;
    }

    public Byte getPreferred() {
        return preferred;
    }

    public void setPreferred(Byte preferred) {
        this.preferred = preferred;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyNamePrefix() {
        return familyNamePrefix;
    }

    public void setFamilyNamePrefix(String familyNamePrefix) {
        this.familyNamePrefix = familyNamePrefix;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName2() {
        return familyName2;
    }

    public void setFamilyName2(String familyName2) {
        this.familyName2 = familyName2;
    }

    public String getFamilyNameSuffix() {
        return familyNameSuffix;
    }

    public void setFamilyNameSuffix(String familyNameSuffix) {
        this.familyNameSuffix = familyNameSuffix;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
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

    public Integer getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(Integer changedBy) {
        this.changedBy = changedBy;
    }

    public Timestamp getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Timestamp dateChanged) {
        this.dateChanged = dateChanged;
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

        PersonNameEntity that = (PersonNameEntity) o;

        if (personNameId != null ? !personNameId.equals(that.personNameId) : that.personNameId != null) return false;
        if (preferred != null ? !preferred.equals(that.preferred) : that.preferred != null) return false;
        if (prefix != null ? !prefix.equals(that.prefix) : that.prefix != null) return false;
        if (givenName != null ? !givenName.equals(that.givenName) : that.givenName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (familyNamePrefix != null ? !familyNamePrefix.equals(that.familyNamePrefix) : that.familyNamePrefix != null)
            return false;
        if (familyName != null ? !familyName.equals(that.familyName) : that.familyName != null) return false;
        if (familyName2 != null ? !familyName2.equals(that.familyName2) : that.familyName2 != null) return false;
        if (familyNameSuffix != null ? !familyNameSuffix.equals(that.familyNameSuffix) : that.familyNameSuffix != null)
            return false;
        if (degree != null ? !degree.equals(that.degree) : that.degree != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (voided != null ? !voided.equals(that.voided) : that.voided != null) return false;
        if (dateVoided != null ? !dateVoided.equals(that.dateVoided) : that.dateVoided != null) return false;
        if (voidReason != null ? !voidReason.equals(that.voidReason) : that.voidReason != null) return false;
        if (changedBy != null ? !changedBy.equals(that.changedBy) : that.changedBy != null) return false;
        if (dateChanged != null ? !dateChanged.equals(that.dateChanged) : that.dateChanged != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personNameId != null ? personNameId.hashCode() : 0;
        result = 31 * result + (preferred != null ? preferred.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (givenName != null ? givenName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (familyNamePrefix != null ? familyNamePrefix.hashCode() : 0);
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (familyName2 != null ? familyName2.hashCode() : 0);
        result = 31 * result + (familyNameSuffix != null ? familyNameSuffix.hashCode() : 0);
        result = 31 * result + (degree != null ? degree.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (voided != null ? voided.hashCode() : 0);
        result = 31 * result + (dateVoided != null ? dateVoided.hashCode() : 0);
        result = 31 * result + (voidReason != null ? voidReason.hashCode() : 0);
        result = 31 * result + (changedBy != null ? changedBy.hashCode() : 0);
        result = 31 * result + (dateChanged != null ? dateChanged.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }

    public PersonEntity getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(PersonEntity personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
