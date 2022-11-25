package com.shawn.lad.domain;

import java.util.List;

/**
 * @author Shawn
 */
public class protein_domain_list {

    private List<protein_domain> values;

    private int total;

    public protein_domain_list(List<protein_domain> values, int total) {
        this.values = values;
        this.total = total;
    }

    public List<protein_domain> getRows() {
        return values;
    }

    public void setRows(List<protein_domain> rows) {
        this.values = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
