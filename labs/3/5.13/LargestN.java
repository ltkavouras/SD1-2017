/*
* File: LargestN.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: February 20th, 2017
* Version 1.8
* This program is used to find the largest integer n
* such that the n3 is less than 12,000.
*/

public class LargestN {
  public static void main(String[] args) {
    
    int n = 0;

    while (Math.pow(n,3) < 12000) {
      n++;
    }    
      n--;
    
  //Print out the value of n
    System.out.println("The largest integer n is = " + n);
  
  //print out the value of (n^3)
    System.out.println("n^3 is = " + Math.pow(n,3));
  
  //Compare (n^3) to 12,000
    System.out.println(Math.pow(n,3) + " < 12000.0");

  }
}
