
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.HoldCompany
 *  07/31/2013 09:43:25
 * 
 */
public class HoldCompany {

    private Integer holdCompanyId;
    private String holdCompanyName;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.Utilities> utilitieses = new HashSet<com.rebateprograms.data.Utilities>();

    public Integer getHoldCompanyId() {
        return holdCompanyId;
    }

    public void setHoldCompanyId(Integer holdCompanyId) {
        this.holdCompanyId = holdCompanyId;
    }

    public String getHoldCompanyName() {
        return holdCompanyName;
    }

    public void setHoldCompanyName(String holdCompanyName) {
        this.holdCompanyName = holdCompanyName;
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

    public Set<com.rebateprograms.data.Utilities> getUtilitieses() {
        return utilitieses;
    }

    public void setUtilitieses(Set<com.rebateprograms.data.Utilities> utilitieses) {
        this.utilitieses = utilitieses;
    }

}
