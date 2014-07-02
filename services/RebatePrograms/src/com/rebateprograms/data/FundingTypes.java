
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.FundingTypes
 *  07/31/2013 09:43:25
 * 
 */
public class FundingTypes {

    private Integer id;
    private String description;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.RebateProgramFundingTypes> rebateProgramFundingTypeses = new HashSet<com.rebateprograms.data.RebateProgramFundingTypes>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<com.rebateprograms.data.RebateProgramFundingTypes> getRebateProgramFundingTypeses() {
        return rebateProgramFundingTypeses;
    }

    public void setRebateProgramFundingTypeses(Set<com.rebateprograms.data.RebateProgramFundingTypes> rebateProgramFundingTypeses) {
        this.rebateProgramFundingTypeses = rebateProgramFundingTypeses;
    }

}
