/*
* File: SmallestElement.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 4
* Due Date: February 27th, 2017
* Version 1.8
* This program takes in numbers and outputs the lowest
* entered number
*/
import java.util.Scanner;

public class SmallestElement {
  
  // Declaring the variables for both methods
  static int amtCount= 10;
  static int i = 0;
  static double[] n = new double[amtCount];
  
  public static void main(String[] args) {

  // Create Scanner
  Scanner input = new Scanner(System.in);

  System.out.print("Enter " + amtCount + " numbers: ");
  for (i = 0; i < n.length; i++) n[i] = input.nextDouble();
  
    System.out.println("The minimum number is: " + min(n));
    
   }

  public static double min(double[] array) {

  double min = array[0];
  for (i = 0; i < array.length; i++) {
  
    if (min > array[i]) min = array[i];
   
  }
   
    return min;

  }
}
