package com.shawn.lad.domain;

/**
 * @author Shawn
 */
public class protein_domain {

    private String LAD_ID;

    private String LAD_Domain;

    private String LAD_Family;

    private String Description;

    public protein_domain(String LAD_ID, String LAD_Domain, String LAD_Family, String description) {
        this.LAD_ID = LAD_ID;
        this.LAD_Domain = LAD_Domain;
        this.LAD_Family = LAD_Family;
        Description = description;
    }

    public String getLAD_ID() {
        return LAD_ID;
    }

    public void setLAD_ID(String LAD_ID) {
        this.LAD_ID = LAD_ID;
    }

    public String getLAD_Domain() {
        return LAD_Domain;
    }

    public void setLAD_Domain(String LAD_Domain) {
        this.LAD_Domain = LAD_Domain;
    }

    public String getLAD_Family() {
        return LAD_Family;
    }

    public void setLAD_Family(String LAD_Family) {
        this.LAD_Family = LAD_Family;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
