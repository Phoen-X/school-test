package com.phoenix.web.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SchoolInfoServiceImplTest {

  private final SchoolInfoServiceImpl service = new SchoolInfoServiceImpl();

  @Test
  public void testSchoolName() throws Exception {
    assertThat(service.getSchoolName(), equalTo("TBSchool, the best school"));
  }

  @Test
  public void testStudentsCount() throws Exception {
    SchoolInfoServiceImpl service = new SchoolInfoServiceImpl();
    assertThat(service.getStudentsCount(), is(100));

  }
}
