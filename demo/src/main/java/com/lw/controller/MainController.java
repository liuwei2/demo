package com.lw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/2/21 0021.
 */
@Controller
public class MainController {
@RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView indexs(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index");
    modelAndView.addObject("hello", "helloworld");
    return modelAndView;
}
}
