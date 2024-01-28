package com.Mars.study.controller;


import com.Mars.study.service.NasaMarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @Autowired
    private NasaMarsService service;

    @GetMapping("/")
    public String HomeView(ModelMap modelMap) {

        String roverData = service.getRoverData();
        modelMap.put("roverData", roverData);
        return "index";
    }

}
