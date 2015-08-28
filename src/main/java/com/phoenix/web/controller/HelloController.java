package com.phoenix.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.phoenix.web.service.SchoolInfoService;

@Controller
@RequestMapping(value = "/")
public class HelloController {
  @Autowired
  private SchoolInfoService schoolInfo;

  @RequestMapping(method = RequestMethod.GET)
  public ModelAndView hello() {
    ModelAndView model = new ModelAndView();
    model.addObject("schoolName", schoolInfo.getSchoolName());
    model.addObject("studentsCount", schoolInfo.getStudentsCount());
    model.setViewName("index");
    return model;
  }
}
