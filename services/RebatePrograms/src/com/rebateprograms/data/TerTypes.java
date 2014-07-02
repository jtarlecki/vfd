
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.TerTypes
 *  07/31/2013 09:43:25
 * 
 */
public class TerTypes {

    private Integer id;
    private String code;
    private String description;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.Utilities> utilitieses = new HashSet<com.rebateprograms.data.Utilities>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
