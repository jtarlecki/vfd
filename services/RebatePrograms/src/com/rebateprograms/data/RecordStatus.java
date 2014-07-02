
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.RecordStatus
 *  07/31/2013 09:43:25
 * 
 */
public class RecordStatus {

    private Integer recordStatusId;
    private String recordDescription;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private String recordStatusCode;
    private Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses = new HashSet<com.rebateprograms.data.ZipUtilities>();
    private Set<com.rebateprograms.data.RebatePrograms> rebateProgramses = new HashSet<com.rebateprograms.data.RebatePrograms>();
    private Set<com.rebateprograms.data.Utilities> utilitieses = new HashSet<com.rebateprograms.data.Utilities>();

    public Integer getRecordStatusId() {
        return recordStatusId;
    }

    public void setRecordStatusId(Integer recordStatusId) {
        this.recordStatusId = recordStatusId;
    }

    public String getRecordDescription() {
        return recordDescription;
    }

    public void setRecordDescription(String recordDescription) {
        this.recordDescription = recordDescription;
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

    public String getRecordStatusCode() {
        return recordStatusCode;
    }

    public void setRecordStatusCode(String recordStatusCode) {
        this.recordStatusCode = recordStatusCode;
    }

    public Set<com.rebateprograms.data.ZipUtilities> getZipUtilitieses() {
        return zipUtilitieses;
    }

    public void setZipUtilitieses(Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses) {
        this.zipUtilitieses = zipUtilitieses;
    }

    public Set<com.rebateprograms.data.RebatePrograms> getRebateProgramses() {
        return rebateProgramses;
    }

    public void setRebateProgramses(Set<com.rebateprograms.data.RebatePrograms> rebateProgramses) {
        this.rebateProgramses = rebateProgramses;
    }

    public Set<com.rebateprograms.data.Utilities> getUtilitieses() {
        return utilitieses;
    }

    public void setUtilitieses(Set<com.rebateprograms.data.Utilities> utilitieses) {
        this.utilitieses = utilitieses;
    }

}
