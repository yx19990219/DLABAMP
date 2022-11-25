package com.shawn.lad.Mapper;


import com.shawn.lad.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LadMapper {
    List<Lad> getallinformation();
    List<Lad> searchinformation(@Param("search") SearchInfo searchInfo);
    List<Lad> searchinputlist(@Param("searchlist") SearchInfo searchInfo);
    void insertSubmit(@Param("submit") submit submit_final);
    List<submit> getallsubmitinformation();

    List<protein_domain> getDomainsInfo(@Param("search") String search,@Param("offset") int offset,@Param("limit") int limit);

    List<Sanji> getSanji(@Param("ladId") String ladId,@Param("only") String only);

    Sanji getSanjiBycode(@Param("ladId") String ladId,@Param("code") String code);
}
