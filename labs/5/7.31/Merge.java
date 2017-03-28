/*
* File: Merge.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 5
* Due Date: March 28th, 2017
* Version 1.8
* This program merges to arrays of numbers, and prints the combined arrays
*/

import java.util.*; 
public class Merge {
  public static void main(String[] args) {
  //Create Scanner
  Scanner userInput = new Scanner(System.in);
  
  //Prompts the user to enter List 1
  System.out.print("Enter list1:");
  int[] list1 = new int[userInput.nextInt()];
  for (int i = 0; i < list1.length; i++) {
   list1[i] = userInput.nextInt();
  }
  //Prompts the user to enter List 2
  System.out.print("Enter list2:");
  int[] list2 = new int[userInput.nextInt()];
  for (int i = 0; i < list2.length; i++) {
   list2[i] = userInput.nextInt();
  }
 
  int[] mergedList = merge(list1, list2);
 
  System.out.print("The merged list is ");
 
  for (int i = 0; i < mergedList.length; i++) {
   System.out.print(mergedList[i]+ " ");
  }
 
 }
 
 public static int[] merge(int[] list1, int[] list2) {
  int[] mergedList = new int[list1.length + list2.length];
 
  int j = 0, k = 0;
  for (int i = 0; i < mergedList.length; i++) {
   if (k < list2.length&&list1[j] > list2[k] ) {
    mergedList[i] = list2[k];
    k++;
   } else if (j < list1.length) {
    mergedList[i] = list1[j];
    j++;
   }
 
  }
 
  return mergedList;
 
 }
 
}
