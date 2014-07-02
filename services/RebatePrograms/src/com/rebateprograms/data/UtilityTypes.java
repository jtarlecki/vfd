
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.UtilityTypes
 *  07/31/2013 09:43:25
 * 
 */
public class UtilityTypes {

    private Integer utilityTypeId;
    private String utilityTypeCode;
    private String utilityDescription;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses = new HashSet<com.rebateprograms.data.ZipUtilities>();

    public Integer getUtilityTypeId() {
        return utilityTypeId;
    }

    public void setUtilityTypeId(Integer utilityTypeId) {
        this.utilityTypeId = utilityTypeId;
    }

    public String getUtilityTypeCode() {
        return utilityTypeCode;
    }

    public void setUtilityTypeCode(String utilityTypeCode) {
        this.utilityTypeCode = utilityTypeCode;
    }

    public String getUtilityDescription() {
        return utilityDescription;
    }

    public void setUtilityDescription(String utilityDescription) {
        this.utilityDescription = utilityDescription;
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

    public Set<com.rebateprograms.data.ZipUtilities> getZipUtilitieses() {
        return zipUtilitieses;
    }

    public void setZipUtilitieses(Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses) {
        this.zipUtilitieses = zipUtilitieses;
    }

}
