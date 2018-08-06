package com.hcl.cnp.patientservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/6/2018.
 */
@Entity
@Table(name = "person_address", schema = "openmrs", catalog = "")
public class PersonAddressEntity {
    @Id
    @Column(name = "person_address_id")
    private Integer personAddressId;
    @Basic
    @Column(name = "preferred")
    private Byte preferred;
    @Basic
    @Column(name = "address1")
    private String address1;
    @Basic
    @Column(name = "address2")
    private String address2;
    @Basic
    @Column(name = "city_village")
    private String cityVillage;
    @Basic
    @Column(name = "state_province")
    private String stateProvince;
    @Basic
    @Column(name = "postal_code")
    private String postalCode;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "latitude")
    private String latitude;
    @Basic
    @Column(name = "longitude")
    private String longitude;
    @Basic
    @Column(name = "start_date")
    private Timestamp startDate;
    @Basic
    @Column(name = "end_date")
    private Timestamp endDate;
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
    @Column(name = "county_district")
    private String countyDistrict;
    @Basic
    @Column(name = "address3")
    private String address3;
    @Basic
    @Column(name = "address4")
    private String address4;
    @Basic
    @Column(name = "address5")
    private String address5;
    @Basic
    @Column(name = "address6")
    private String address6;
    @Basic
    @Column(name = "date_changed")
    private Timestamp dateChanged;
    @Basic
    @Column(name = "uuid")
    private String uuid;
    @Basic
    @Column(name = "address7")
    private String address7;
    @Basic
    @Column(name = "address8")
    private String address8;
    @Basic
    @Column(name = "address9")
    private String address9;
    @Basic
    @Column(name = "address10")
    private String address10;
    @Basic
    @Column(name = "address11")
    private String address11;
    @Basic
    @Column(name = "address12")
    private String address12;
    @Basic
    @Column(name = "address13")
    private String address13;
    @Basic
    @Column(name = "address14")
    private String address14;
    @Basic
    @Column(name = "address15")
    private String address15;

    public Integer getPersonAddressId() {
        return personAddressId;
    }

    public void setPersonAddressId(Integer personAddressId) {
        this.personAddressId = personAddressId;
    }

    public Byte getPreferred() {
        return preferred;
    }

    public void setPreferred(Byte preferred) {
        this.preferred = preferred;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCityVillage() {
        return cityVillage;
    }

    public void setCityVillage(String cityVillage) {
        this.cityVillage = cityVillage;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
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

    public String getCountyDistrict() {
        return countyDistrict;
    }

    public void setCountyDistrict(String countyDistrict) {
        this.countyDistrict = countyDistrict;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getAddress5() {
        return address5;
    }

    public void setAddress5(String address5) {
        this.address5 = address5;
    }

    public String getAddress6() {
        return address6;
    }

    public void setAddress6(String address6) {
        this.address6 = address6;
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

    public String getAddress7() {
        return address7;
    }

    public void setAddress7(String address7) {
        this.address7 = address7;
    }

    public String getAddress8() {
        return address8;
    }

    public void setAddress8(String address8) {
        this.address8 = address8;
    }

    public String getAddress9() {
        return address9;
    }

    public void setAddress9(String address9) {
        this.address9 = address9;
    }

    public String getAddress10() {
        return address10;
    }

    public void setAddress10(String address10) {
        this.address10 = address10;
    }

    public String getAddress11() {
        return address11;
    }

    public void setAddress11(String address11) {
        this.address11 = address11;
    }

    public String getAddress12() {
        return address12;
    }

    public void setAddress12(String address12) {
        this.address12 = address12;
    }

    public String getAddress13() {
        return address13;
    }

    public void setAddress13(String address13) {
        this.address13 = address13;
    }

    public String getAddress14() {
        return address14;
    }

    public void setAddress14(String address14) {
        this.address14 = address14;
    }

    public String getAddress15() {
        return address15;
    }

    public void setAddress15(String address15) {
        this.address15 = address15;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonAddressEntity that = (PersonAddressEntity) o;

        if (personAddressId != null ? !personAddressId.equals(that.personAddressId) : that.personAddressId != null)
            return false;
        if (preferred != null ? !preferred.equals(that.preferred) : that.preferred != null) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (cityVillage != null ? !cityVillage.equals(that.cityVillage) : that.cityVillage != null) return false;
        if (stateProvince != null ? !stateProvince.equals(that.stateProvince) : that.stateProvince != null)
            return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (voided != null ? !voided.equals(that.voided) : that.voided != null) return false;
        if (dateVoided != null ? !dateVoided.equals(that.dateVoided) : that.dateVoided != null) return false;
        if (voidReason != null ? !voidReason.equals(that.voidReason) : that.voidReason != null) return false;
        if (countyDistrict != null ? !countyDistrict.equals(that.countyDistrict) : that.countyDistrict != null)
            return false;
        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
        if (address4 != null ? !address4.equals(that.address4) : that.address4 != null) return false;
        if (address5 != null ? !address5.equals(that.address5) : that.address5 != null) return false;
        if (address6 != null ? !address6.equals(that.address6) : that.address6 != null) return false;
        if (dateChanged != null ? !dateChanged.equals(that.dateChanged) : that.dateChanged != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (address7 != null ? !address7.equals(that.address7) : that.address7 != null) return false;
        if (address8 != null ? !address8.equals(that.address8) : that.address8 != null) return false;
        if (address9 != null ? !address9.equals(that.address9) : that.address9 != null) return false;
        if (address10 != null ? !address10.equals(that.address10) : that.address10 != null) return false;
        if (address11 != null ? !address11.equals(that.address11) : that.address11 != null) return false;
        if (address12 != null ? !address12.equals(that.address12) : that.address12 != null) return false;
        if (address13 != null ? !address13.equals(that.address13) : that.address13 != null) return false;
        if (address14 != null ? !address14.equals(that.address14) : that.address14 != null) return false;
        if (address15 != null ? !address15.equals(that.address15) : that.address15 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personAddressId != null ? personAddressId.hashCode() : 0;
        result = 31 * result + (preferred != null ? preferred.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (cityVillage != null ? cityVillage.hashCode() : 0);
        result = 31 * result + (stateProvince != null ? stateProvince.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (voided != null ? voided.hashCode() : 0);
        result = 31 * result + (dateVoided != null ? dateVoided.hashCode() : 0);
        result = 31 * result + (voidReason != null ? voidReason.hashCode() : 0);
        result = 31 * result + (countyDistrict != null ? countyDistrict.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (address4 != null ? address4.hashCode() : 0);
        result = 31 * result + (address5 != null ? address5.hashCode() : 0);
        result = 31 * result + (address6 != null ? address6.hashCode() : 0);
        result = 31 * result + (dateChanged != null ? dateChanged.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (address7 != null ? address7.hashCode() : 0);
        result = 31 * result + (address8 != null ? address8.hashCode() : 0);
        result = 31 * result + (address9 != null ? address9.hashCode() : 0);
        result = 31 * result + (address10 != null ? address10.hashCode() : 0);
        result = 31 * result + (address11 != null ? address11.hashCode() : 0);
        result = 31 * result + (address12 != null ? address12.hashCode() : 0);
        result = 31 * result + (address13 != null ? address13.hashCode() : 0);
        result = 31 * result + (address14 != null ? address14.hashCode() : 0);
        result = 31 * result + (address15 != null ? address15.hashCode() : 0);
        return result;
    }
}
