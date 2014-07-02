
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.RebateProgramTechnologies
 *  07/31/2013 09:43:25
 * 
 */
public class RebateProgramTechnologies {

    private Integer id;
    private RebatePrograms rebatePrograms;
    private Technologies technologies;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private String directoryUrl;
    private String applicationUrl;
    private String caps;
    private String payoutOverview;
    private Set<com.rebateprograms.data.Ecms> ecmses = new HashSet<com.rebateprograms.data.Ecms>();
    private Set<com.rebateprograms.data.Notes> noteses = new HashSet<com.rebateprograms.data.Notes>();
    private Set<com.rebateprograms.data.Caps> capses = new HashSet<com.rebateprograms.data.Caps>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RebatePrograms getRebatePrograms() {
        return rebatePrograms;
    }

    public void setRebatePrograms(RebatePrograms rebatePrograms) {
        this.rebatePrograms = rebatePrograms;
    }

    public Technologies getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Technologies technologies) {
        this.technologies = technologies;
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

    public String getCaps() {
        return caps;
    }

    public void setCaps(String caps) {
        this.caps = caps;
    }

    public String getPayoutOverview() {
        return payoutOverview;
    }

    public void setPayoutOverview(String payoutOverview) {
        this.payoutOverview = payoutOverview;
    }

    public Set<com.rebateprograms.data.Ecms> getEcmses() {
        return ecmses;
    }

    public void setEcmses(Set<com.rebateprograms.data.Ecms> ecmses) {
        this.ecmses = ecmses;
    }

    public Set<com.rebateprograms.data.Notes> getNoteses() {
        return noteses;
    }

    public void setNoteses(Set<com.rebateprograms.data.Notes> noteses) {
        this.noteses = noteses;
    }

    public Set<com.rebateprograms.data.Caps> getCapses() {
        return capses;
    }

    public void setCapses(Set<com.rebateprograms.data.Caps> capses) {
        this.capses = capses;
    }

}
