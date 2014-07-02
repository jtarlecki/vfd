
package com.rebateprograms.data;

import java.util.Date;


/**
 *  RebatePrograms.EcmexistingEquipments
 *  07/31/2013 09:43:25
 * 
 */
public class EcmexistingEquipments {

    private Integer id;
    private ExistingEquipment existingEquipment;
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

    public ExistingEquipment getExistingEquipment() {
        return existingEquipment;
    }

    public void setExistingEquipment(ExistingEquipment existingEquipment) {
        this.existingEquipment = existingEquipment;
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
