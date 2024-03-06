package com.Mars.study.controller;


import com.Mars.study.HomeDto;
import com.Mars.study.NasaResponse;
import com.Mars.study.repository.PreferenceRepository;
import com.Mars.study.service.NasaMarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import java.lang.reflect.InvocationTargetException;

@Controller
public class HomeController {


    @Autowired
    private NasaMarsService service;


    @GetMapping("/")
    public String HomeView(ModelMap modelMap, HomeDto homeDto) throws InvocationTargetException, IllegalAccessException {

        if (StringUtils.isEmpty(homeDto.getMarsApiRoverData())) {
            homeDto.setMarsApiRoverData("Opportunity");
        }
        if (homeDto.getMarsSol() == null) {
            homeDto.setMarsSol(1);
        }
        NasaResponse roverData = service.getRoverData(homeDto);
        modelMap.put("roverData", roverData);
        modelMap.put("homeDto", homeDto);
        modelMap.put("validCameras", service.getValidCameras().get(homeDto.getMarsApiRoverData()));
        return "index";
    }


    @PostMapping("/")
    public String postHomeView(HomeDto homeDto) {

        service.save(homeDto);
        System.out.println(homeDto);
        return "redirect:/";

    }

}
