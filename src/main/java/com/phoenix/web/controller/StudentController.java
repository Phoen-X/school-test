package com.phoenix.web.controller;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.phoenix.web.service.SchoolInfoService;

/**
 * Created by vvygulyarniy on 28.08.2015.
 */
@Controller
@RequestMapping("/students")
public class StudentController {
  @Autowired
  private SchoolInfoService schoolInfo;


  @RequestMapping(method = RequestMethod.GET)
  public String getAllStudents(Model model) {
    model.addAttribute("studentList", schoolInfo.getStudentList());
    return "student_list";
  }
}
