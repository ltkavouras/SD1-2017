/*
* File: SumDigitsInInteger.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: February 20th, 2017
* Version 1.8
* This program computes the sum of the digits in an 
* integer.
*/
import java.util.*;
public class SumDigitsInInteger {
  public static void main(String [] args) {
    //Create Scanner
    Scanner userInput = new Scanner(System.in);
    
    //Prompt user for an integer
    System.out.print("Please, enter an integer: ");
    long n = userInput.nextLong();

    //Print out the sum
    System.out.println("The sum is the following: " + sumDigits(n));
  }

  public static int sumDigits(long n) {
    
    int sum = 0;

    do {
      sum += n % 10;
    } while ((n = n / 10) != 0);

        return sum;
  }
}
