package com.shawn.lad.domain;

/**
 * @author Shawn
 */
public class Sanji {

    private String ID;

    private String Source;

    private String PDBCode;

    private String Title;

    private String Evalue;

    private String Classfication;

    private String Method;

    private String ReleaseDate;

    private String LiteratureDOI;

    private String Image;

    private String URL;

    private String URL_3D;

    public Sanji() {
    }

    public String getLad_ID() {
        return ID;
    }

    public void setLad_ID(String lad_ID) {
        ID = lad_ID;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getPDBCode() {
        return PDBCode;
    }

    public void setPDBCode(String PDBCode) {
        this.PDBCode = PDBCode;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getEvalue() {
        return Evalue;
    }

    public void setEvalue(String evalue) {
        Evalue = evalue;
    }

    public String getClassfication() {
        return Classfication;
    }

    public void setClassfication(String classfication) {
        Classfication = classfication;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getLiteratureDOI() {
        return LiteratureDOI;
    }

    public void setLiteratureDOI(String literatureDOI) {
        LiteratureDOI = literatureDOI;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getURL_3D() {
        return URL_3D;
    }

    public void setURL_3D(String URL_3D) {
        this.URL_3D = URL_3D;
    }

    @Override
    public String toString() {
        return "Sanji{" +
                "Lad_ID='" + ID + '\'' +
                ", Source='" + Source + '\'' +
                ", PDBCode='" + PDBCode + '\'' +
                ", Title='" + Title + '\'' +
                ", Evalue='" + Evalue + '\'' +
                ", Classfication='" + Classfication + '\'' +
                ", Method='" + Method + '\'' +
                ", ReleaseDate='" + ReleaseDate + '\'' +
                ", LiteratureDOI='" + LiteratureDOI + '\'' +
                ", Image='" + Image + '\'' +
                ", URL='" + URL + '\'' +
                ", URL_3D='" + URL_3D + '\'' +
                '}';
    }
}
