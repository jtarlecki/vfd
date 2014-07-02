
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.VwRebateProgramCountByStateAndTechCatId
 *  07/31/2013 09:43:25
 * 
 */
public class VwRebateProgramCountByStateAndTechCatId
    implements Serializable
{

    private Integer stateId;
    private String stateAbbr;
    private Integer technologyCategoryId;
    private String technologyCategoryName;
    private Integer rebateProgramCount;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwRebateProgramCountByStateAndTechCatId)) {
            return false;
        }
        VwRebateProgramCountByStateAndTechCatId other = ((VwRebateProgramCountByStateAndTechCatId) o);
        if (this.stateId == null) {
            if (other.stateId!= null) {
                return false;
            }
        } else {
            if (!this.stateId.equals(other.stateId)) {
                return false;
            }
        }
        if (this.stateAbbr == null) {
            if (other.stateAbbr!= null) {
                return false;
            }
        } else {
            if (!this.stateAbbr.equals(other.stateAbbr)) {
                return false;
            }
        }
        if (this.technologyCategoryId == null) {
            if (other.technologyCategoryId!= null) {
                return false;
            }
        } else {
            if (!this.technologyCategoryId.equals(other.technologyCategoryId)) {
                return false;
            }
        }
        if (this.technologyCategoryName == null) {
            if (other.technologyCategoryName!= null) {
                return false;
            }
        } else {
            if (!this.technologyCategoryName.equals(other.technologyCategoryName)) {
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
        if (this.stateId!= null) {
            rtn = (rtn + this.stateId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.stateAbbr!= null) {
            rtn = (rtn + this.stateAbbr.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technologyCategoryId!= null) {
            rtn = (rtn + this.technologyCategoryId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technologyCategoryName!= null) {
            rtn = (rtn + this.technologyCategoryName.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebateProgramCount!= null) {
            rtn = (rtn + this.rebateProgramCount.hashCode());
        }
        return rtn;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public Integer getTechnologyCategoryId() {
        return technologyCategoryId;
    }

    public void setTechnologyCategoryId(Integer technologyCategoryId) {
        this.technologyCategoryId = technologyCategoryId;
    }

    public String getTechnologyCategoryName() {
        return technologyCategoryName;
    }

    public void setTechnologyCategoryName(String technologyCategoryName) {
        this.technologyCategoryName = technologyCategoryName;
    }

    public Integer getRebateProgramCount() {
        return rebateProgramCount;
    }

    public void setRebateProgramCount(Integer rebateProgramCount) {
        this.rebateProgramCount = rebateProgramCount;
    }

}
