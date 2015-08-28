package com.phoenix.web.service;

import java.util.List;

import com.phoenix.web.domain.Student;

/**
 * Created by vvygulyarniy on 28.08.2015.
 */
public interface SchoolInfoService {
  int getStudentsCount();
  String getSchoolName();

  List<Student> getStudentList();
}
