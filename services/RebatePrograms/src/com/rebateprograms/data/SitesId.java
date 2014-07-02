
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.SitesId
 *  07/31/2013 09:43:25
 * 
 */
public class SitesId
    implements Serializable
{

    private Integer id;
    private String siteNumber;
    private String addr;
    private String city;
    private String state;
    private String zip;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SitesId)) {
            return false;
        }
        SitesId other = ((SitesId) o);
        if (this.id == null) {
            if (other.id!= null) {
                return false;
            }
        } else {
            if (!this.id.equals(other.id)) {
                return false;
            }
        }
        if (this.siteNumber == null) {
            if (other.siteNumber!= null) {
                return false;
            }
        } else {
            if (!this.siteNumber.equals(other.siteNumber)) {
                return false;
            }
        }
        if (this.addr == null) {
            if (other.addr!= null) {
                return false;
            }
        } else {
            if (!this.addr.equals(other.addr)) {
                return false;
            }
        }
        if (this.city == null) {
            if (other.city!= null) {
                return false;
            }
        } else {
            if (!this.city.equals(other.city)) {
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
        if (this.zip == null) {
            if (other.zip!= null) {
                return false;
            }
        } else {
            if (!this.zip.equals(other.zip)) {
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
        if (this.siteNumber!= null) {
            rtn = (rtn + this.siteNumber.hashCode());
        }
        rtn = (rtn* 37);
        if (this.addr!= null) {
            rtn = (rtn + this.addr.hashCode());
        }
        rtn = (rtn* 37);
        if (this.city!= null) {
            rtn = (rtn + this.city.hashCode());
        }
        rtn = (rtn* 37);
        if (this.state!= null) {
            rtn = (rtn + this.state.hashCode());
        }
        rtn = (rtn* 37);
        if (this.zip!= null) {
            rtn = (rtn + this.zip.hashCode());
        }
        return rtn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
