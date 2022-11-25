package com.shawn.lad.controller;

import com.alibaba.fastjson.JSONObject;
import com.shawn.lad.domain.Lad;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
public class indexController {

    @RequestMapping( "/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/download")
    public void downloadFile(@RequestBody String table, HttpServletResponse response) {

        List<Lad> parse = new ArrayList<Lad>();
        List<String> Fasta = new ArrayList<>();
        parse = JSONObject.parseArray(table,Lad.class);
        for (Lad lad : parse) {
            Fasta.add('>' + lad.getLad_ID());
            Fasta.add(lad.getSequence());
        }
//        System.out.println(Fasta);
        exportText(response,Fasta);
    }
    public void exportText(HttpServletResponse response,List<String> ladFasta){
        response.setContentType("text/plain");// 一下两行关键的设置
        response.addHeader("Content-Disposition","attachment;filename=Lad.fasta");
        BufferedOutputStream buff = null;
        StringBuilder write = new StringBuilder();
        String enter = "\r\n";
        ServletOutputStream outSTr = null;
        try {
            outSTr = response.getOutputStream();
            buff = new BufferedOutputStream(outSTr);
            for (int i = 0; i < ladFasta.size(); i++) {
                write.append(enter);
                write.append(ladFasta.get(i));
                if((i - 1) % 2 == 0 && i != 0){
                    write.append(enter);
                }
            }
            buff.write(write.toString().getBytes("UTF-8"));
            buff.flush();
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }// 建立
    }
}
