
package com.rebateprograms.data;

import java.math.BigDecimal;
import java.util.Date;


/**
 *  RebatePrograms.Payouts
 *  07/31/2013 09:43:25
 * 
 */
public class Payouts {

    private Integer id;
    private PayoutTypes payoutTypes;
    private Uoms uoms;
    private Ecms ecms;
    private Double sizeMin;
    private Double sizeMax;
    private BigDecimal payoutDollars;
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

    public PayoutTypes getPayoutTypes() {
        return payoutTypes;
    }

    public void setPayoutTypes(PayoutTypes payoutTypes) {
        this.payoutTypes = payoutTypes;
    }

    public Uoms getUoms() {
        return uoms;
    }

    public void setUoms(Uoms uoms) {
        this.uoms = uoms;
    }

    public Ecms getEcms() {
        return ecms;
    }

    public void setEcms(Ecms ecms) {
        this.ecms = ecms;
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

    public BigDecimal getPayoutDollars() {
        return payoutDollars;
    }

    public void setPayoutDollars(BigDecimal payoutDollars) {
        this.payoutDollars = payoutDollars;
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
