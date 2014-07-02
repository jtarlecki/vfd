
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.RebatePrograms
 *  07/31/2013 09:43:25
 * 
 */
public class RebatePrograms {

    private Integer id;
    private ProgramStatuses programStatuses;
    private Rebators rebators;
    private RecordStatus recordStatus;
    private States states;
    private ProgramAdmins programAdmins;
    private FundingSources fundingSources;
    private String name;
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
    private Date programYearStartDate;
    private Date programYearEndDate;
    private String programStartDateString;
    private String programEndDateString;
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
    private Set<com.rebateprograms.data.RebateProgramTechnologies> rebateProgramTechnologieses = new HashSet<com.rebateprograms.data.RebateProgramTechnologies>();
    private Set<com.rebateprograms.data.RebateProgramSectors> rebateProgramSectorses = new HashSet<com.rebateprograms.data.RebateProgramSectors>();
    private Set<com.rebateprograms.data.RebateProgramUtilities> rebateProgramUtilitieses = new HashSet<com.rebateprograms.data.RebateProgramUtilities>();
    private Set<com.rebateprograms.data.RebateProgramFundingTypes> rebateProgramFundingTypeses = new HashSet<com.rebateprograms.data.RebateProgramFundingTypes>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProgramStatuses getProgramStatuses() {
        return programStatuses;
    }

    public void setProgramStatuses(ProgramStatuses programStatuses) {
        this.programStatuses = programStatuses;
    }

    public Rebators getRebators() {
        return rebators;
    }

    public void setRebators(Rebators rebators) {
        this.rebators = rebators;
    }

    public RecordStatus getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

    public ProgramAdmins getProgramAdmins() {
        return programAdmins;
    }

    public void setProgramAdmins(ProgramAdmins programAdmins) {
        this.programAdmins = programAdmins;
    }

    public FundingSources getFundingSources() {
        return fundingSources;
    }

    public void setFundingSources(FundingSources fundingSources) {
        this.fundingSources = fundingSources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<com.rebateprograms.data.RebateProgramTechnologies> getRebateProgramTechnologieses() {
        return rebateProgramTechnologieses;
    }

    public void setRebateProgramTechnologieses(Set<com.rebateprograms.data.RebateProgramTechnologies> rebateProgramTechnologieses) {
        this.rebateProgramTechnologieses = rebateProgramTechnologieses;
    }

    public Set<com.rebateprograms.data.RebateProgramSectors> getRebateProgramSectorses() {
        return rebateProgramSectorses;
    }

    public void setRebateProgramSectorses(Set<com.rebateprograms.data.RebateProgramSectors> rebateProgramSectorses) {
        this.rebateProgramSectorses = rebateProgramSectorses;
    }

    public Set<com.rebateprograms.data.RebateProgramUtilities> getRebateProgramUtilitieses() {
        return rebateProgramUtilitieses;
    }

    public void setRebateProgramUtilitieses(Set<com.rebateprograms.data.RebateProgramUtilities> rebateProgramUtilitieses) {
        this.rebateProgramUtilitieses = rebateProgramUtilitieses;
    }

    public Set<com.rebateprograms.data.RebateProgramFundingTypes> getRebateProgramFundingTypeses() {
        return rebateProgramFundingTypeses;
    }

    public void setRebateProgramFundingTypeses(Set<com.rebateprograms.data.RebateProgramFundingTypes> rebateProgramFundingTypeses) {
        this.rebateProgramFundingTypeses = rebateProgramFundingTypeses;
    }

}
