/*
* File: Partition.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 5
* Due Date: March 28th, 2017
* Version 1.8
* After the partition, the elements in the list are rearranged so that all the 
* elements before the pivot are less than or equal to the pivot and the elements
* after the pivot are greater than the pivot. 
*/
import java.util.*; 
public class Partition {
 public static void main(String[] args) {
  // Create Scanner
  Scanner userInput = new Scanner(System.in);
  System.out.print("Enter list:");
  int[] list1 = new int[userInput.nextInt()];
  for (int i = 0; i < list1.length; i++) {
   list1[i] = userInput.nextInt();
  }
   
  partition(list1);
   
  System.out.print("After the partition, the list is ");
   
  for (int i = 0; i < list1.length; i++) {
   System.out.print(list1[i] + " ");
  }
 
 }
  
 public static int partition(int[] list) {
  int partition = list[0];
  int partitionLocation = 0;
  int length = list.length-1;
   
  while(partitionLocation < length) {
    
   if(partition>list[partitionLocation+1]) {
    //swap partition and the next item
    list[partitionLocation] = list[partitionLocation+1];
    list[partitionLocation+1] = partition;
    partitionLocation++;
   } else {
    //move the item to the end of the list
    int temp = list[length];
    list[length]=list[partitionLocation+1];
    list[partitionLocation+1] = temp;
    length--;
       
   }
  }
   
  return partitionLocation;
  }
 }

