
package com.rebateprograms.data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Ecms
 *  07/31/2013 09:43:25
 * 
 */
public class Ecms {

    private Integer id;
    private NewEquipment newEquipment;
    private PreApprovalRequirements preApprovalRequirements;
    private RebateProgramTechnologies rebateProgramTechnologies;
    private String measureCode;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private String existingEquipmentInfo;
    private BigDecimal threshold;
    private Set<com.rebateprograms.data.EcmconstructionTypes> ecmconstructionTypeses = new HashSet<com.rebateprograms.data.EcmconstructionTypes>();
    private Set<com.rebateprograms.data.Payouts> payoutses = new HashSet<com.rebateprograms.data.Payouts>();
    private Set<com.rebateprograms.data.EcmexistingEquipments> ecmexistingEquipmentses = new HashSet<com.rebateprograms.data.EcmexistingEquipments>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NewEquipment getNewEquipment() {
        return newEquipment;
    }

    public void setNewEquipment(NewEquipment newEquipment) {
        this.newEquipment = newEquipment;
    }

    public PreApprovalRequirements getPreApprovalRequirements() {
        return preApprovalRequirements;
    }

    public void setPreApprovalRequirements(PreApprovalRequirements preApprovalRequirements) {
        this.preApprovalRequirements = preApprovalRequirements;
    }

    public RebateProgramTechnologies getRebateProgramTechnologies() {
        return rebateProgramTechnologies;
    }

    public void setRebateProgramTechnologies(RebateProgramTechnologies rebateProgramTechnologies) {
        this.rebateProgramTechnologies = rebateProgramTechnologies;
    }

    public String getMeasureCode() {
        return measureCode;
    }

    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
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

    public String getExistingEquipmentInfo() {
        return existingEquipmentInfo;
    }

    public void setExistingEquipmentInfo(String existingEquipmentInfo) {
        this.existingEquipmentInfo = existingEquipmentInfo;
    }

    public BigDecimal getThreshold() {
        return threshold;
    }

    public void setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
    }

    public Set<com.rebateprograms.data.EcmconstructionTypes> getEcmconstructionTypeses() {
        return ecmconstructionTypeses;
    }

    public void setEcmconstructionTypeses(Set<com.rebateprograms.data.EcmconstructionTypes> ecmconstructionTypeses) {
        this.ecmconstructionTypeses = ecmconstructionTypeses;
    }

    public Set<com.rebateprograms.data.Payouts> getPayoutses() {
        return payoutses;
    }

    public void setPayoutses(Set<com.rebateprograms.data.Payouts> payoutses) {
        this.payoutses = payoutses;
    }

    public Set<com.rebateprograms.data.EcmexistingEquipments> getEcmexistingEquipmentses() {
        return ecmexistingEquipmentses;
    }

    public void setEcmexistingEquipmentses(Set<com.rebateprograms.data.EcmexistingEquipments> ecmexistingEquipmentses) {
        this.ecmexistingEquipmentses = ecmexistingEquipmentses;
    }

}
