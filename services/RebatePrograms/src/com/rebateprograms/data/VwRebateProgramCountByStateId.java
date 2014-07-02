
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.VwRebateProgramCountByStateId
 *  07/31/2013 09:43:25
 * 
 */
public class VwRebateProgramCountByStateId
    implements Serializable
{

    private String rebateProgramState;
    private Integer rebateProgramCount;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwRebateProgramCountByStateId)) {
            return false;
        }
        VwRebateProgramCountByStateId other = ((VwRebateProgramCountByStateId) o);
        if (this.rebateProgramState == null) {
            if (other.rebateProgramState!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgramState.equals(other.rebateProgramState)) {
                return false;
            }
        }
        if (this.rebateProgramCount == null) {
            if (other.rebateProgramCount!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgramCount.equals(other.rebateProgramCount)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.rebateProgramState!= null) {
            rtn = (rtn + this.rebateProgramState.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebateProgramCount!= null) {
            rtn = (rtn + this.rebateProgramCount.hashCode());
        }
        return rtn;
    }

    public String getRebateProgramState() {
        return rebateProgramState;
    }

    public void setRebateProgramState(String rebateProgramState) {
        this.rebateProgramState = rebateProgramState;
    }

    public Integer getRebateProgramCount() {
        return rebateProgramCount;
    }

    public void setRebateProgramCount(Integer rebateProgramCount) {
        this.rebateProgramCount = rebateProgramCount;
    }

}
