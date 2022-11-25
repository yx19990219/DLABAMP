package com.shawn.lad.controller;


import com.alibaba.fastjson.JSON;
import com.shawn.lad.domain.*;
import com.shawn.lad.service.LadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class LadController {

    @Autowired
    LadService ladService;

    @GetMapping("/lad")
    public Object lad(){
        List<Lad> ladList = ladService.getallinformation();
        return ladList;
    }

    @GetMapping("/getsanji")
    public List<Sanji> getSanji(@RequestParam String ladId,@RequestParam String only){
        List<Sanji> sanjiList = ladService.getSanji(ladId,only);
        return sanjiList;
    }

    @GetMapping("/getsanjionly")
    public Sanji getsanjionly(@RequestParam String ladId,@RequestParam String code){
        return ladService.getSanjiBycode(ladId,code);
    }

    @GetMapping("/lad/getDomain")
    public protein_domain_list getDomain(@RequestParam(value = "search",required = false,defaultValue = "") String search, @RequestParam("offset") int offset, @RequestParam("limit") int limit){
        List<protein_domain> domainList = ladService.getDomainsInfo(search,offset,limit);
        return new protein_domain_list(domainList,1933);
    }

//    @GetMapping("/addAllES")
//    public String addAllES() throws IOException {
//        ladService.addAllDataEs();
//        return "成功";
//    }


    @GetMapping("/lad_submit")
    public Object ladsubmit(){
        List<submit> submitList = ladService.getallsubmitinformation();
        return submitList;
    }

    @PostMapping("/search")
    public Object getsearchlist(@RequestBody SearchInfo searchInfo) {
        List<Lad> searchList = ladService.searchinformation(searchInfo);
        return searchList;
    }


    @PostMapping("/submit")
    public String submitInformation(@RequestBody String submitForm){
//        System.out.println(submitForm);
        Submit_LAD submit_lad = JSON.parseObject(submitForm, Submit_LAD.class);

        submit submit_final = new submit();
        submit_final.setName(submit_lad.getName());
        submit_final.setSource(submit_lad.getSource());
        submit_final.setActivity(submit_lad.getActivity());
        submit_final.setSequence(submit_lad.getSequence());
        submit_final.setPersonname(submit_lad.getPersonname());
        submit_final.setEmail(submit_lad.getEmail());
        List<domains> domains = submit_lad.getDomains();
        for (com.shawn.lad.domain.domains domain : domains) {
            if (domain.getRegion().equals("Sequence_Length"))
                submit_final.setSequence_Length(domain.getValue());
            if (domain.getRegion().equals("Protein_existence"))
                submit_final.setProtein_existence(domain.getValue());
            if (domain.getRegion().equals("Comments"))
                submit_final.setComments(domain.getValue());
            if (domain.getRegion().equals("Target_Organism"))
                submit_final.setTarget_Organism(domain.getValue());
            if (domain.getRegion().equals("Reference"))
                submit_final.setReference(domain.getValue());
            if (domain.getRegion().equals("Author"))
                submit_final.setAuthor(domain.getValue());
            if (domain.getRegion().equals("Title"))
                submit_final.setTitle(domain.getValue());
            if (domain.getRegion().equals("Pubmed_ID"))
                submit_final.setPubmed_ID(domain.getValue());
        }
        if ("".equals(submit_final.getSource()) || submit_final.getSource() == null){
            submit_final.setSource("UNKNOWN");
        }
        if ("".equals(submit_final.getActivity()) || submit_final.getActivity() == null){
            submit_final.setActivity("UNKNOWN");
        }
        if ("".equals(submit_final.getPersonname()) || submit_final.getPersonname() == null){
            submit_final.setPersonname("UNKNOWN");
        }
        if ("".equals(submit_final.getEmail()) || submit_final.getEmail() == null){
            submit_final.setEmail("UNKNOWN");
        }
        if (!"".equals(submit_final.getSequence()) && submit_final.getSequence() != null){
            submit_final.setSequence_Length(String.valueOf(submit_final.getSequence().length()));
        }
        if ("".equals(submit_final.getProtein_existence()) || submit_final.getProtein_existence() == null){
            submit_final.setProtein_existence("UNKNOWN");
        }
        if ("".equals(submit_final.getComments()) || submit_final.getComments() == null){
            submit_final.setComments("UNKNOWN");
        }
        if ("".equals(submit_final.getTarget_Organism()) || submit_final.getTarget_Organism() == null){
            submit_final.setTarget_Organism("UNKNOWN");
        }
        if ("".equals(submit_final.getReference()) || submit_final.getReference() == null){
            submit_final.setReference("UNKNOWN");
        }
        if ("".equals(submit_final.getAuthor()) || submit_final.getAuthor() == null){
            submit_final.setAuthor("UNKNOWN");
        }
        if ("".equals(submit_final.getTitle()) || submit_final.getTitle() == null){
            submit_final.setTitle("UNKNOWN");
        }
        if ("".equals(submit_final.getPubmed_ID()) || submit_final.getPubmed_ID() == null){
            submit_final.setPubmed_ID("UNKNOWN");
        }
        ladService.insertSubmit(submit_final);
        return "成功";
    }
}
