
package com.rebateprograms.data;

import java.util.Date;


/**
 *  RebatePrograms.ZipUtilities
 *  07/31/2013 09:43:25
 * 
 */
public class ZipUtilities {

    private Integer mapInfoId;
    private UtilityTypes utilityTypes;
    private Utilities utilities;
    private Rwwutility rwwutility;
    private EnergyTypes energyTypes;
    private RecordStatus recordStatus;
    private Employees employees;
    private String zipCode;
    private Double overlap;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;

    public Integer getMapInfoId() {
        return mapInfoId;
    }

    public void setMapInfoId(Integer mapInfoId) {
        this.mapInfoId = mapInfoId;
    }

    public UtilityTypes getUtilityTypes() {
        return utilityTypes;
    }

    public void setUtilityTypes(UtilityTypes utilityTypes) {
        this.utilityTypes = utilityTypes;
    }

    public Utilities getUtilities() {
        return utilities;
    }

    public void setUtilities(Utilities utilities) {
        this.utilities = utilities;
    }

    public Rwwutility getRwwutility() {
        return rwwutility;
    }

    public void setRwwutility(Rwwutility rwwutility) {
        this.rwwutility = rwwutility;
    }

    public EnergyTypes getEnergyTypes() {
        return energyTypes;
    }

    public void setEnergyTypes(EnergyTypes energyTypes) {
        this.energyTypes = energyTypes;
    }

    public RecordStatus getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Double getOverlap() {
        return overlap;
    }

    public void setOverlap(Double overlap) {
        this.overlap = overlap;
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
