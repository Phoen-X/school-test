package com.phoenix.web.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phoenix.web.domain.Student;

@Service
public class SchoolInfoServiceImpl implements SchoolInfoService {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public int getStudentsCount() {
    return 100;
  }

  @Override
  public String getSchoolName() {
    return "TBSchool, the best school";
  }

  @Override
  public List<Student> getStudentList() {
    try(Session session = sessionFactory.openSession()) {
      return session.createQuery("select s from Student s").list();
    }
  }
}
