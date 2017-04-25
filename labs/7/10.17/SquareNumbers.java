/*
* File: SquareNumbers.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 7
* Due Date: April 25th, 2017
* Version 1.8
* This program calcuates and displays the sqauared value of 
* big numbers
*/
import java.util.*;
import java.math.BigDecimal;

public class SquareNumbers {

  public static void main(String[] args) {
  BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
  long initiate = (long) Math.sqrt(Long.MAX_VALUE);
  BigDecimal n = new BigDecimal(initiate);
  int count = 0;

  while (count < 10) {
    BigDecimal squared = n.multiply(n);
    if (squared.compareTo(longMaxValue) > 0) {
      count++;
      System.out.println(count+": " + n + " squared = " + squared);
    }
    n = n.add(BigDecimal.ONE);
  }


  }
}
