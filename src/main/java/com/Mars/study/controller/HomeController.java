package com.Mars.study.controller;


import com.Mars.study.NasaMarsPhoto;
import com.Mars.study.NasaResponse;
import com.Mars.study.service.NasaMarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
public class HomeController {


    @Autowired
    private NasaMarsService service;

    @GetMapping("/")
    public String HomeView(ModelMap modelMap,@RequestParam(required = false) String marsApiRoverData) {

        if (StringUtils.isEmpty(marsApiRoverData)) {
            marsApiRoverData = "opportunity";
        }
        NasaResponse roverData = service.getRoverData(marsApiRoverData);
        modelMap.put("roverData", roverData);
        return "index";
    }



}
