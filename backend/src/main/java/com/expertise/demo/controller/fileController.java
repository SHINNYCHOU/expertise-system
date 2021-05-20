package com.expertise.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.expertise.demo.entity.Expert;
import com.expertise.demo.service.ExpertService;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:8080","null"},allowCredentials = "true")
@RestController
@RequestMapping(value="/file",method = {RequestMethod.GET, RequestMethod.PUT,RequestMethod.DELETE, RequestMethod.POST})
public class fileController {
    @Autowired
    private ExpertService expertservice;

    @RequestMapping("/downloadexcel")
    public void getExcel(HttpServletResponse response) throws IllegalAccessException, IOException,
            InstantiationException {
        List<Expert> list = expertservice.findAll();
        this.download(response,Expert.class,list);
    }

    public static void download(HttpServletResponse response, Class t, List list) throws IOException, IllegalAccessException,InstantiationException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=demo.xlsx");
        EasyExcel.write(response.getOutputStream(), t).sheet("专家列表").doWrite(list);
    }



}
