
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Technologies
 *  07/31/2013 09:43:25
 * 
 */
public class Technologies {

    private Integer id;
    private TechnologyCategories technologyCategories;
    private String name;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.ExistingEquipment> existingEquipments = new HashSet<com.rebateprograms.data.ExistingEquipment>();
    private Set<com.rebateprograms.data.RebateProgramTechnologies> rebateProgramTechnologieses = new HashSet<com.rebateprograms.data.RebateProgramTechnologies>();
    private Set<com.rebateprograms.data.NewEquipment> newEquipments = new HashSet<com.rebateprograms.data.NewEquipment>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TechnologyCategories getTechnologyCategories() {
        return technologyCategories;
    }

    public void setTechnologyCategories(TechnologyCategories technologyCategories) {
        this.technologyCategories = technologyCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<com.rebateprograms.data.ExistingEquipment> getExistingEquipments() {
        return existingEquipments;
    }

    public void setExistingEquipments(Set<com.rebateprograms.data.ExistingEquipment> existingEquipments) {
        this.existingEquipments = existingEquipments;
    }

    public Set<com.rebateprograms.data.RebateProgramTechnologies> getRebateProgramTechnologieses() {
        return rebateProgramTechnologieses;
    }

    public void setRebateProgramTechnologieses(Set<com.rebateprograms.data.RebateProgramTechnologies> rebateProgramTechnologieses) {
        this.rebateProgramTechnologieses = rebateProgramTechnologieses;
    }

    public Set<com.rebateprograms.data.NewEquipment> getNewEquipments() {
        return newEquipments;
    }

    public void setNewEquipments(Set<com.rebateprograms.data.NewEquipment> newEquipments) {
        this.newEquipments = newEquipments;
    }

}
