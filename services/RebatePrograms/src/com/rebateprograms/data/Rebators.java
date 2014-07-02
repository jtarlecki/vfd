
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Rebators
 *  07/31/2013 09:43:25
 * 
 */
public class Rebators {

    private Integer id;
    private RebatorTypes rebatorTypes;
    private String name;
    private String abbreviation;
    private String fname;
    private String lname;
    private String email;
    private String addr1;
    private String addr2;
    private String city;
    private String state;
    private String zipCode;
    private String webAddress;
    private String phone;
    private String extension;
    private String fax;
    private String notes;
    private Integer grade;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.RebatorUtility> rebatorUtilities = new HashSet<com.rebateprograms.data.RebatorUtility>();
    private Set<com.rebateprograms.data.RebatePrograms> rebateProgramses = new HashSet<com.rebateprograms.data.RebatePrograms>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RebatorTypes getRebatorTypes() {
        return rebatorTypes;
    }

    public void setRebatorTypes(RebatorTypes rebatorTypes) {
        this.rebatorTypes = rebatorTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Set<com.rebateprograms.data.RebatorUtility> getRebatorUtilities() {
        return rebatorUtilities;
    }

    public void setRebatorUtilities(Set<com.rebateprograms.data.RebatorUtility> rebatorUtilities) {
        this.rebatorUtilities = rebatorUtilities;
    }

    public Set<com.rebateprograms.data.RebatePrograms> getRebateProgramses() {
        return rebateProgramses;
    }

    public void setRebateProgramses(Set<com.rebateprograms.data.RebatePrograms> rebateProgramses) {
        this.rebateProgramses = rebateProgramses;
    }

}
