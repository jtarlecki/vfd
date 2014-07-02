
package com.rebateprograms.data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Clients
 *  07/31/2013 09:43:25
 * 
 */
public class Clients {

    private Integer id;
    private com.rebateprograms.data.Employees employeesByCeemployeeId;
    private com.rebateprograms.data.Employees employeesByRaemployeeId;
    private Boolean active;
    private String account;
    private String company;
    private String techNotes;
    private Integer goalProjects;
    private BigDecimal goalRevenue;
    private Integer totalProjects;
    private BigDecimal totalRevenue;
    private BigDecimal totalIncentives;
    private Integer activeProjects;
    private Integer lastTotalProjects;
    private BigDecimal lastTotalRevenue;
    private BigDecimal lastTotalIncentives;
    private Integer lastActiveProjects;
    private Integer nextTotalProjects;
    private BigDecimal nextTotalRevenue;
    private BigDecimal nextTotalIncentives;
    private Integer nextActiveProjects;
    private String plssite;
    private String plssiteLink;
    private String notifyContactFname;
    private String notifyContactLname;
    private String notifyContactEmail;
    private Boolean rafNotify;
    private Boolean rafQuestions;
    private Boolean rafPreLoad;
    private Boolean rafAddStatus;
    private Boolean rafDispAgreement;
    private String agreementTitle;
    private String agreementText;
    private String feeTiers;
    private String feeTierPercentages;
    private String feeMinimum;
    private Integer grade;
    private Boolean netCheck;
    private String tin;
    private Boolean noPrintFlag;
    private Boolean useJobsFlag;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.SubClients> subClientses = new HashSet<com.rebateprograms.data.SubClients>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.rebateprograms.data.Employees getEmployeesByCeemployeeId() {
        return employeesByCeemployeeId;
    }

    public void setEmployeesByCeemployeeId(com.rebateprograms.data.Employees employeesByCeemployeeId) {
        this.employeesByCeemployeeId = employeesByCeemployeeId;
    }

    public com.rebateprograms.data.Employees getEmployeesByRaemployeeId() {
        return employeesByRaemployeeId;
    }

