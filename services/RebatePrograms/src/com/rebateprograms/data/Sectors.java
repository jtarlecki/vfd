
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Sectors
 *  07/31/2013 09:43:25
 * 
 */
public class Sectors {

    private Integer id;
    private String name;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.RebateProgramSectors> rebateProgramSectorses = new HashSet<com.rebateprograms.data.RebateProgramSectors>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<com.rebateprograms.data.RebateProgramSectors> getRebateProgramSectorses() {
        return rebateProgramSectorses;
    }

    public void setRebateProgramSectorses(Set<com.rebateprograms.data.RebateProgramSectors> rebateProgramSectorses) {
        this.rebateProgramSectorses = rebateProgramSectorses;
    }

}
