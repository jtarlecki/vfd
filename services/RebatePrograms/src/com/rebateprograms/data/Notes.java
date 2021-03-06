
package com.rebateprograms.data;

import java.util.Date;


/**
 *  RebatePrograms.Notes
 *  07/31/2013 09:43:25
 * 
 */
public class Notes {

    private Integer id;
    private RebateProgramTechnologies rebateProgramTechnologies;
    private String description;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RebateProgramTechnologies getRebateProgramTechnologies() {
        return rebateProgramTechnologies;
    }

    public void setRebateProgramTechnologies(RebateProgramTechnologies rebateProgramTechnologies) {
        this.rebateProgramTechnologies = rebateProgramTechnologies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

}
