
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.UtilityDataSourceTypes
 *  07/31/2013 09:43:25
 * 
 */
public class UtilityDataSourceTypes {

    private Integer utilityDataSourceTypesId;
    private String dataSourceCode;
    private String dataSourceDescription;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private String dataResourceLocation;
    private Set<com.rebateprograms.data.Utilities> utilitieses = new HashSet<com.rebateprograms.data.Utilities>();

    public Integer getUtilityDataSourceTypesId() {
        return utilityDataSourceTypesId;
    }

    public void setUtilityDataSourceTypesId(Integer utilityDataSourceTypesId) {
        this.utilityDataSourceTypesId = utilityDataSourceTypesId;
    }

    public String getDataSourceCode() {
        return dataSourceCode;
    }

    public void setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
    }

    public String getDataSourceDescription() {
        return dataSourceDescription;
    }

    public void setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
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

    public String getDataResourceLocation() {
        return dataResourceLocation;
    }

    public void setDataResourceLocation(String dataResourceLocation) {
        this.dataResourceLocation = dataResourceLocation;
    }

    public Set<com.rebateprograms.data.Utilities> getUtilitieses() {
        return utilitieses;
    }

    public void setUtilitieses(Set<com.rebateprograms.data.Utilities> utilitieses) {
        this.utilitieses = utilitieses;
    }

}
