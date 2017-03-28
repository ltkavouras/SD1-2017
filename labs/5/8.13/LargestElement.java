/* 
* File: LargestElement.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 5
* Due Date: March 28th, 2017
* Version 1.8
* This program prompts the user to enter a twodimensional
* array and displays the location of the largest element in the array
*/  

import java.util.*;
public class LargestElement {
  public static void main(String[] args) {
  
  //Create Scanner
  Scanner userInput = new Scanner(System.in);

  System.out.printf("Enter the number of rows and columns of the array: ");
  int row = userInput.nextInt();
  int column = userInput.nextInt();
  double[][] m = new double[row][column];

  //Prompt the user to enter the array below
  System.out.println("Enter the array below: ");
  System.out.println("i.e. 23.5 35 ... (enter) then enter the next list");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                m[r][c] = userInput.nextDouble();


 int[] location = locateLargest(m);
 System.out.printf("The location of the largest element is at"+
 "(%d, %d)\n", location[0], location[1]);
 }

 public static int[] locateLargest(double[][] a) {

 int[] location = new int[] { 0, 0 };
 double largest = a[0][0];
 for (int r = 0; r < a.length; r++) {
   for (int c = 0; c < a[r].length; c++) {
     if (a[r][c] > largest) {
     location[0] = r; // row
     location[1] = c; // column
     largest = a[r][c];
     }
   }
 }

 return location;
    }
}
