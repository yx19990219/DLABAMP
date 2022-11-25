package com.shawn.lad.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class Lad {
    private String Lad_ID;
    private String Sequence;
    private int Sequence_Length;
    private String Name;
    private String Source;
    private String Activity;
    private String Protein_existence;
    private String Comments;
    private String Target_Organism;
    private String Reference;
    private String Author;
    private String Title;
    private String Pubmed_ID;

    public String getPubmed_ID() {
        return Pubmed_ID;
    }

    public void setPubmed_ID(String pubmed_ID) {
        Pubmed_ID = pubmed_ID;
    }

    public String getLad_ID() {
        return Lad_ID;
    }

    public void setLad_ID(String lad_ID) {
        Lad_ID = lad_ID;
    }

    public String getSequence() {
        return Sequence;
    }

    public void setSequence(String sequence) {
        Sequence = sequence;
    }

    public int getSequence_Length() {
        return Sequence_Length;
    }

    public void setSequence_Length(int sequence_Length) {
        Sequence_Length = sequence_Length;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }

    public String getProtein_existence() {
        return Protein_existence;
    }

    public void setProtein_existence(String protein_existence) {
        Protein_existence = protein_existence;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public String getTarget_Organism() {
        return Target_Organism;
    }

    public void setTarget_Organism(String target_Organism) {
        Target_Organism = target_Organism;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Lad(){};

    public Lad(String lad_ID, String sequence, int sequence_Length, String name, String source, String activity, String pubmed_ID,String protein_existence, String comments, String target_Organism, String reference, String author, String title) {
        this.Lad_ID = lad_ID;
        this.Sequence = sequence;
        this.Sequence_Length = sequence_Length;
        this.Name = name;
        this.Source = source;
        this.Activity = activity;
        this.Protein_existence = protein_existence;
        this.Comments = comments;
        this.Target_Organism = target_Organism;
        this.Reference = reference;
        this.Author = author;
        this.Title = title;
        this.Pubmed_ID = pubmed_ID;
    }

    @Override
    public String toString() {
        return "Lad{" +
                "Lad_ID='" + Lad_ID + '\'' +
                ", Sequence='" + Sequence + '\'' +
                ", Sequence_Length='" + Sequence_Length + '\'' +
                ", Name='" + Name + '\'' +
                ", Source='" + Source + '\'' +
                ", Activity='" + Activity + '\'' +
                ", Protein_existence='" + Protein_existence + '\'' +
                ", Comments='" + Comments + '\'' +
                ", Target_Organism='" + Target_Organism + '\'' +
                ", Reference='" + Reference + '\'' +
                ", Author='" + Author + '\'' +
                ", Title='" + Title + '\'' +
                ", Pubmed_ID='" + Pubmed_ID + '\'' +
                '}';
    }

}
