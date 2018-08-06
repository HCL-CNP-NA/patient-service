package com.hcl.cnp.patientservice.domain;

import javax.persistence.*;

/**
 * Created by Tech Support on 8/6/2018.
 */
@Entity
@Table(name = "allergy_reaction", schema = "openmrs", catalog = "")
public class AllergyReactionEntity {
    @Id
    @Column(name = "allergy_reaction_id")
    private Integer allergyReactionId;
    @Basic
    @Column(name = "reaction_non_coded")
    private String reactionNonCoded;
    @Basic
    @Column(name = "uuid")
    private String uuid;
    @ManyToOne
    @JoinColumn(name = "allergy_id", referencedColumnName = "allergy_id", nullable = false)
    private AllergyEntity allergyByAllergyId;

    public Integer getAllergyReactionId() {
        return allergyReactionId;
    }

    public void setAllergyReactionId(Integer allergyReactionId) {
        this.allergyReactionId = allergyReactionId;
    }

    public String getReactionNonCoded() {
        return reactionNonCoded;
    }

    public void setReactionNonCoded(String reactionNonCoded) {
        this.reactionNonCoded = reactionNonCoded;
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

        AllergyReactionEntity that = (AllergyReactionEntity) o;

        if (allergyReactionId != null ? !allergyReactionId.equals(that.allergyReactionId) : that.allergyReactionId != null)
            return false;
        if (reactionNonCoded != null ? !reactionNonCoded.equals(that.reactionNonCoded) : that.reactionNonCoded != null)
            return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = allergyReactionId != null ? allergyReactionId.hashCode() : 0;
        result = 31 * result + (reactionNonCoded != null ? reactionNonCoded.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }

    public AllergyEntity getAllergyByAllergyId() {
        return allergyByAllergyId;
    }

    public void setAllergyByAllergyId(AllergyEntity allergyByAllergyId) {
        this.allergyByAllergyId = allergyByAllergyId;
    }
}
