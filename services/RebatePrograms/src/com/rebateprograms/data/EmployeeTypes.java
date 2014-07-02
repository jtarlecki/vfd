
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.EmployeeTypes
 *  07/31/2013 09:43:25
 * 
 */
public class EmployeeTypes {

    private Integer id;
    private String code;
    private String description;
    private String modifiedUser;
    private Date modiedDate;
    private Set<com.rebateprograms.data.Employees> employeeses = new HashSet<com.rebateprograms.data.Employees>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModiedDate() {
        return modiedDate;
    }

    public void setModiedDate(Date modiedDate) {
        this.modiedDate = modiedDate;
    }

    public Set<com.rebateprograms.data.Employees> getEmployeeses() {
        return employeeses;
    }

    public void setEmployeeses(Set<com.rebateprograms.data.Employees> employeeses) {
        this.employeeses = employeeses;
    }

}
