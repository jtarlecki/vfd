
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.VwZipUtilityTechnologyPayoutCountId
 *  07/31/2013 09:43:25
 * 
 */
public class VwZipUtilityTechnologyPayoutCountId
    implements Serializable
{

    private String zipCode;
    private String state;
    private Integer energyTypeId;
    private Double overlap;
    private Integer rwwutilityId;
    private String rwwutilityName;
    private Integer technologyId;
    private Integer payoutCount;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwZipUtilityTechnologyPayoutCountId)) {
            return false;
        }
        VwZipUtilityTechnologyPayoutCountId other = ((VwZipUtilityTechnologyPayoutCountId) o);
        if (this.zipCode == null) {
            if (other.zipCode!= null) {
                return false;
            }
        } else {
            if (!this.zipCode.equals(other.zipCode)) {
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
        if (this.energyTypeId == null) {
            if (other.energyTypeId!= null) {
                return false;
            }
        } else {
            if (!this.energyTypeId.equals(other.energyTypeId)) {
                return false;
            }
        }
        if (this.overlap == null) {
            if (other.overlap!= null) {
                return false;
            }
        } else {
            if (!this.overlap.equals(other.overlap)) {
                return false;
            }
        }
        if (this.rwwutilityId == null) {
            if (other.rwwutilityId!= null) {
                return false;
            }
        } else {
            if (!this.rwwutilityId.equals(other.rwwutilityId)) {
                return false;
            }
        }
        if (this.rwwutilityName == null) {
            if (other.rwwutilityName!= null) {
                return false;
            }
        } else {
            if (!this.rwwutilityName.equals(other.rwwutilityName)) {
                return false;
            }
        }
        if (this.technologyId == null) {
            if (other.technologyId!= null) {
                return false;
            }
        } else {
            if (!this.technologyId.equals(other.technologyId)) {
                return false;
            }
        }
        if (this.payoutCount == null) {
            if (other.payoutCount!= null) {
                return false;
            }
        } else {
            if (!this.payoutCount.equals(other.payoutCount)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.zipCode!= null) {
            rtn = (rtn + this.zipCode.hashCode());
        }
        rtn = (rtn* 37);
        if (this.state!= null) {
            rtn = (rtn + this.state.hashCode());
        }
        rtn = (rtn* 37);
        if (this.energyTypeId!= null) {
            rtn = (rtn + this.energyTypeId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.overlap!= null) {
            rtn = (rtn + this.overlap.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rwwutilityId!= null) {
            rtn = (rtn + this.rwwutilityId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rwwutilityName!= null) {
            rtn = (rtn + this.rwwutilityName.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technologyId!= null) {
            rtn = (rtn + this.technologyId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.payoutCount!= null) {
            rtn = (rtn + this.payoutCount.hashCode());
        }
        return rtn;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getEnergyTypeId() {
        return energyTypeId;
    }

    public void setEnergyTypeId(Integer energyTypeId) {
        this.energyTypeId = energyTypeId;
    }

    public Double getOverlap() {
        return overlap;
    }

    public void setOverlap(Double overlap) {
        this.overlap = overlap;
    }

    public Integer getRwwutilityId() {
        return rwwutilityId;
    }

    public void setRwwutilityId(Integer rwwutilityId) {
        this.rwwutilityId = rwwutilityId;
    }

    public String getRwwutilityName() {
        return rwwutilityName;
    }

    public void setRwwutilityName(String rwwutilityName) {
        this.rwwutilityName = rwwutilityName;
    }

    public Integer getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Integer technologyId) {
        this.technologyId = technologyId;
    }

    public Integer getPayoutCount() {
        return payoutCount;
    }

    public void setPayoutCount(Integer payoutCount) {
        this.payoutCount = payoutCount;
    }

}
