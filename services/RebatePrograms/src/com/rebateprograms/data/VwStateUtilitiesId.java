
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.VwStateUtilitiesId
 *  07/31/2013 09:43:25
 * 
 */
public class VwStateUtilitiesId
    implements Serializable
{

    private Integer id;
    private String utility;
    private String state;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwStateUtilitiesId)) {
            return false;
        }
        VwStateUtilitiesId other = ((VwStateUtilitiesId) o);
        if (this.id == null) {
            if (other.id!= null) {
                return false;
            }
        } else {
            if (!this.id.equals(other.id)) {
                return false;
            }
        }
        if (this.utility == null) {
            if (other.utility!= null) {
                return false;
            }
        } else {
            if (!this.utility.equals(other.utility)) {
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
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.id!= null) {
            rtn = (rtn + this.id.hashCode());
        }
        rtn = (rtn* 37);
        if (this.utility!= null) {
            rtn = (rtn + this.utility.hashCode());
        }
        rtn = (rtn* 37);
        if (this.state!= null) {
            rtn = (rtn + this.state.hashCode());
        }
        return rtn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUtility() {
        return utility;
    }

    public void setUtility(String utility) {
        this.utility = utility;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
