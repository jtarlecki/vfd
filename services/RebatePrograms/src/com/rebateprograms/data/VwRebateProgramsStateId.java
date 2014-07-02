
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.VwRebateProgramsStateId
 *  07/31/2013 09:43:25
 * 
 */
public class VwRebateProgramsStateId
    implements Serializable
{

    private Integer id;
    private String rebateProgram;
    private String state;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwRebateProgramsStateId)) {
            return false;
        }
        VwRebateProgramsStateId other = ((VwRebateProgramsStateId) o);
        if (this.id == null) {
            if (other.id!= null) {
                return false;
            }
        } else {
            if (!this.id.equals(other.id)) {
                return false;
            }
        }
        if (this.rebateProgram == null) {
            if (other.rebateProgram!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgram.equals(other.rebateProgram)) {
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
        if (this.rebateProgram!= null) {
            rtn = (rtn + this.rebateProgram.hashCode());
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

    public String getRebateProgram() {
        return rebateProgram;
    }

    public void setRebateProgram(String rebateProgram) {
        this.rebateProgram = rebateProgram;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
