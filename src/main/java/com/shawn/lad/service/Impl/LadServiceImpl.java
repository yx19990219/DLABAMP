package com.shawn.lad.service.Impl;


import com.shawn.lad.Mapper.LadMapper;
import com.shawn.lad.domain.*;
import com.shawn.lad.service.LadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LadServiceImpl implements LadService {
    @Autowired
    LadMapper ladMapper;

    @Override
    public List<Lad> getallinformation() { return ladMapper.getallinformation();}

    @Override
    public List<Lad> searchinformation(SearchInfo searchInfo) {
        return ladMapper.searchinformation(searchInfo);
    }

    @Override
    public List<Lad> searchinputlist(SearchInfo searchInfo) {
        return ladMapper.searchinputlist(searchInfo);
    }

    @Override
    public void insertSubmit(submit submit_final) {
        ladMapper.insertSubmit(submit_final);
    }

    @Override
    public List<submit> getallsubmitinformation() {
        return ladMapper.getallsubmitinformation();
    }

    @Override
    public List<protein_domain> getDomainsInfo(String search,int offset,int limit) {
        List<protein_domain> domainList = ladMapper.getDomainsInfo(search,offset,limit);
        return domainList;
    }

    @Override
    public List<Sanji> getSanji(String ladId, String only) {
        return ladMapper.getSanji(ladId,only);
    }

    @Override
    public Sanji getSanjiBycode(String ladId, String code) {
        return ladMapper.getSanjiBycode(ladId,code);
    }


}
