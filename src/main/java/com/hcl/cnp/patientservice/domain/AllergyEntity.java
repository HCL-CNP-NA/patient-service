package com.hcl.cnp.patientservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/6/2018.
 */
@Entity
@Table(name = "allergy", schema = "openmrs")
public class AllergyEntity {
    @Id
    @Column(name = "allergy_id")
    private Integer allergyId;
    @Basic
    @Column(name = "non_coded_allergen")
    private String nonCodedAllergen;
    @Basic
    @Column(name = "allergen_type")
    private String allergenType;
    @Basic
    @Column(name = "comment")
    private String comment;
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

    public Integer getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(Integer allergyId) {
        this.allergyId = allergyId;
    }

    public String getNonCodedAllergen() {
        return nonCodedAllergen;
    }

    public void setNonCodedAllergen(String nonCodedAllergen) {
        this.nonCodedAllergen = nonCodedAllergen;
    }

    public String getAllergenType() {
        return allergenType;
    }

    public void setAllergenType(String allergenType) {
        this.allergenType = allergenType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

        AllergyEntity that = (AllergyEntity) o;

        if (allergyId != null ? !allergyId.equals(that.allergyId) : that.allergyId != null) return false;
        if (nonCodedAllergen != null ? !nonCodedAllergen.equals(that.nonCodedAllergen) : that.nonCodedAllergen != null)
            return false;
        if (allergenType != null ? !allergenType.equals(that.allergenType) : that.allergenType != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
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
        int result = allergyId != null ? allergyId.hashCode() : 0;
        result = 31 * result + (nonCodedAllergen != null ? nonCodedAllergen.hashCode() : 0);
        result = 31 * result + (allergenType != null ? allergenType.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateChanged != null ? dateChanged.hashCode() : 0);
        result = 31 * result + (voided != null ? voided.hashCode() : 0);
        result = 31 * result + (dateVoided != null ? dateVoided.hashCode() : 0);
        result = 31 * result + (voidReason != null ? voidReason.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }
}
