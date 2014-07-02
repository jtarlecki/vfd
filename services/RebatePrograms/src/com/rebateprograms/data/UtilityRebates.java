
package com.rebateprograms.data;



/**
 *  RebatePrograms.UtilityRebates
 *  07/31/2013 09:43:25
 * 
 */
public class UtilityRebates {

    private Integer id;
    private Utilities utilities;
    private Integer rebates;
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utilities getUtilities() {
        return utilities;
    }

    public void setUtilities(Utilities utilities) {
        this.utilities = utilities;
    }

    public Integer getRebates() {
        return rebates;
    }

    public void setRebates(Integer rebates) {
        this.rebates = rebates;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
