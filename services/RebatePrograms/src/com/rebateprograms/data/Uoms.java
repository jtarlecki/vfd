
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Uoms
 *  07/31/2013 09:43:25
 * 
 */
public class Uoms {

    private Integer id;
    private String uom;
    private String createdUser;
    private Date createdDate;
    private String modifiedUser;
    private Date modifiedDate;
    private Set<com.rebateprograms.data.PayoutTypes> payoutTypeses = new HashSet<com.rebateprograms.data.PayoutTypes>();
    private Set<com.rebateprograms.data.Payouts> payoutses = new HashSet<com.rebateprograms.data.Payouts>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
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

    public Set<com.rebateprograms.data.PayoutTypes> getPayoutTypeses() {
        return payoutTypeses;
    }

    public void setPayoutTypeses(Set<com.rebateprograms.data.PayoutTypes> payoutTypeses) {
        this.payoutTypeses = payoutTypeses;
    }

    public Set<com.rebateprograms.data.Payouts> getPayoutses() {
        return payoutses;
    }

    public void setPayoutses(Set<com.rebateprograms.data.Payouts> payoutses) {
        this.payoutses = payoutses;
    }

}
