package com.phoenix.web.service;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.phoenix.web.domain.Student;

/**
 * Created by vvygulyarniy on 28.08.2015.
 */
@Service
public class MySQLStudentsRepository implements StudentsRepository {
  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public List<Student> findAll() {
    try (Session session = sessionFactory.openSession()) {
      return session.getNamedQuery("Student.findAll").list();
    }
  }

  @Override
  public Student findById(final long id) {
    try (Session session = sessionFactory.openSession()) {
      return session.byId(Student.class).getReference(id);
    }
  }

  @Override
  public void save(final Student student) {
    try(Session session = sessionFactory.openSession()) {
      session.setFlushMode(FlushMode.COMMIT);
      Transaction transaction = session.beginTransaction();
      session.merge(student);
      transaction.commit();

    }
  }
}
