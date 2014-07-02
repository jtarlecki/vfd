
package com.rebateprograms.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.ProgramStatuses
 *  07/31/2013 09:43:25
 * 
 */
public class ProgramStatuses {

    private Integer id;
    private String description;
    private Date created;
    private Date modified;
    private String comments;
    private String img;
    private Set<com.rebateprograms.data.RebateProgramUtilities> rebateProgramUtilitieses = new HashSet<com.rebateprograms.data.RebateProgramUtilities>();
    private Set<com.rebateprograms.data.RebatePrograms> rebateProgramses = new HashSet<com.rebateprograms.data.RebatePrograms>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Set<com.rebateprograms.data.RebateProgramUtilities> getRebateProgramUtilitieses() {
        return rebateProgramUtilitieses;
    }

    public void setRebateProgramUtilitieses(Set<com.rebateprograms.data.RebateProgramUtilities> rebateProgramUtilitieses) {
        this.rebateProgramUtilitieses = rebateProgramUtilitieses;
    }

    public Set<com.rebateprograms.data.RebatePrograms> getRebateProgramses() {
        return rebateProgramses;
    }

    public void setRebateProgramses(Set<com.rebateprograms.data.RebatePrograms> rebateProgramses) {
        this.rebateProgramses = rebateProgramses;
    }

}
