/*
* File: SmallestN.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: February 20th, 2017
* Version 1.8
* This program finds the smallest integer n that n2
* is greater than 12,000.
*/
public class SmallestN {
  public static void main(String[] args) {
  
  int n = 0;

  while (Math.pow(n,2) < 12000) {
    n++;
  }

  //Print out the value of n
  
    System.out.println("The value of n is: " + n);
  
  //Indicate the value of (n^2)

    System.out.println(n + "^2 = " + Math.pow(n, 2));

  //Compare the answer to 12,000
  System.out.println(Math.pow(n,2) + " > 12000.0");

  }
}
