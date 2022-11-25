package com.shawn.lad.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Submit_LAD {
    private String name;
    private String source;
    private String activity;
    private String sequence;
    private String personname;
    private String email;
    private List<domains> domains;
}
