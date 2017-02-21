/*
* File: ComputeFutureTuition.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: February 20th, 2017
* Version 1.8
* This program computes the future tutition in ten years and 
* the total cost of four years worth after the tenth year.
*/
import java.util.*;
public class ComputeFutureTuition {
  public static void main(String[] args) {
  //Decarling Variables ten and four yers
  double tenYears = 0;
  double fourYears = 0;


  for (int x = 0; x < 14; x++) { 
  
  //Declaring the variables and any values associated
  double cost = 10000.00;
  double increase = 0.05;
     cost += cost * increase;
     
     if (x == 9) {
       tenYears = cost;

     } else if (x == 10 || x == 11 || x == 12 || x == 13) {
       fourYears += cost;
     }
 }  
  
  //Display the cost for tuition in 10 years
  System.out.print("The tuition cost in ten years is: $" + tenYears +". ");

  //Display the cost for tuition in 4 years after the 10 year mark
  System.out.print("The tuition cost in four years is: $" + fourYears);
  
  }
}
