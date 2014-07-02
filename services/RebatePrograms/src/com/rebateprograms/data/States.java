
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.States
 *  07/31/2013 09:43:25
 * 
 */
public class States {

    private Integer id;
    private String abbr;
    private String name;
    private Integer employeeId;
    private Integer grade;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.RebatePrograms> rebateProgramses = new HashSet<com.rebateprograms.data.RebatePrograms>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    public Set<com.rebateprograms.data.RebatePrograms> getRebateProgramses() {
        return rebateProgramses;
    }

    public void setRebateProgramses(Set<com.rebateprograms.data.RebatePrograms> rebateProgramses) {
        this.rebateProgramses = rebateProgramses;
    }

}
