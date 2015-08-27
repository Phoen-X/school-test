package com.phoenix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FirstTest {
  @Test
  public void testFails() {
    assertThat(true, is(false));
  }
}
