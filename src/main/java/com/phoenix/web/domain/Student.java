package com.phoenix.web.domain;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
  private int id;
  private String lastName;
  private String firstName;
  private String secondName;
  private Date birthday;

  @Id
  @Column(name = "id", nullable = false, insertable = true, updatable = true)
  public int getId() {
    return id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "last_name", nullable = false, insertable = true, updatable = true, length = 100)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  @Basic
  @Column(name = "first_name", nullable = false, insertable = true, updatable = true, length = 100)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  @Basic
  @Column(name = "second_name", nullable = false, insertable = true, updatable = true, length = 100)
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(final String secondName) {
    this.secondName = secondName;
  }

  @Basic
  @Column(name = "birthday", nullable = false, insertable = true, updatable = true)
  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(final Date birthday) {
    this.birthday = birthday;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
    result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;

    if (id != student.id) return false;
    if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
    if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
    if (secondName != null ? !secondName.equals(student.secondName) : student.secondName != null) return false;
    if (birthday != null ? !birthday.equals(student.birthday) : student.birthday != null) return false;

    return true;
  }
}
