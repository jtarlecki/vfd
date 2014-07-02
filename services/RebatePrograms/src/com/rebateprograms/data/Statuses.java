
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Statuses
 *  07/31/2013 09:43:25
 * 
 */
public class Statuses {

    private Integer id;
    private Integer bitwiseFlag;
    private String code;
    private String description;
    private String modifiedUser;
    private Date modifiedDate;
    private Boolean active;
    private Set<com.rebateprograms.data.StatusReasons> statusReasonses = new HashSet<com.rebateprograms.data.StatusReasons>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBitwiseFlag() {
        return bitwiseFlag;
    }

    public void setBitwiseFlag(Integer bitwiseFlag) {
        this.bitwiseFlag = bitwiseFlag;
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

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<com.rebateprograms.data.StatusReasons> getStatusReasonses() {
        return statusReasonses;
    }

    public void setStatusReasonses(Set<com.rebateprograms.data.StatusReasons> statusReasonses) {
        this.statusReasonses = statusReasonses;
    }

}
