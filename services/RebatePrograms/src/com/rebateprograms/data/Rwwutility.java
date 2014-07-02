
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Rwwutility
 *  07/31/2013 09:43:25
 * 
 */
public class Rwwutility {

    private Integer rwwutilityId;
    private String rwwutilityName;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private Integer recordStatusId;
    private Set<com.rebateprograms.data.RebatorUtility> rebatorUtilities = new HashSet<com.rebateprograms.data.RebatorUtility>();
    private Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses = new HashSet<com.rebateprograms.data.ZipUtilities>();
    private Set<com.rebateprograms.data.RebateProgramUtilities> rebateProgramUtilitieses = new HashSet<com.rebateprograms.data.RebateProgramUtilities>();

    public Integer getRwwutilityId() {
        return rwwutilityId;
    }

    public void setRwwutilityId(Integer rwwutilityId) {
        this.rwwutilityId = rwwutilityId;
    }

    public String getRwwutilityName() {
        return rwwutilityName;
    }

    public void setRwwutilityName(String rwwutilityName) {
        this.rwwutilityName = rwwutilityName;
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

    public Integer getRecordStatusId() {
        return recordStatusId;
    }

    public void setRecordStatusId(Integer recordStatusId) {
        this.recordStatusId = recordStatusId;
    }

    public Set<com.rebateprograms.data.RebatorUtility> getRebatorUtilities() {
        return rebatorUtilities;
    }

    public void setRebatorUtilities(Set<com.rebateprograms.data.RebatorUtility> rebatorUtilities) {
        this.rebatorUtilities = rebatorUtilities;
    }

    public Set<com.rebateprograms.data.ZipUtilities> getZipUtilitieses() {
        return zipUtilitieses;
    }

    public void setZipUtilitieses(Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses) {
        this.zipUtilitieses = zipUtilitieses;
    }

    public Set<com.rebateprograms.data.RebateProgramUtilities> getRebateProgramUtilitieses() {
        return rebateProgramUtilitieses;
    }

    public void setRebateProgramUtilitieses(Set<com.rebateprograms.data.RebateProgramUtilities> rebateProgramUtilitieses) {
        this.rebateProgramUtilitieses = rebateProgramUtilitieses;
    }

}
