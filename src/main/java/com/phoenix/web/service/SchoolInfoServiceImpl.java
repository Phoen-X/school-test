package com.phoenix.web.service;

import org.springframework.stereotype.Service;

/**
 * Created by vvygulyarniy on 28.08.2015.
 */
@Service
public class SchoolInfoServiceImpl implements SchoolInfoService {
  @Override
  public int getStudentsCount() {
    return 100;
  }

  @Override
  public String getSchoolName() {
    return "TBSchool, the best school";
  }
}
