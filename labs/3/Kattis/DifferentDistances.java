/*
* File: DifferentDistances.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: February 20th, 2017
* Version 1.8
* This program computes the p-norm distnace between pairs of points for a given
* value of p.
*/
import java.util.*;
public class DifferentDistances {
  public static void main(String[] args) {

  // Declare variables
    double p = 0;
    double xOne = 0;
    double xTwo = 0;
    double yOne = 0;
    double yTwo = 0;
 
  /* ----------------------------------------------------- */
  
  // Create Scanner
  Scanner userInput = new Scanner(System.in);
 
  //while loop
  while (true) {
    
  /* ----------------------------------------------------- */

  // Collect Information on x1
  xOne = userInput.nextDouble();

  if (xOne == 0.0)
    break;

  // Collect information on y1 
  yOne = userInput.nextDouble();

  // Collect Information on x2
  xTwo = userInput.nextDouble();

  // Collect information on y2
  yTwo = userInput.nextDouble();

  // Collect information on p
  p = userInput.nextDouble();

  /* ------------------------------------------------------ */
  
  // formula portion for x1 - x2
    double xValues = xOne - xTwo;
  
  //absolute value of x
    xValues = Math.abs(xValues);  

  // Raise x value to the power of p
    double totalX = Math.pow(xValues,p);

  /* -------------------------------------------------------- */
  

  // Formula portion for y1 - y2
  double yValues = yOne - yTwo;

  // absolute value of y
    yValues = Math.abs(yValues);

  // Raise y value to the power of p
    double totalY = Math.pow(yValues,p);
  
  /* -------------------------------------------------------- */
  
  // Final Steps
  
    // Combine the x and y values
      double xAndY = totalX + totalY;
    
    // Calc final p value
      double finalP = 1.0 / p;

    // Raise the total of x and y to the power of 1 / p
      double finalTotal = Math.pow(xAndY,finalP);

    //Print out the result
    System.out.println(finalTotal);
   }
  }
}  
