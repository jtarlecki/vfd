
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.ConstructionTypes
 *  07/31/2013 09:43:25
 * 
 */
public class ConstructionTypes {

    private Integer id;
    private String code;
    private String name;
    private String description;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.EcmconstructionTypes> ecmconstructionTypeses = new HashSet<com.rebateprograms.data.EcmconstructionTypes>();

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<com.rebateprograms.data.EcmconstructionTypes> getEcmconstructionTypeses() {
        return ecmconstructionTypeses;
    }

    public void setEcmconstructionTypeses(Set<com.rebateprograms.data.EcmconstructionTypes> ecmconstructionTypeses) {
        this.ecmconstructionTypeses = ecmconstructionTypeses;
    }

}
