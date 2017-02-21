/*
* File: CountAndAverage.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: February 20th, 2017
* Version 1.8
* This program reads an unspceified number of integers and determines
* how many are positive and negative.  It also computes the total 
* and average of the input.  The program will terminate when 0 is 
* entered.
*/
import java.util.*;
public class CountAndAverage {
  public static void main(String[] args){
  
  //Create Scanner
  Scanner userInput = new Scanner(System.in);
  
  //Declare Variables
  int x;
  float count = 0;
  int positiveIntegers = 0;
  int negativeIntegers = 0;
  float sumOfInts = 0;
  float average;
   do {
        System.out.println("The input ends if it is 0, Enter an integer: ");
        x = userInput.nextInt();
        
        sumOfInts += x;
    
        if (x > 0) {
          positiveIntegers++;
        } else if (x < 0){
          negativeIntegers++;
        }
   } while (x != 0);

   count = positiveIntegers + negativeIntegers;
 /*
 if (userInput = 0){
     System.out.println("No numbers are entered, except for 0");
  }
*/
  // Formula for finding the average 
  average = sumOfInts / count;
  // Result for Postive
  System.out.println("The number of positives is: " + positiveIntegers);

  // Result for Negative
  System.out.println("The number of negatives is: " + negativeIntegers);

  // Output of the Total
  System.out.println("The total is: " + sumOfInts);

  // Average Output
  System.out.println("The average is: " + average);

       
  }
}
