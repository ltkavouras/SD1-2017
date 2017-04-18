/*
* File: Location.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 6
* Due Date: April 18th, 2017
* Version 1.8
* This program locates the maximum value and displays the maximum number and  
* where it is located.
*/
import java.util.Scanner;
public class Location {
  public static void main(String[] args){
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
 
   Location location = locateLargest(m);
   System.out.printf("The location of the largest element is at"+
   "(%f, %d, %d)\n", location.maxValue, location.row, location.column);
 }
  public int row;
  public int column;
  public double maxValue;

  public Location(int row, int column, double maxValue) {
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  }

  public static Location locateLargest(double[][] a) {
    int row = 0;
    int column = 0;
    double max = a[row][column];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (max < a[i][j]) {
	  max = a[i][j];
	  row = i;
	  column = j;
	}
      }
    }
    return new Location(row, column, max);
  }
}
