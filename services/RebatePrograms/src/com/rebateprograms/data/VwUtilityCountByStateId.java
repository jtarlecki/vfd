
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.VwUtilityCountByStateId
 *  07/31/2013 09:43:25
 * 
 */
public class VwUtilityCountByStateId
    implements Serializable
{

    private String state;
    private Integer rwwutilityCount;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwUtilityCountByStateId)) {
            return false;
        }
        VwUtilityCountByStateId other = ((VwUtilityCountByStateId) o);
        if (this.state == null) {
            if (other.state!= null) {
                return false;
            }
        } else {
            if (!this.state.equals(other.state)) {
                return false;
            }
        }
        if (this.rwwutilityCount == null) {
            if (other.rwwutilityCount!= null) {
                return false;
            }
        } else {
            if (!this.rwwutilityCount.equals(other.rwwutilityCount)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.state!= null) {
            rtn = (rtn + this.state.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rwwutilityCount!= null) {
            rtn = (rtn + this.rwwutilityCount.hashCode());
        }
        return rtn;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getRwwutilityCount() {
        return rwwutilityCount;
    }

    public void setRwwutilityCount(Integer rwwutilityCount) {
        this.rwwutilityCount = rwwutilityCount;
    }

}
