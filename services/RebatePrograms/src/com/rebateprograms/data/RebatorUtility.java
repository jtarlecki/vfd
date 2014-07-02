
package com.rebateprograms.data;

import java.util.Date;


/**
 *  RebatePrograms.RebatorUtility
 *  07/31/2013 09:43:25
 * 
 */
public class RebatorUtility {

    private Integer id;
    private Utilities utilities;
    private Rebators rebators;
    private Rwwutility rwwutility;
    private String modifiedUser;
    private Date modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utilities getUtilities() {
        return utilities;
    }

    public void setUtilities(Utilities utilities) {
        this.utilities = utilities;
    }

    public Rebators getRebators() {
        return rebators;
    }

    public void setRebators(Rebators rebators) {
        this.rebators = rebators;
    }

    public Rwwutility getRwwutility() {
        return rwwutility;
    }

    public void setRwwutility(Rwwutility rwwutility) {
        this.rwwutility = rwwutility;
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
