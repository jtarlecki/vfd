
package com.rebateprograms.data;

import java.util.Date;


/**
 *  RebatePrograms.EcmconstructionTypes
 *  07/31/2013 09:43:25
 * 
 */
public class EcmconstructionTypes {

    private Integer id;
    private ConstructionTypes constructionTypes;
    private Ecms ecms;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ConstructionTypes getConstructionTypes() {
        return constructionTypes;
    }

    public void setConstructionTypes(ConstructionTypes constructionTypes) {
        this.constructionTypes = constructionTypes;
    }

    public Ecms getEcms() {
        return ecms;
    }

    public void setEcms(Ecms ecms) {
        this.ecms = ecms;
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

}
