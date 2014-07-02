
package com.rebateprograms.data;

import java.util.Date;


/**
 *  RebatePrograms.RebateProgramUtilities
 *  07/31/2013 09:43:25
 * 
 */
public class RebateProgramUtilities {

    private Integer id;
    private ProgramStatuses programStatuses;
    private RebatePrograms rebatePrograms;
    private Rwwutility rwwutility;
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

    public ProgramStatuses getProgramStatuses() {
        return programStatuses;
    }

    public void setProgramStatuses(ProgramStatuses programStatuses) {
        this.programStatuses = programStatuses;
    }

    public RebatePrograms getRebatePrograms() {
        return rebatePrograms;
    }

    public void setRebatePrograms(RebatePrograms rebatePrograms) {
        this.rebatePrograms = rebatePrograms;
    }

    public Rwwutility getRwwutility() {
        return rwwutility;
    }

    public void setRwwutility(Rwwutility rwwutility) {
        this.rwwutility = rwwutility;
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
