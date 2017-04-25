/*
* File: QueueOutput.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 7
* Due Date: April 25th, 2017
* Version 1.8
* This program adds 20 numbers from 1 - 20 into a queue and displays them
*/
public class QueueOutput {
  public static void main(String[] args) {
  Queue queue = new Queue();
  // inserting 20 numbers into queue
  for (int i = 1; i < 21; i++) {
    queue.enqueue(i);
  }

   // displaying 20 numbers first in first out basis
   for (int i = 0; i < 20; i++) {
   System.out.printf("%2d ", queue.dequeue());
   //if ((i + 1) % 5 == 0) System.out.printf("\n");
   }
  }
}
