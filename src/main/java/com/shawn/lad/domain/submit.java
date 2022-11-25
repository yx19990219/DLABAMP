package com.shawn.lad.domain;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class submit {
    private String name;
    private String source;
    private String activity;
    private String sequence;
    private String personname;
    private String email;
    private String Sequence_Length;
    private String Protein_existence;
    private String Comments;
    private String Target_Organism;
    private String Reference;
    private String Author;
    private String Title;
    private String Pubmed_ID;
}
