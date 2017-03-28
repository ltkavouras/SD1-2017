
/*
* File: SeelctionSort.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 5
* Due Date: March 28th, 2017
* Version 1.8
* This program repeatedly finds the smallest number in the current
* array and swaps it with the first. Rewrite this program by finding the largest 
* numberand swapping it with the last.
*/
import java.util.*;
public class SelectionSort {
  //  Declaration of Global Variables
  static int x = 0;
//  static double holder;
//  static double max;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10]; // Create an array of length 10
    // Prompt the user to enter ten numbers
    System.out.print("Enter ten numbers: ");
    for (x = 0; x < numbers.length ; x++)
    numbers[x] = input.nextDouble();

    // Invoke selectionSort
    selectionSort(numbers);
    
    // Display the sorted numbers
    for (double e: numbers) 
    System.out.print(e + " ");
    System.out.println();
  }

  public static void selectionSort(double[] list) {
    for (x = list.length - 1; x >= 0; x--) {
    // Find the maximum in the list[x+1...list.length]
    double currentMax = list[x];
    int currentMaxIndex = x;
    for (int j = x - 1; j >= 0; j--) {
      if (currentMax < list[j]) {
        currentMax = list[j];
        currentMaxIndex = j;
      }
    }		
    // Swap list[i] with list[currentMax] if necessary
    if (currentMaxIndex != x) {
    list[currentMaxIndex] = list[x];
    list[x] = currentMax;
    }
    }
  }
}
