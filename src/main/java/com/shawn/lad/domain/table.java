package com.shawn.lad.domain;

public class table {
    private String lad_ID;
    private String sequence;

    public table() {
    }


    public table(String lad_ID, String sequence) {
        this.lad_ID = lad_ID;
        this.sequence = sequence;
    }

    public String getLad_ID() {
        return lad_ID;
    }

    public void setLad_ID(String lad_ID) {
        this.lad_ID = lad_ID;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
