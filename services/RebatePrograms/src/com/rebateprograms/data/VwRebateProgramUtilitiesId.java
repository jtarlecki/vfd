
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.VwRebateProgramUtilitiesId
 *  07/31/2013 09:43:25
 * 
 */
public class VwRebateProgramUtilitiesId
    implements Serializable
{

    private Integer rebateProgramId;
    private String rebateProgramName;
    private String state;
    private Integer utilityId;
    private String utilityName;
    private String programStatus;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwRebateProgramUtilitiesId)) {
            return false;
        }
        VwRebateProgramUtilitiesId other = ((VwRebateProgramUtilitiesId) o);
        if (this.rebateProgramId == null) {
            if (other.rebateProgramId!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgramId.equals(other.rebateProgramId)) {
                return false;
            }
        }
        if (this.rebateProgramName == null) {
            if (other.rebateProgramName!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgramName.equals(other.rebateProgramName)) {
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
        if (this.utilityId == null) {
            if (other.utilityId!= null) {
                return false;
            }
        } else {
            if (!this.utilityId.equals(other.utilityId)) {
                return false;
            }
        }
        if (this.utilityName == null) {
            if (other.utilityName!= null) {
                return false;
            }
        } else {
            if (!this.utilityName.equals(other.utilityName)) {
                return false;
            }
        }
        if (this.programStatus == null) {
            if (other.programStatus!= null) {
                return false;
            }
        } else {
            if (!this.programStatus.equals(other.programStatus)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.rebateProgramId!= null) {
            rtn = (rtn + this.rebateProgramId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebateProgramName!= null) {
            rtn = (rtn + this.rebateProgramName.hashCode());
        }
        rtn = (rtn* 37);
        if (this.state!= null) {
            rtn = (rtn + this.state.hashCode());
        }
        rtn = (rtn* 37);
        if (this.utilityId!= null) {
            rtn = (rtn + this.utilityId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.utilityName!= null) {
            rtn = (rtn + this.utilityName.hashCode());
        }
        rtn = (rtn* 37);
        if (this.programStatus!= null) {
            rtn = (rtn + this.programStatus.hashCode());
        }
        return rtn;
    }

    public Integer getRebateProgramId() {
        return rebateProgramId;
    }

    public void setRebateProgramId(Integer rebateProgramId) {
        this.rebateProgramId = rebateProgramId;
    }

    public String getRebateProgramName() {
        return rebateProgramName;
    }

    public void setRebateProgramName(String rebateProgramName) {
        this.rebateProgramName = rebateProgramName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getUtilityId() {
        return utilityId;
    }

    public void setUtilityId(Integer utilityId) {
        this.utilityId = utilityId;
    }

    public String getUtilityName() {
        return utilityName;
    }

    public void setUtilityName(String utilityName) {
        this.utilityName = utilityName;
    }

    public String getProgramStatus() {
        return programStatus;
    }

    public void setProgramStatus(String programStatus) {
        this.programStatus = programStatus;
    }

}
