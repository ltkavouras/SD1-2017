/*
* File: BubbleSort.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 4
* Due Date: February 27th, 2017
* Version: 1.8
* This program accepts user input and sorts it in numerical
* order.
*/
import java.util.*;
public class BubbleSort {
  // Decarling Global variable for both methods
  static int x = 0;
  static double holder;
  static boolean movedItem;
  

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    double[] digits = new double[10]; 

    
   // Prompt the user to enter ten numbers
    System.out.print("Enter ten numbers that you need sorted: ");
    for (x = 0; x < digits.length; x++)
    digits[x] = userInput.nextDouble();

   // Call the bubble sort method
   bubbleSort(digits);
	  

    // Display the sorted numbers
    for (double n: digits) {
      System.out.print(n + " ");
    }
      System.out.println();
    }
 public static void bubbleSort(double[] list) {


    do {
    movedItem = false; 
    for (x = 0; x < list.length - 1; x++) {
    
    if (list[x] > list[x + 1]) {
      holder = list[x];
	  list[x] = list[x + 1];
      list[x + 1] = holder;
	  movedItem = true;
    }
    }
    } while (movedItem);
  }
}
