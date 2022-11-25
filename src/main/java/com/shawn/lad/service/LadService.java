package com.shawn.lad.service;

import com.shawn.lad.domain.*;

import java.util.List;

public interface LadService {
    List<Lad> getallinformation();
    List<Lad> searchinformation(SearchInfo searchInfo);
    List<Lad> searchinputlist(SearchInfo searchInfo);
    void insertSubmit(submit submit_final);
    List<submit> getallsubmitinformation();

    List<protein_domain> getDomainsInfo(String search,int offset,int limit);

    List<Sanji> getSanji(String ladId, String only);

    Sanji getSanjiBycode(String ladId, String code);
}
