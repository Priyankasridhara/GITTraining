package com.sonata.JUnitExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAddition {
  Addition b1 = new Addition();
  int x = b1.add(20, 30);
  
  @Test
  public void teAdd() {
	 assertEquals(x, 50);  
  }
}