
package com.rebateprograms.data;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 *  RebatePrograms.VwPayoutsMinMaxId
 *  07/31/2013 09:43:25
 * 
 */
public class VwPayoutsMinMaxId
    implements Serializable
{

    private Integer rebateProgramTechnologyId;
    private Integer rebateProgramId;
    private String rebateProgramName;
    private Integer technologyId;
    private Integer minPayoutId;
    private BigDecimal minPayoutDollars;
    private String minPayoutDollarsText;
    private String minPayoutUnits;
    private Integer maxPayoutId;
    private BigDecimal maxPayoutDollars;
    private String maxPayoutDollarsText;
    private String maxPayoutUnits;
    private String stateAbbr;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwPayoutsMinMaxId)) {
            return false;
        }
        VwPayoutsMinMaxId other = ((VwPayoutsMinMaxId) o);
        if (this.rebateProgramTechnologyId == null) {
            if (other.rebateProgramTechnologyId!= null) {
                return false;
            }
        } else {
            if (!this.rebateProgramTechnologyId.equals(other.rebateProgramTechnologyId)) {
                return false;
            }
        }
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
        if (this.technologyId == null) {
            if (other.technologyId!= null) {
                return false;
            }
        } else {
            if (!this.technologyId.equals(other.technologyId)) {
                return false;
            }
        }
        if (this.minPayoutId == null) {
            if (other.minPayoutId!= null) {
                return false;
            }
        } else {
            if (!this.minPayoutId.equals(other.minPayoutId)) {
                return false;
            }
        }
        if (this.minPayoutDollars == null) {
            if (other.minPayoutDollars!= null) {
                return false;
            }
        } else {
            if (!this.minPayoutDollars.equals(other.minPayoutDollars)) {
                return false;
            }
        }
        if (this.minPayoutDollarsText == null) {
            if (other.minPayoutDollarsText!= null) {
                return false;
            }
        } else {
            if (!this.minPayoutDollarsText.equals(other.minPayoutDollarsText)) {
                return false;
            }
        }
        if (this.minPayoutUnits == null) {
            if (other.minPayoutUnits!= null) {
                return false;
            }
        } else {
            if (!this.minPayoutUnits.equals(other.minPayoutUnits)) {
                return false;
            }
        }
        if (this.maxPayoutId == null) {
            if (other.maxPayoutId!= null) {
                return false;
            }
        } else {
            if (!this.maxPayoutId.equals(other.maxPayoutId)) {
                return false;
            }
        }
        if (this.maxPayoutDollars == null) {
            if (other.maxPayoutDollars!= null) {
                return false;
            }
        } else {
            if (!this.maxPayoutDollars.equals(other.maxPayoutDollars)) {
                return false;
            }
        }
        if (this.maxPayoutDollarsText == null) {
            if (other.maxPayoutDollarsText!= null) {
                return false;
            }
        } else {
            if (!this.maxPayoutDollarsText.equals(other.maxPayoutDollarsText)) {
                return false;
            }
        }
        if (this.maxPayoutUnits == null) {
            if (other.maxPayoutUnits!= null) {
                return false;
            }
        } else {
            if (!this.maxPayoutUnits.equals(other.maxPayoutUnits)) {
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
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.rebateProgramTechnologyId!= null) {
            rtn = (rtn + this.rebateProgramTechnologyId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebateProgramId!= null) {
            rtn = (rtn + this.rebateProgramId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rebateProgramName!= null) {
            rtn = (rtn + this.rebateProgramName.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technologyId!= null) {
            rtn = (rtn + this.technologyId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.minPayoutId!= null) {
            rtn = (rtn + this.minPayoutId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.minPayoutDollars!= null) {
            rtn = (rtn + this.minPayoutDollars.hashCode());
        }
        rtn = (rtn* 37);
        if (this.minPayoutDollarsText!= null) {
            rtn = (rtn + this.minPayoutDollarsText.hashCode());
        }
        rtn = (rtn* 37);
        if (this.minPayoutUnits!= null) {
            rtn = (rtn + this.minPayoutUnits.hashCode());
        }
        rtn = (rtn* 37);
        if (this.maxPayoutId!= null) {
            rtn = (rtn + this.maxPayoutId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.maxPayoutDollars!= null) {
            rtn = (rtn + this.maxPayoutDollars.hashCode());
        }
        rtn = (rtn* 37);
        if (this.maxPayoutDollarsText!= null) {
            rtn = (rtn + this.maxPayoutDollarsText.hashCode());
        }
        rtn = (rtn* 37);
        if (this.maxPayoutUnits!= null) {
            rtn = (rtn + this.maxPayoutUnits.hashCode());
        }
        rtn = (rtn* 37);
        if (this.stateAbbr!= null) {
            rtn = (rtn + this.stateAbbr.hashCode());
        }
        return rtn;
    }

    public Integer getRebateProgramTechnologyId() {
        return rebateProgramTechnologyId;
    }

    public void setRebateProgramTechnologyId(Integer rebateProgramTechnologyId) {
        this.rebateProgramTechnologyId = rebateProgramTechnologyId;
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

    public Integer getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Integer technologyId) {
        this.technologyId = technologyId;
    }

    public Integer getMinPayoutId() {
        return minPayoutId;
    }

    public void setMinPayoutId(Integer minPayoutId) {
        this.minPayoutId = minPayoutId;
    }

    public BigDecimal getMinPayoutDollars() {
        return minPayoutDollars;
    }

    public void setMinPayoutDollars(BigDecimal minPayoutDollars) {
        this.minPayoutDollars = minPayoutDollars;
    }

    public String getMinPayoutDollarsText() {
        return minPayoutDollarsText;
    }

    public void setMinPayoutDollarsText(String minPayoutDollarsText) {
        this.minPayoutDollarsText = minPayoutDollarsText;
    }

    public String getMinPayoutUnits() {
        return minPayoutUnits;
    }

    public void setMinPayoutUnits(String minPayoutUnits) {
        this.minPayoutUnits = minPayoutUnits;
    }

    public Integer getMaxPayoutId() {
        return maxPayoutId;
    }

    public void setMaxPayoutId(Integer maxPayoutId) {
        this.maxPayoutId = maxPayoutId;
    }

    public BigDecimal getMaxPayoutDollars() {
        return maxPayoutDollars;
    }

    public void setMaxPayoutDollars(BigDecimal maxPayoutDollars) {
        this.maxPayoutDollars = maxPayoutDollars;
    }

    public String getMaxPayoutDollarsText() {
        return maxPayoutDollarsText;
    }

    public void setMaxPayoutDollarsText(String maxPayoutDollarsText) {
        this.maxPayoutDollarsText = maxPayoutDollarsText;
    }

    public String getMaxPayoutUnits() {
        return maxPayoutUnits;
    }

    public void setMaxPayoutUnits(String maxPayoutUnits) {
        this.maxPayoutUnits = maxPayoutUnits;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

}
