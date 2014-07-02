
package com.rebateprograms.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 *  RebatePrograms.VwPayoutsId
 *  07/31/2013 09:43:25
 * 
 */
public class VwPayoutsId
    implements Serializable
{

    private String technology;
    private Integer technologyId;
    private Integer rebateProgramTechnologyId;
    private String notes;
    private String caps;
    private String state;
    private Integer rebateProgramId;
    private String rebateProgram;
    private Integer programStatusId;
    private String programStatusDescription;
    private String programStatusComments;
    private String directoryUrl;
    private String applicationUrl;
    private String programStatusImage;
    private Integer constructionTypeId;
    private String constructionTypeName;
    private String measureCode;
    private Integer newEquipmentId;
    private String newEquipment;
    private Integer payoutId;
    private Double sizeMin;
    private Double sizeMax;
    private String uom;
    private BigDecimal payoutDollars;
    private String payoutType;
    private Integer payoutTypeId;
    private Date createdDate;
    private String createdUser;
    private Date modifiedDate;
    private String modifiedUser;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwPayoutsId)) {
            return false;
        }
        VwPayoutsId other = ((VwPayoutsId) o);
        if (this.technology == null) {
            if (other.technology!= null) {
                return false;
            }
        } else {
            if (!this.technology.equals(other.technology)) {
                return false;
            }
        }
        if (this.technologyId == null) {
            if (other.technologyId!= null) {
                return false;
            }
        } else {
            if (!this.technologyId.equals(other.technologyId)) {
                return false;
            }
        }
        if (this.rebateProgramTechnologyId == null) {
            if (other.rebateProgramTechnologyId!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgramTechnologyId.equals(other.rebateProgramTechnologyId)) {
                return false;
            }
        }
        if (this.notes == null) {
            if (other.notes!= null) {
                return false;
            }
        } else {
            if (!this.notes.equals(other.notes)) {
                return false;
            }
        }
        if (this.caps == null) {
            if (other.caps!= null) {
                return false;
            }
        } else {
            if (!this.caps.equals(other.caps)) {
                return false;
            }
        }
        if (this.state == null) {
            if (other.state!= null) {
                return false;
            }
        } else {
            if (!this.state.equals(other.state)) {
                return false;
            }
        }
        if (this.rebateProgramId == null) {
            if (other.rebateProgramId!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgramId.equals(other.rebateProgramId)) {
                return false;
            }
        }
        if (this.rebateProgram == null) {
            if (other.rebateProgram!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgram.equals(other.rebateProgram)) {
                return false;
            }
        }
        if (this.programStatusId == null) {
            if (other.programStatusId!= null) {
                return false;
            }
        } else {
            if (!this.programStatusId.equals(other.programStatusId)) {
                return false;
            }
        }
        if (this.programStatusDescription == null) {
            if (other.programStatusDescription!= null) {
                return false;
            }
        } else {
            if (!this.programStatusDescription.equals(other.programStatusDescription)) {
                return false;
            }
        }
        if (this.programStatusComments == null) {
            if (other.programStatusComments!= null) {
                return false;
            }
        } else {
            if (!this.programStatusComments.equals(other.programStatusComments)) {
                return false;
            }
        }
        if (this.directoryUrl == null) {
            if (other.directoryUrl!= null) {
                return false;
            }
        } else {
            if (!this.directoryUrl.equals(other.directoryUrl)) {
                return false;
            }
        }
        if (this.applicationUrl == null) {
            if (other.applicationUrl!= null) {
                return false;
            }
        } else {
            if (!this.applicationUrl.equals(other.applicationUrl)) {
                return false;
            }
        }
        if (this.programStatusImage == null) {
            if (other.programStatusImage!= null) {
                return false;
            }
        } else {
            if (!this.programStatusImage.equals(other.programStatusImage)) {
                return false;
            }
        }
        if (this.constructionTypeId == null) {
            if (other.constructionTypeId!= null) {
                return false;
            }
        } else {
            if (!this.constructionTypeId.equals(other.constructionTypeId)) {
                return false;
            }
        }
        if (this.constructionTypeName == null) {
            if (other.constructionTypeName!= null) {
                return false;
            }
        } else {
            if (!this.constructionTypeName.equals(other.constructionTypeName)) {
                return false;
            }
        }
        if (this.measureCode == null) {
            if (other.measureCode!= null) {
                return false;
            }
        } else {
            if (!this.measureCode.equals(other.measureCode)) {
                return false;
            }
        }
        if (this.newEquipmentId == null) {
            if (other.newEquipmentId!= null) {
                return false;
            }
        } else {
            if (!this.newEquipmentId.equals(other.newEquipmentId)) {
                return false;
            }
        }
        if (this.newEquipment == null) {
            if (other.newEquipment!= null) {
                return false;
            }
        } else {
            if (!this.newEquipment.equals(other.newEquipment)) {
                return false;
            }
        }
        if (this.payoutId == null) {
            if (other.payoutId!= null) {
                return false;
            }
        } else {
            if (!this.payoutId.equals(other.payoutId)) {
                return false;
            }
        }
        if (this.sizeMin == null) {
            if (other.sizeMin!= null) {
                return false;
            }
        } else {
            if (!this.sizeMin.equals(other.sizeMin)) {
                return false;
            }
        }
        if (this.sizeMax == null) {
            if (other.sizeMax!= null) {
                return false;
            }
        } else {
            if (!this.sizeMax.equals(other.sizeMax)) {
                return false;
            }
        }
        if (this.uom == null) {
            if (other.uom!= null) {
                return false;
            }
        } else {
            if (!this.uom.equals(other.uom)) {
                return false;
            }
        }
        if (this.payoutDollars == null) {
            if (other.payoutDollars!= null) {
                return false;
            }
        } else {
            if (!this.payoutDollars.equals(other.payoutDollars)) {
                return false;
            }
        }
        if (this.payoutType == null) {
            if (other.payoutType!= null) {
                return false;
            }
        } else {
            if (!this.payoutType.equals(other.payoutType)) {
                return false;
            }
        }
        if (this.payoutTypeId == null) {
            if (other.payoutTypeId!= null) {
                return false;
            }
        } else {
            if (!this.payoutTypeId.equals(other.payoutTypeId)) {
                return false;
            }
        }
        if (this.createdDate == null) {
            if (other.createdDate!= null) {
                return false;
            }
        } else {
            if (!this.createdDate.equals(other.createdDate)) {
                return false;
            }
        }
        if (this.createdUser == null) {
            if (other.createdUser!= null) {
                return false;
            }
        } else {
            if (!this.createdUser.equals(other.createdUser)) {
                return false;
            }
        }
        if (this.modifiedDate == null) {
            if (other.modifiedDate!= null) {
                return false;
            }
        } else {
            if (!this.modifiedDate.equals(other.modifiedDate)) {
                return false;
            }
        }
        if (this.modifiedUser == null) {
            if (other.modifiedUser!= null) {
                return false;
            }
        } else {
            if (!this.modifiedUser.equals(other.modifiedUser)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.technology!= null) {
            rtn = (rtn + this.technology.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technologyId!= null) {
            rtn = (rtn + this.technologyId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebateProgramTechnologyId!= null) {
            rtn = (rtn + this.rebateProgramTechnologyId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.notes!= null) {
            rtn = (rtn + this.notes.hashCode());
        }
        rtn = (rtn* 37);
        if (this.caps!= null) {
            rtn = (rtn + this.caps.hashCode());
        }
        rtn = (rtn* 37);
        if (this.state!= null) {
            rtn = (rtn + this.state.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebateProgramId!= null) {
            rtn = (rtn + this.rebateProgramId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebateProgram!= null) {
            rtn = (rtn + this.rebateProgram.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programStatusId!= null) {
            rtn = (rtn + this.programStatusId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programStatusDescription!= null) {
            rtn = (rtn + this.programStatusDescription.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programStatusComments!= null) {
            rtn = (rtn + this.programStatusComments.hashCode());
        }
        rtn = (rtn* 37);
        if (this.directoryUrl!= null) {
            rtn = (rtn + this.directoryUrl.hashCode());
        }
        rtn = (rtn* 37);
        if (this.applicationUrl!= null) {
            rtn = (rtn + this.applicationUrl.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programStatusImage!= null) {
            rtn = (rtn + this.programStatusImage.hashCode());
        }
        rtn = (rtn* 37);
        if (this.constructionTypeId!= null) {
            rtn = (rtn + this.constructionTypeId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.constructionTypeName!= null) {
            rtn = (rtn + this.constructionTypeName.hashCode());
        }
        rtn = (rtn* 37);
        if (this.measureCode!= null) {
            rtn = (rtn + this.measureCode.hashCode());
        }
        rtn = (rtn* 37);
        if (this.newEquipmentId!= null) {
            rtn = (rtn + this.newEquipmentId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.newEquipment!= null) {
            rtn = (rtn + this.newEquipment.hashCode());
        }
        rtn = (rtn* 37);
        if (this.payoutId!= null) {
            rtn = (rtn + this.payoutId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sizeMin!= null) {
            rtn = (rtn + this.sizeMin.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sizeMax!= null) {
            rtn = (rtn + this.sizeMax.hashCode());
        }
        rtn = (rtn* 37);
        if (this.uom!= null) {
            rtn = (rtn + this.uom.hashCode());
        }
        rtn = (rtn* 37);
        if (this.payoutDollars!= null) {
            rtn = (rtn + this.payoutDollars.hashCode());
        }
        rtn = (rtn* 37);
        if (this.payoutType!= null) {
            rtn = (rtn + this.payoutType.hashCode());
        }
        rtn = (rtn* 37);
        if (this.payoutTypeId!= null) {
            rtn = (rtn + this.payoutTypeId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.createdDate!= null) {
            rtn = (rtn + this.createdDate.hashCode());
        }
        rtn = (rtn* 37);
        if (this.createdUser!= null) {
            rtn = (rtn + this.createdUser.hashCode());
        }
        rtn = (rtn* 37);
        if (this.modifiedDate!= null) {
            rtn = (rtn + this.modifiedDate.hashCode());
        }
        rtn = (rtn* 37);
        if (this.modifiedUser!= null) {
            rtn = (rtn + this.modifiedUser.hashCode());
        }
        return rtn;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Integer getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Integer technologyId) {
        this.technologyId = technologyId;
    }

    public Integer getRebateProgramTechnologyId() {
        return rebateProgramTechnologyId;
    }

    public void setRebateProgramTechnologyId(Integer rebateProgramTechnologyId) {
        this.rebateProgramTechnologyId = rebateProgramTechnologyId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCaps() {
        return caps;
    }

    public void setCaps(String caps) {
        this.caps = caps;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getRebateProgramId() {
        return rebateProgramId;
    }

    public void setRebateProgramId(Integer rebateProgramId) {
        this.rebateProgramId = rebateProgramId;
    }

    public String getRebateProgram() {
        return rebateProgram;
    }

    public void setRebateProgram(String rebateProgram) {
        this.rebateProgram = rebateProgram;
    }

    public Integer getProgramStatusId() {
        return programStatusId;
    }

    public void setProgramStatusId(Integer programStatusId) {
        this.programStatusId = programStatusId;
    }

    public String getProgramStatusDescription() {
        return programStatusDescription;
    }

    public void setProgramStatusDescription(String programStatusDescription) {
        this.programStatusDescription = programStatusDescription;
    }

    public String getProgramStatusComments() {
        return programStatusComments;
    }

    public void setProgramStatusComments(String programStatusComments) {
        this.programStatusComments = programStatusComments;
    }

    public String getDirectoryUrl() {
        return directoryUrl;
    }

    public void setDirectoryUrl(String directoryUrl) {
        this.directoryUrl = directoryUrl;
    }

    public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    public String getProgramStatusImage() {
        return programStatusImage;
    }

    public void setProgramStatusImage(String programStatusImage) {
        this.programStatusImage = programStatusImage;
    }

    public Integer getConstructionTypeId() {
        return constructionTypeId;
    }

    public void setConstructionTypeId(Integer constructionTypeId) {
        this.constructionTypeId = constructionTypeId;
    }

    public String getConstructionTypeName() {
        return constructionTypeName;
    }

    public void setConstructionTypeName(String constructionTypeName) {
        this.constructionTypeName = constructionTypeName;
    }

    public String getMeasureCode() {
        return measureCode;
    }

    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    public Integer getNewEquipmentId() {
        return newEquipmentId;
    }

    public void setNewEquipmentId(Integer newEquipmentId) {
        this.newEquipmentId = newEquipmentId;
    }

    public String getNewEquipment() {
        return newEquipment;
    }

    public void setNewEquipment(String newEquipment) {
        this.newEquipment = newEquipment;
    }

    public Integer getPayoutId() {
        return payoutId;
    }

    public void setPayoutId(Integer payoutId) {
        this.payoutId = payoutId;
    }

    public Double getSizeMin() {
        return sizeMin;
    }

    public void setSizeMin(Double sizeMin) {
        this.sizeMin = sizeMin;
    }

    public Double getSizeMax() {
        return sizeMax;
    }

    public void setSizeMax(Double sizeMax) {
        this.sizeMax = sizeMax;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getPayoutDollars() {
        return payoutDollars;
    }

    public void setPayoutDollars(BigDecimal payoutDollars) {
        this.payoutDollars = payoutDollars;
    }

    public String getPayoutType() {
        return payoutType;
    }

    public void setPayoutType(String payoutType) {
        this.payoutType = payoutType;
    }

    public Integer getPayoutTypeId() {
        return payoutTypeId;
    }

    public void setPayoutTypeId(Integer payoutTypeId) {
        this.payoutTypeId = payoutTypeId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

}
