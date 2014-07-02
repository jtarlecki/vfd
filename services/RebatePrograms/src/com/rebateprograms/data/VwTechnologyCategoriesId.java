
package com.rebateprograms.data;

import java.io.Serializable;


/**
 *  RebatePrograms.VwTechnologyCategoriesId
 *  07/31/2013 09:43:25
 * 
 */
public class VwTechnologyCategoriesId
    implements Serializable
{

    private Integer technologyCategoryId;
    private String technologyCategory;
    private String technology;
    private Integer technologyId;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VwTechnologyCategoriesId)) {
            return false;
        }
        VwTechnologyCategoriesId other = ((VwTechnologyCategoriesId) o);
        if (this.technologyCategoryId == null) {
            if (other.technologyCategoryId!= null) {
                return false;
            }
        } else {
            if (!this.technologyCategoryId.equals(other.technologyCategoryId)) {
                return false;
            }
        }
        if (this.technologyCategory == null) {
            if (other.technologyCategory!= null) {
                return false;
            }
        } else {
            if (!this.technologyCategory.equals(other.technologyCategory)) {
                return false;
            }
        }
        if (this.technology == null) {
            if (other.technology!= null) {
                return false;
            }
        } else {
            if (!this.technology.equals(other.technology)) {
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
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.technologyCategoryId!= null) {
            rtn = (rtn + this.technologyCategoryId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technologyCategory!= null) {
            rtn = (rtn + this.technologyCategory.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technology!= null) {
            rtn = (rtn + this.technology.hashCode());
        }
        rtn = (rtn* 37);
        if (this.technologyId!= null) {
            rtn = (rtn + this.technologyId.hashCode());
        }
        return rtn;
    }

    public Integer getTechnologyCategoryId() {
        return technologyCategoryId;
    }

    public void setTechnologyCategoryId(Integer technologyCategoryId) {
        this.technologyCategoryId = technologyCategoryId;
    }

    public String getTechnologyCategory() {
        return technologyCategory;
    }

    public void setTechnologyCategory(String technologyCategory) {
        this.technologyCategory = technologyCategory;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Integer getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Integer technologyId) {
        this.technologyId = technologyId;
    }

}
