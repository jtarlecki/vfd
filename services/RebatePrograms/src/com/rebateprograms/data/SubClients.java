
package com.rebateprograms.data;

import java.util.Date;


/**
 *  RebatePrograms.SubClients
 *  07/31/2013 09:43:25
 * 
 */
public class SubClients {

    private Integer id;
    private Clients clients;
    private String subClientName;
    private String subClientAbbr;
    private String modifiedUser;
    private Date modifiedDate;
    private Integer clientReportsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public String getSubClientName() {
        return subClientName;
    }

    public void setSubClientName(String subClientName) {
        this.subClientName = subClientName;
    }

    public String getSubClientAbbr() {
        return subClientAbbr;
    }

    public void setSubClientAbbr(String subClientAbbr) {
        this.subClientAbbr = subClientAbbr;
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

    public Integer getClientReportsId() {
        return clientReportsId;
    }

    public void setClientReportsId(Integer clientReportsId) {
        this.clientReportsId = clientReportsId;
    }

}
