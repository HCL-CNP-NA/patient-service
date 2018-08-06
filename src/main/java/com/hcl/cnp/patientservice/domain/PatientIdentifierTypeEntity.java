package com.hcl.cnp.patientservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/6/2018.
 */
@Entity
@Table(name = "patient_identifier_type", schema = "openmrs", catalog = "")
public class PatientIdentifierTypeEntity {
    @Id
    @Column(name = "patient_identifier_type_id")
    private Integer patientIdentifierTypeId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "format")
    private String format;
    @Basic
    @Column(name = "check_digit")
    private Byte checkDigit;
    @Basic
    @Column(name = "date_created")
    private Timestamp dateCreated;
    @Basic
    @Column(name = "required")
    private Byte required;
    @Basic
    @Column(name = "format_description")
    private String formatDescription;
    @Basic
    @Column(name = "validator")
    private String validator;
    @Basic
    @Column(name = "location_behavior")
    private String locationBehavior;
    @Basic
    @Column(name = "retired")
    private Byte retired;
    @Basic
    @Column(name = "date_retired")
    private Timestamp dateRetired;
    @Basic
    @Column(name = "retire_reason")
    private String retireReason;
    @Basic
    @Column(name = "uuid")
    private String uuid;
    @Basic
    @Column(name = "uniqueness_behavior")
    private String uniquenessBehavior;

    public Integer getPatientIdentifierTypeId() {
        return patientIdentifierTypeId;
    }

    public void setPatientIdentifierTypeId(Integer patientIdentifierTypeId) {
        this.patientIdentifierTypeId = patientIdentifierTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Byte getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(Byte checkDigit) {
        this.checkDigit = checkDigit;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Byte getRequired() {
        return required;
    }

    public void setRequired(Byte required) {
        this.required = required;
    }

    public String getFormatDescription() {
        return formatDescription;
    }

    public void setFormatDescription(String formatDescription) {
        this.formatDescription = formatDescription;
    }

    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    public String getLocationBehavior() {
        return locationBehavior;
    }

    public void setLocationBehavior(String locationBehavior) {
        this.locationBehavior = locationBehavior;
    }

    public Byte getRetired() {
        return retired;
    }

    public void setRetired(Byte retired) {
        this.retired = retired;
    }

    public Timestamp getDateRetired() {
        return dateRetired;
    }

    public void setDateRetired(Timestamp dateRetired) {
        this.dateRetired = dateRetired;
    }

    public String getRetireReason() {
        return retireReason;
    }

    public void setRetireReason(String retireReason) {
        this.retireReason = retireReason;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUniquenessBehavior() {
        return uniquenessBehavior;
    }

    public void setUniquenessBehavior(String uniquenessBehavior) {
        this.uniquenessBehavior = uniquenessBehavior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientIdentifierTypeEntity that = (PatientIdentifierTypeEntity) o;

        if (patientIdentifierTypeId != null ? !patientIdentifierTypeId.equals(that.patientIdentifierTypeId) : that.patientIdentifierTypeId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (checkDigit != null ? !checkDigit.equals(that.checkDigit) : that.checkDigit != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (required != null ? !required.equals(that.required) : that.required != null) return false;
        if (formatDescription != null ? !formatDescription.equals(that.formatDescription) : that.formatDescription != null)
            return false;
        if (validator != null ? !validator.equals(that.validator) : that.validator != null) return false;
        if (locationBehavior != null ? !locationBehavior.equals(that.locationBehavior) : that.locationBehavior != null)
            return false;
        if (retired != null ? !retired.equals(that.retired) : that.retired != null) return false;
        if (dateRetired != null ? !dateRetired.equals(that.dateRetired) : that.dateRetired != null) return false;
        if (retireReason != null ? !retireReason.equals(that.retireReason) : that.retireReason != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (uniquenessBehavior != null ? !uniquenessBehavior.equals(that.uniquenessBehavior) : that.uniquenessBehavior != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = patientIdentifierTypeId != null ? patientIdentifierTypeId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (checkDigit != null ? checkDigit.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (required != null ? required.hashCode() : 0);
        result = 31 * result + (formatDescription != null ? formatDescription.hashCode() : 0);
        result = 31 * result + (validator != null ? validator.hashCode() : 0);
        result = 31 * result + (locationBehavior != null ? locationBehavior.hashCode() : 0);
        result = 31 * result + (retired != null ? retired.hashCode() : 0);
        result = 31 * result + (dateRetired != null ? dateRetired.hashCode() : 0);
        result = 31 * result + (retireReason != null ? retireReason.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (uniquenessBehavior != null ? uniquenessBehavior.hashCode() : 0);
        return result;
    }
}
