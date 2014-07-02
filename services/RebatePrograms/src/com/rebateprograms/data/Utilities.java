
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Utilities
 *  07/31/2013 09:43:25
 * 
 */
public class Utilities {

    private Integer id;
    private UtilityDataSourceTypes utilityDataSourceTypes;
    private TerTypes terTypes;
    private HoldCompany holdCompany;
    private RecordStatus recordStatus;
    private String plattsUtilityName;
    private String utilityName;
    private String utilityAbbr;
    private String notes;
    private Boolean priorityFlag;
    private Boolean deleted;
    private String modifiedUser;
    private Date modifiedDate;
    private Date createdDate;
    private String createdUser;
    private Set<com.rebateprograms.data.UtilityRebates> utilityRebateses = new HashSet<com.rebateprograms.data.UtilityRebates>();
    private Set<com.rebateprograms.data.RebatorUtility> rebatorUtilities = new HashSet<com.rebateprograms.data.RebatorUtility>();
    private Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses = new HashSet<com.rebateprograms.data.ZipUtilities>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UtilityDataSourceTypes getUtilityDataSourceTypes() {
        return utilityDataSourceTypes;
    }

    public void setUtilityDataSourceTypes(UtilityDataSourceTypes utilityDataSourceTypes) {
        this.utilityDataSourceTypes = utilityDataSourceTypes;
    }

    public TerTypes getTerTypes() {
        return terTypes;
    }

    public void setTerTypes(TerTypes terTypes) {
        this.terTypes = terTypes;
    }

    public HoldCompany getHoldCompany() {
        return holdCompany;
    }

    public void setHoldCompany(HoldCompany holdCompany) {
        this.holdCompany = holdCompany;
    }

    public RecordStatus getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getPlattsUtilityName() {
        return plattsUtilityName;
    }

    public void setPlattsUtilityName(String plattsUtilityName) {
        this.plattsUtilityName = plattsUtilityName;
    }

    public String getUtilityName() {
        return utilityName;
    }

    public void setUtilityName(String utilityName) {
        this.utilityName = utilityName;
    }

    public String getUtilityAbbr() {
        return utilityAbbr;
    }

    public void setUtilityAbbr(String utilityAbbr) {
        this.utilityAbbr = utilityAbbr;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getPriorityFlag() {
        return priorityFlag;
    }

    public void setPriorityFlag(Boolean priorityFlag) {
        this.priorityFlag = priorityFlag;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Set<com.rebateprograms.data.UtilityRebates> getUtilityRebateses() {
        return utilityRebateses;
    }

    public void setUtilityRebateses(Set<com.rebateprograms.data.UtilityRebates> utilityRebateses) {
        this.utilityRebateses = utilityRebateses;
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

}
