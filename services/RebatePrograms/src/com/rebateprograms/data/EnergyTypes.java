
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.EnergyTypes
 *  07/31/2013 09:43:25
 * 
 */
public class EnergyTypes {

    private Integer energyTypeId;
    private String energy;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private String energyCode;
    private Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses = new HashSet<com.rebateprograms.data.ZipUtilities>();

    public Integer getEnergyTypeId() {
        return energyTypeId;
    }

    public void setEnergyTypeId(Integer energyTypeId) {
        this.energyTypeId = energyTypeId;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
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

    public String getEnergyCode() {
        return energyCode;
    }

    public void setEnergyCode(String energyCode) {
        this.energyCode = energyCode;
    }

    public Set<com.rebateprograms.data.ZipUtilities> getZipUtilitieses() {
        return zipUtilitieses;
    }

    public void setZipUtilitieses(Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses) {
        this.zipUtilitieses = zipUtilitieses;
    }

}