    public void setEmployeesByRaemployeeId(com.rebateprograms.data.Employees employeesByRaemployeeId) {
        this.employeesByRaemployeeId = employeesByRaemployeeId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTechNotes() {
        return techNotes;
    }

    public void setTechNotes(String techNotes) {
        this.techNotes = techNotes;
    }

    public Integer getGoalProjects() {
        return goalProjects;
    }

    public void setGoalProjects(Integer goalProjects) {
        this.goalProjects = goalProjects;
    }

    public BigDecimal getGoalRevenue() {
        return goalRevenue;
    }

    public void setGoalRevenue(BigDecimal goalRevenue) {
        this.goalRevenue = goalRevenue;
    }

    public Integer getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(Integer totalProjects) {
        this.totalProjects = totalProjects;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public BigDecimal getTotalIncentives() {
        return totalIncentives;
    }

    public void setTotalIncentives(BigDecimal totalIncentives) {
        this.totalIncentives = totalIncentives;
    }

    public Integer getActiveProjects() {
        return activeProjects;
    }

    public void setActiveProjects(Integer activeProjects) {
        this.activeProjects = activeProjects;
    }

    public Integer getLastTotalProjects() {
        return lastTotalProjects;
    }

    public void setLastTotalProjects(Integer lastTotalProjects) {
        this.lastTotalProjects = lastTotalProjects;
    }

    public BigDecimal getLastTotalRevenue() {
        return lastTotalRevenue;
    }

    public void setLastTotalRevenue(BigDecimal lastTotalRevenue) {
        this.lastTotalRevenue = lastTotalRevenue;
    }

    public BigDecimal getLastTotalIncentives() {
        return lastTotalIncentives;
    }

    public void setLastTotalIncentives(BigDecimal lastTotalIncentives) {
        this.lastTotalIncentives = lastTotalIncentives;
    }

    public Integer getLastActiveProjects() {
        return lastActiveProjects;
    }

    public void setLastActiveProjects(Integer lastActiveProjects) {
        this.lastActiveProjects = lastActiveProjects;
    }

    public Integer getNextTotalProjects() {
        return nextTotalProjects;
    }

    public void setNextTotalProjects(Integer nextTotalProjects) {
        this.nextTotalProjects = nextTotalProjects;
    }

    public BigDecimal getNextTotalRevenue() {
        return nextTotalRevenue;
    }

    public void setNextTotalRevenue(BigDecimal nextTotalRevenue) {
        this.nextTotalRevenue = nextTotalRevenue;
    }

    public BigDecimal getNextTotalIncentives() {
        return nextTotalIncentives;
    }

    public void setNextTotalIncentives(BigDecimal nextTotalIncentives) {
        this.nextTotalIncentives = nextTotalIncentives;
    }

    public Integer getNextActiveProjects() {
        return nextActiveProjects;
    }

    public void setNextActiveProjects(Integer nextActiveProjects) {
        this.nextActiveProjects = nextActiveProjects;
    }

    public String getPlssite() {
        return plssite;
    }

    public void setPlssite(String plssite) {
        this.plssite = plssite;
    }

    public String getPlssiteLink() {
        return plssiteLink;
    }

    public void setPlssiteLink(String plssiteLink) {
        this.plssiteLink = plssiteLink;
    }

    public String getNotifyContactFname() {
        return notifyContactFname;
    }

    public void setNotifyContactFname(String notifyContactFname) {
        this.notifyContactFname = notifyContactFname;
    }

    public String getNotifyContactLname() {
        return notifyContactLname;
    }

    public void setNotifyContactLname(String notifyContactLname) {
        this.notifyContactLname = notifyContactLname;
    }

    public String getNotifyContactEmail() {
        return notifyContactEmail;
    }

    public void setNotifyContactEmail(String notifyContactEmail) {
        this.notifyContactEmail = notifyContactEmail;
    }

    public Boolean getRafNotify() {
        return rafNotify;
    }

    public void setRafNotify(Boolean rafNotify) {
        this.rafNotify = rafNotify;
    }

    public Boolean getRafQuestions() {
        return rafQuestions;
    }

    public void setRafQuestions(Boolean rafQuestions) {
        this.rafQuestions = rafQuestions;
    }

    public Boolean getRafPreLoad() {
        return rafPreLoad;
    }

    public void setRafPreLoad(Boolean rafPreLoad) {
        this.rafPreLoad = rafPreLoad;
    }

    public Boolean getRafAddStatus() {
        return rafAddStatus;
    }

    public void setRafAddStatus(Boolean rafAddStatus) {
        this.rafAddStatus = rafAddStatus;
    }

    public Boolean getRafDispAgreement() {
        return rafDispAgreement;
    }

    public void setRafDispAgreement(Boolean rafDispAgreement) {
        this.rafDispAgreement = rafDispAgreement;
    }

    public String getAgreementTitle() {
        return agreementTitle;
    }

    public void setAgreementTitle(String agreementTitle) {
        this.agreementTitle = agreementTitle;
    }

    public String getAgreementText() {
        return agreementText;
    }

    public void setAgreementText(String agreementText) {
        this.agreementText = agreementText;
    }

    public String getFeeTiers() {
        return feeTiers;
    }

    public void setFeeTiers(String feeTiers) {
        this.feeTiers = feeTiers;
    }

    public String getFeeTierPercentages() {
        return feeTierPercentages;
    }

    public void setFeeTierPercentages(String feeTierPercentages) {
        this.feeTierPercentages = feeTierPercentages;
    }

    public String getFeeMinimum() {
        return feeMinimum;
    }

    public void setFeeMinimum(String feeMinimum) {
        this.feeMinimum = feeMinimum;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Boolean getNetCheck() {
        return netCheck;
    }

    public void setNetCheck(Boolean netCheck) {
        this.netCheck = netCheck;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public Boolean getNoPrintFlag() {
        return noPrintFlag;
    }

    public void setNoPrintFlag(Boolean noPrintFlag) {
        this.noPrintFlag = noPrintFlag;
    }

    public Boolean getUseJobsFlag() {
        return useJobsFlag;
    }

    public void setUseJobsFlag(Boolean useJobsFlag) {
        this.useJobsFlag = useJobsFlag;
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

    public Set<com.rebateprograms.data.SubClients> getSubClientses() {
        return subClientses;
    }

    public void setSubClientses(Set<com.rebateprograms.data.SubClients> subClientses) {
        this.subClientses = subClientses;
    }

}
