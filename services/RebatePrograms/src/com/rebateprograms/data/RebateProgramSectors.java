
package com.rebateprograms.data;

import java.util.Date;


/**
 *  RebatePrograms.RebateProgramSectors
 *  07/31/2013 09:43:25
 * 
 */
public class RebateProgramSectors {

    private Integer id;
    private RebatePrograms rebatePrograms;
    private Sectors sectors;
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

    public RebatePrograms getRebatePrograms() {
        return rebatePrograms;
    }

    public void setRebatePrograms(RebatePrograms rebatePrograms) {
        this.rebatePrograms = rebatePrograms;
    }

    public Sectors getSectors() {
        return sectors;
    }

    public void setSectors(Sectors sectors) {
        this.sectors = sectors;
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
