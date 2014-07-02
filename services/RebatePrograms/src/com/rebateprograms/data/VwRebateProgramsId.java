
package com.rebateprograms.data;

import java.io.Serializable;
import java.util.Date;


/**
 *  RebatePrograms.VwRebateProgramsId
 *  07/31/2013 09:43:25
 * 
 */
public class VwRebateProgramsId
    implements Serializable
{

    private Integer id;
    private String program;
    private String state;
    private String employee;
    private String programAdmin;
    private String fundingType;
    private String fundingSource;
    private String raTsRebator;
    private String programStatus;
    private String sector;
    private String technology;
    private String recordDescription;
    private Integer stateId;
    private Double customerUsageMinKw;
    private Double customerUsageMinKwh;
    private Double customerUsageMaxKw;
    private Double customerUsageMaxKwh;
    private Double projectEnergySavingsMinKw;
    private Double projectEnergySavingsMinKwh;
    private Double projectEnergySavingsMaxKw;
    private Double projectEnergySavingsMaxKwh;
    private Integer buildingSizeMinSqft;
    private Integer buildingSizeMaxSqft;
    private Integer rebatorId;
    private Integer fundingSourceId;
    private Date programYearStartDate;
    private Date programYearEndDate;
    private String programStartDateString;
    private String programEndDateString;
    private Integer recordStatusId;
    private Integer programStatusId;
    private Integer programAdminId;
    private String website;
    private String tempPayoutString;
    private String tempProjectSizeString;
    private String tempRequirementsString;
    private String programCaveats;
    private String programBudget;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwRebateProgramsId)) {
            return false;
        }
        VwRebateProgramsId other = ((VwRebateProgramsId) o);
        if (this.id == null) {
            if (other.id!= null) {
                return false;
            }
        } else {
            if (!this.id.equals(other.id)) {
                return false;
            }
        }
        if (this.program == null) {
            if (other.program!= null) {
                return false;
            }
        } else {
            if (!this.program.equals(other.program)) {
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
        if (this.employee == null) {
            if (other.employee!= null) {
                return false;
            }
        } else {
            if (!this.employee.equals(other.employee)) {
                return false;
            }
        }
        if (this.programAdmin == null) {
            if (other.programAdmin!= null) {
                return false;
            }
        } else {
            if (!this.programAdmin.equals(other.programAdmin)) {
                return false;
            }
        }
        if (this.fundingType == null) {
            if (other.fundingType!= null) {
                return false;
            }
        } else {
            if (!this.fundingType.equals(other.fundingType)) {
                return false;
            }
        }
        if (this.fundingSource == null) {
            if (other.fundingSource!= null) {
                return false;
            }
        } else {
            if (!this.fundingSource.equals(other.fundingSource)) {
                return false;
            }
        }
        if (this.raTsRebator == null) {
            if (other.raTsRebator!= null) {
                return false;
            }
        } else {
            if (!this.raTsRebator.equals(other.raTsRebator)) {
                return false;
            }
        }
        if (this.programStatus == null) {
            if (other.programStatus!= null) {
                return false;
            }
        } else {
            if (!this.programStatus.equals(other.programStatus)) {
                return false;
            }
        }
        if (this.sector == null) {
            if (other.sector!= null) {
                return false;
            }
        } else {
            if (!this.sector.equals(other.sector)) {
                return false;
            }
        }
        if (this.technology == null) {
            if (other.technology!= null) {
                return false;
            }
        } else {
            if (!this.technology.equals(other.technology)) {
                return false;
            }
        }
        if (this.recordDescription == null) {
            if (other.recordDescription!= null) {
                return false;
            }
        } else {
            if (!this.recordDescription.equals(other.recordDescription)) {
                return false;
            }
        }
        if (this.stateId == null) {
            if (other.stateId!= null) {
                return false;
            }
        } else {
            if (!this.stateId.equals(other.stateId)) {
                return false;
            }
        }
        if (this.customerUsageMinKw == null) {
            if (other.customerUsageMinKw!= null) {
                return false;
            }
        } else {
            if (!this.customerUsageMinKw.equals(other.customerUsageMinKw)) {
                return false;
            }
        }
        if (this.customerUsageMinKwh == null) {
            if (other.customerUsageMinKwh!= null) {
                return false;
            }
        } else {
            if (!this.customerUsageMinKwh.equals(other.customerUsageMinKwh)) {
                return false;
            }
        }
        if (this.customerUsageMaxKw == null) {
            if (other.customerUsageMaxKw!= null) {
                return false;
            }
        } else {
            if (!this.customerUsageMaxKw.equals(other.customerUsageMaxKw)) {
                return false;
            }
        }
        if (this.customerUsageMaxKwh == null) {
            if (other.customerUsageMaxKwh!= null) {
                return false;
            }
        } else {
            if (!this.customerUsageMaxKwh.equals(other.customerUsageMaxKwh)) {
                return false;
            }
        }
        if (this.projectEnergySavingsMinKw == null) {
            if (other.projectEnergySavingsMinKw!= null) {
                return false;
            }
        } else {
            if (!this.projectEnergySavingsMinKw.equals(other.projectEnergySavingsMinKw)) {
                return false;
            }
        }
        if (this.projectEnergySavingsMinKwh == null) {
            if (other.projectEnergySavingsMinKwh!= null) {
                return false;
            }
        } else {
            if (!this.projectEnergySavingsMinKwh.equals(other.projectEnergySavingsMinKwh)) {
                return false;
            }
        }
        if (this.projectEnergySavingsMaxKw == null) {
            if (other.projectEnergySavingsMaxKw!= null) {
                return false;
            }
        } else {
            if (!this.projectEnergySavingsMaxKw.equals(other.projectEnergySavingsMaxKw)) {
                return false;
            }
        }
        if (this.projectEnergySavingsMaxKwh == null) {
            if (other.projectEnergySavingsMaxKwh!= null) {
                return false;
            }
        } else {
            if (!this.projectEnergySavingsMaxKwh.equals(other.projectEnergySavingsMaxKwh)) {
                return false;
            }
        }
        if (this.buildingSizeMinSqft == null) {
            if (other.buildingSizeMinSqft!= null) {
                return false;
            }
        } else {
            if (!this.buildingSizeMinSqft.equals(other.buildingSizeMinSqft)) {
                return false;
            }
        }
        if (this.buildingSizeMaxSqft == null) {
            if (other.buildingSizeMaxSqft!= null) {
                return false;
            }
        } else {
            if (!this.buildingSizeMaxSqft.equals(other.buildingSizeMaxSqft)) {
                return false;
            }
        }
        if (this.rebatorId == null) {
            if (other.rebatorId!= null) {
                return false;
            }
        } else {
            if (!this.rebatorId.equals(other.rebatorId)) {
                return false;
            }
        }
        if (this.fundingSourceId == null) {
            if (other.fundingSourceId!= null) {
                return false;
            }
        } else {
            if (!this.fundingSourceId.equals(other.fundingSourceId)) {
                return false;
            }
        }
        if (this.programYearStartDate == null) {
            if (other.programYearStartDate!= null) {
                return false;
            }
        } else {
            if (!this.programYearStartDate.equals(other.programYearStartDate)) {
                return false;
            }
        }
        if (this.programYearEndDate == null) {
            if (other.programYearEndDate!= null) {
                return false;
            }
        } else {
            if (!this.programYearEndDate.equals(other.programYearEndDate)) {
                return false;
            }
        }
        if (this.programStartDateString == null) {
            if (other.programStartDateString!= null) {
                return false;
            }
        } else {
            if (!this.programStartDateString.equals(other.programStartDateString)) {
                return false;
            }
        }
        if (this.programEndDateString == null) {
            if (other.programEndDateString!= null) {
                return false;
            }
        } else {
            if (!this.programEndDateString.equals(other.programEndDateString)) {
                return false;
            }
        }
        if (this.recordStatusId == null) {
            if (other.recordStatusId!= null) {
                return false;
            }
        } else {
            if (!this.recordStatusId.equals(other.recordStatusId)) {
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
        if (this.programAdminId == null) {
            if (other.programAdminId!= null) {
                return false;
            }
        } else {
            if (!this.programAdminId.equals(other.programAdminId)) {
                return false;
            }
        }
        if (this.website == null) {
            if (other.website!= null) {
                return false;
            }
        } else {
            if (!this.website.equals(other.website)) {
                return false;
            }
        }
        if (this.tempPayoutString == null) {
            if (other.tempPayoutString!= null) {
                return false;
            }
        } else {
            if (!this.tempPayoutString.equals(other.tempPayoutString)) {
                return false;
            }
        }
        if (this.tempProjectSizeString == null) {
            if (other.tempProjectSizeString!= null) {
                return false;
            }
        } else {
            if (!this.tempProjectSizeString.equals(other.tempProjectSizeString)) {
                return false;
            }
        }
        if (this.tempRequirementsString == null) {
            if (other.tempRequirementsString!= null) {
                return false;
            }
        } else {
            if (!this.tempRequirementsString.equals(other.tempRequirementsString)) {
                return false;
            }
        }
        if (this.programCaveats == null) {
            if (other.programCaveats!= null) {
                return false;
            }
        } else {
            if (!this.programCaveats.equals(other.programCaveats)) {
                return false;
            }
        }
        if (this.programBudget == null) {
            if (other.programBudget!= null) {
                return false;
            }
        } else {
            if (!this.programBudget.equals(other.programBudget)) {
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
        if (this.createdDate == null) {
            if (other.createdDate!= null) {
                return false;
            }
        } else {
            if (!this.createdDate.equals(other.createdDate)) {
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
        if (this.modifiedDate == null) {
            if (other.modifiedDate!= null) {
                return false;
            }
        } else {
            if (!this.modifiedDate.equals(other.modifiedDate)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.id!= null) {
            rtn = (rtn + this.id.hashCode());
        }
        rtn = (rtn* 37);
        if (this.program!= null) {
            rtn = (rtn + this.program.hashCode());
        }
        rtn = (rtn* 37);
        if (this.state!= null) {
            rtn = (rtn + this.state.hashCode());
        }
        rtn = (rtn* 37);
        if (this.employee!= null) {
            rtn = (rtn + this.employee.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programAdmin!= null) {
            rtn = (rtn + this.programAdmin.hashCode());
        }
        rtn = (rtn* 37);
        if (this.fundingType!= null) {
            rtn = (rtn + this.fundingType.hashCode());
        }
        rtn = (rtn* 37);
        if (this.fundingSource!= null) {
            rtn = (rtn + this.fundingSource.hashCode());
        }
        rtn = (rtn* 37);
        if (this.raTsRebator!= null) {
            rtn = (rtn + this.raTsRebator.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programStatus!= null) {
            rtn = (rtn + this.programStatus.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sector!= null) {
            rtn = (rtn + this.sector.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technology!= null) {
            rtn = (rtn + this.technology.hashCode());
        }
        rtn = (rtn* 37);
        if (this.recordDescription!= null) {
            rtn = (rtn + this.recordDescription.hashCode());
        }
        rtn = (rtn* 37);
        if (this.stateId!= null) {
            rtn = (rtn + this.stateId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.customerUsageMinKw!= null) {
            rtn = (rtn + this.customerUsageMinKw.hashCode());
        }
        rtn = (rtn* 37);
        if (this.customerUsageMinKwh!= null) {
            rtn = (rtn + this.customerUsageMinKwh.hashCode());
        }
        rtn = (rtn* 37);
        if (this.customerUsageMaxKw!= null) {
            rtn = (rtn + this.customerUsageMaxKw.hashCode());
        }
        rtn = (rtn* 37);
        if (this.customerUsageMaxKwh!= null) {
            rtn = (rtn + this.customerUsageMaxKwh.hashCode());
        }
        rtn = (rtn* 37);
        if (this.projectEnergySavingsMinKw!= null) {
            rtn = (rtn + this.projectEnergySavingsMinKw.hashCode());
        }
        rtn = (rtn* 37);
        if (this.projectEnergySavingsMinKwh!= null) {
            rtn = (rtn + this.projectEnergySavingsMinKwh.hashCode());
        }
        rtn = (rtn* 37);
        if (this.projectEnergySavingsMaxKw!= null) {
            rtn = (rtn + this.projectEnergySavingsMaxKw.hashCode());
        }
        rtn = (rtn* 37);
        if (this.projectEnergySavingsMaxKwh!= null) {
            rtn = (rtn + this.projectEnergySavingsMaxKwh.hashCode());
        }
        rtn = (rtn* 37);
        if (this.buildingSizeMinSqft!= null) {
            rtn = (rtn + this.buildingSizeMinSqft.hashCode());
        }
        rtn = (rtn* 37);
        if (this.buildingSizeMaxSqft!= null) {
            rtn = (rtn + this.buildingSizeMaxSqft.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebatorId!= null) {
            rtn = (rtn + this.rebatorId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.fundingSourceId!= null) {
            rtn = (rtn + this.fundingSourceId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programYearStartDate!= null) {
            rtn = (rtn + this.programYearStartDate.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programYearEndDate!= null) {
            rtn = (rtn + this.programYearEndDate.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programStartDateString!= null) {
            rtn = (rtn + this.programStartDateString.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programEndDateString!= null) {
            rtn = (rtn + this.programEndDateString.hashCode());
        }
        rtn = (rtn* 37);
        if (this.recordStatusId!= null) {
            rtn = (rtn + this.recordStatusId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programStatusId!= null) {
            rtn = (rtn + this.programStatusId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programAdminId!= null) {
            rtn = (rtn + this.programAdminId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.website!= null) {
            rtn = (rtn + this.website.hashCode());
        }
        rtn = (rtn* 37);
        if (this.tempPayoutString!= null) {
            rtn = (rtn + this.tempPayoutString.hashCode());
        }
        rtn = (rtn* 37);
        if (this.tempProjectSizeString!= null) {
            rtn = (rtn + this.tempProjectSizeString.hashCode());
        }
        rtn = (rtn* 37);
        if (this.tempRequirementsString!= null) {
            rtn = (rtn + this.tempRequirementsString.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programCaveats!= null) {
            rtn = (rtn + this.programCaveats.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programBudget!= null) {
            rtn = (rtn + this.programBudget.hashCode());
        }
        rtn = (rtn* 37);
        if (this.createdUser!= null) {
            rtn = (rtn + this.createdUser.hashCode());
        }
        rtn = (rtn* 37);
        if (this.createdDate!= null) {
            rtn = (rtn + this.createdDate.hashCode());
        }
        rtn = (rtn* 37);
        if (this.modifiedUser!= null) {
            rtn = (rtn + this.modifiedUser.hashCode());
        }
        rtn = (rtn* 37);
        if (this.modifiedDate!= null) {
            rtn = (rtn + this.modifiedDate.hashCode());
        }
        return rtn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getProgramAdmin() {
        return programAdmin;
    }

    public void setProgramAdmin(String programAdmin) {
        this.programAdmin = programAdmin;
    }

    public String getFundingType() {
        return fundingType;
    }

    public void setFundingType(String fundingType) {
        this.fundingType = fundingType;
    }

    public String getFundingSource() {
        return fundingSource;
    }

    public void setFundingSource(String fundingSource) {
        this.fundingSource = fundingSource;
    }

    public String getRaTsRebator() {
        return raTsRebator;
    }

    public void setRaTsRebator(String raTsRebator) {
        this.raTsRebator = raTsRebator;
    }

    public String getProgramStatus() {
        return programStatus;
    }

    public void setProgramStatus(String programStatus) {
        this.programStatus = programStatus;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getRecordDescription() {
        return recordDescription;
    }

    public void setRecordDescription(String recordDescription) {
        this.recordDescription = recordDescription;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Double getCustomerUsageMinKw() {
        return customerUsageMinKw;
    }

    public void setCustomerUsageMinKw(Double customerUsageMinKw) {
        this.customerUsageMinKw = customerUsageMinKw;
    }

    public Double getCustomerUsageMinKwh() {
        return customerUsageMinKwh;
    }

    public void setCustomerUsageMinKwh(Double customerUsageMinKwh) {
        this.customerUsageMinKwh = customerUsageMinKwh;
    }

    public Double getCustomerUsageMaxKw() {
        return customerUsageMaxKw;
    }

    public void setCustomerUsageMaxKw(Double customerUsageMaxKw) {
        this.customerUsageMaxKw = customerUsageMaxKw;
    }

    public Double getCustomerUsageMaxKwh() {
        return customerUsageMaxKwh;
    }

    public void setCustomerUsageMaxKwh(Double customerUsageMaxKwh) {
        this.customerUsageMaxKwh = customerUsageMaxKwh;
    }

    public Double getProjectEnergySavingsMinKw() {
        return projectEnergySavingsMinKw;
    }

    public void setProjectEnergySavingsMinKw(Double projectEnergySavingsMinKw) {
        this.projectEnergySavingsMinKw = projectEnergySavingsMinKw;
    }

    public Double getProjectEnergySavingsMinKwh() {
        return projectEnergySavingsMinKwh;
    }

    public void setProjectEnergySavingsMinKwh(Double projectEnergySavingsMinKwh) {
        this.projectEnergySavingsMinKwh = projectEnergySavingsMinKwh;
    }

    public Double getProjectEnergySavingsMaxKw() {
        return projectEnergySavingsMaxKw;
    }

    public void setProjectEnergySavingsMaxKw(Double projectEnergySavingsMaxKw) {
        this.projectEnergySavingsMaxKw = projectEnergySavingsMaxKw;
    }

    public Double getProjectEnergySavingsMaxKwh() {
        return projectEnergySavingsMaxKwh;
    }

    public void setProjectEnergySavingsMaxKwh(Double projectEnergySavingsMaxKwh) {
        this.projectEnergySavingsMaxKwh = projectEnergySavingsMaxKwh;
    }

    public Integer getBuildingSizeMinSqft() {
        return buildingSizeMinSqft;
    }

    public void setBuildingSizeMinSqft(Integer buildingSizeMinSqft) {
        this.buildingSizeMinSqft = buildingSizeMinSqft;
    }

    public Integer getBuildingSizeMaxSqft() {
        return buildingSizeMaxSqft;
    }

    public void setBuildingSizeMaxSqft(Integer buildingSizeMaxSqft) {
        this.buildingSizeMaxSqft = buildingSizeMaxSqft;
    }

    public Integer getRebatorId() {
        return rebatorId;
    }

    public void setRebatorId(Integer rebatorId) {
        this.rebatorId = rebatorId;
    }

    public Integer getFundingSourceId() {
        return fundingSourceId;
    }

    public void setFundingSourceId(Integer fundingSourceId) {
        this.fundingSourceId = fundingSourceId;
    }

    public Date getProgramYearStartDate() {
        return programYearStartDate;
    }

    public void setProgramYearStartDate(Date programYearStartDate) {
        this.programYearStartDate = programYearStartDate;
    }

    public Date getProgramYearEndDate() {
        return programYearEndDate;
    }

    public void setProgramYearEndDate(Date programYearEndDate) {
        this.programYearEndDate = programYearEndDate;
    }

    public String getProgramStartDateString() {
        return programStartDateString;
    }

    public void setProgramStartDateString(String programStartDateString) {
        this.programStartDateString = programStartDateString;
    }

    public String getProgramEndDateString() {
        return programEndDateString;
    }

    public void setProgramEndDateString(String programEndDateString) {
        this.programEndDateString = programEndDateString;
    }

    public Integer getRecordStatusId() {
        return recordStatusId;
    }

    public void setRecordStatusId(Integer recordStatusId) {
        this.recordStatusId = recordStatusId;
    }

    public Integer getProgramStatusId() {
        return programStatusId;
    }

    public void setProgramStatusId(Integer programStatusId) {
        this.programStatusId = programStatusId;
    }

    public Integer getProgramAdminId() {
        return programAdminId;
    }

    public void setProgramAdminId(Integer programAdminId) {
        this.programAdminId = programAdminId;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTempPayoutString() {
        return tempPayoutString;
    }

    public void setTempPayoutString(String tempPayoutString) {
        this.tempPayoutString = tempPayoutString;
    }

    public String getTempProjectSizeString() {
        return tempProjectSizeString;
    }

    public void setTempProjectSizeString(String tempProjectSizeString) {
        this.tempProjectSizeString = tempProjectSizeString;
    }

    public String getTempRequirementsString() {
        return tempRequirementsString;
    }

    public void setTempRequirementsString(String tempRequirementsString) {
        this.tempRequirementsString = tempRequirementsString;
    }

    public String getProgramCaveats() {
        return programCaveats;
    }

    public void setProgramCaveats(String programCaveats) {
        this.programCaveats = programCaveats;
    }

    public String getProgramBudget() {
        return programBudget;
    }

    public void setProgramBudget(String programBudget) {
        this.programBudget = programBudget;
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
