/* 
* File: Convolution.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Project 1
* Due Date: March 28th, 2017
* Version 1.8
* This program takes in user input and stores it in arrays.  From there
* the program multiplies and adds the numbers together, then shifts the 
* bottom row / array.
*/

import java.util.*;
public class Convolution { 
  public static void main(String[] args) {
  
  // Create scanner
  Scanner input = new Scanner(System.in);
  
  // Declaration of Variables
  int size1 = 0;
  int size2 = 0;
  
  /* ------------ Definition of array Size ------------------ */  
  System.out.println("Enter the size for the first vector array: ");
  size1 = input.nextInt();

  System.out.println("Enter the size for the second vector array: ");
  size2 = input.nextInt();
   
  double[] vFirstData = new double[size1];
  double[] vSecondData = new double[size2];
  
  System.out.println("The size for the first vector data set is: " +  size1);
  System.out.println();
  System.out.println("The size for the second vector data set is: " + size2);
  
  /* -------------- vFirst data -------------- */ 
  System.out.print("Enter the first vector set: ");
  for (int f = 0; f < 3; f++) {
   vFirstData[f] = input.nextInt();
  }
  System.out.println();
  /* ------------- vSecond Data -------------- */
  System.out.print("Enter the second vector set: ");
  for (int x = 0; x < 3; x++) {
   vSecondData[x] = input.nextInt();
  }
  convolveVectors(vFirstData, vSecondData);
  }
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
  double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
  for(int idx = 0; idx < vResult.length; idx++) {
    for (int shift = 0; shift < vSecond.length; shift++){
    try {
      vResult[idx] += vFirst[idx-shift] * vSecond[shift];
    } catch (IndexOutOfBoundsException e) {
    
    }
    }
  }
  for (int i = 0; i < vResult.length; i++) {
    System.out.print(Math.round(vResult[i])+" ");
  }
   return vResult; 
  }
}
