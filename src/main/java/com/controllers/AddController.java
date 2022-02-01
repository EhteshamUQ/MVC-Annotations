package com.controllers;

import com.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
@RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int t1 , @RequestParam("t2") int t2){
    ModelAndView modelAndView = new ModelAndView();
    int sum = new AddService().add(t1 , t2);
    modelAndView.setViewName("display");
    modelAndView.addObject("sum" , sum);
    return modelAndView;
}
}
