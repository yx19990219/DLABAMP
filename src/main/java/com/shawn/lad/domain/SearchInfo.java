package com.shawn.lad.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class SearchInfo {
    private String field;
    private String information;
    private String field1;
    private String information1;
    private String field2;
    private String information2;
    private String field3;
    private String andor1;
    private String andor2;
    private String andor3;

    public String getAndor1() {
        return andor1;
    }

    public void setAndor1(String andor1) {
        this.andor1 = andor1;
    }

    public String getAndor2() {
        return andor2;
    }

    public void setAndor2(String andor2) {
        this.andor2 = andor2;
    }

    public String getAndor3() {
        return andor3;
    }

    public void setAndor3(String andor3) {
        this.andor3 = andor3;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getInformation1() {
        return information1;
    }

    public void setInformation1(String information1) {
        this.information1 = information1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getInformation2() {
        return information2;
    }

    public void setInformation2(String information2) {
        this.information2 = information2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getInformation3() {
        return information3;
    }

    public void setInformation3(String information3) {
        this.information3 = information3;
    }

    private String information3;

    public String getFiled() {
        return field;
    }

    public void setFiled(String filed) {
        this.field = filed;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
