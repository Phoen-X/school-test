package com.phoenix.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.phoenix.web.service.StudentsRepository;

@Controller
@RequestMapping("/students")
public class StudentController {
  @Autowired
  private StudentsRepository repo;


  @RequestMapping(method = RequestMethod.GET)
  public String getAllStudents(Model model) {
    model.addAttribute("studentList", repo.findAll());
    return "student_list";
  }
}
