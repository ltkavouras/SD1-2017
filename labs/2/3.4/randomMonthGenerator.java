/*
 * File: Random Month Generator
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 2
 * Due Date: February 7th, 2017
 * Version: 1.8
 * This computer program prints the months at random using the integers 1 - 12
 */
public class randomMonthGenerator {
  public static void main(String[] args) {
    int randomMonthGenerator;
	
    randomMonthGenerator = (int) (Math.random() * 12) + 1;

   if(randomMonthGenerator == 1) {
     System.out.print("January");
   } else if(randomMonthGenerator == 2) {
      System.out.print("February");
   } else if(randomMonthGenerator == 3) {
      System.out.print("March");
   } else if(randomMonthGenerator == 4) {
     System.out.print("April");
   } else if(randomMonthGenerator == 5) {
     System.out.print("May");
   } else if(randomMonthGenerator == 6) {
     System.out.print("June");
   } else if(randomMonthGenerator == 7) {
     System.out.print("July");
   } else if(randomMonthGenerator == 8) {
     System.out.print("August");
   } else if(randomMonthGenerator == 9) {
     System.out.print("September");
   } else if(randomMonthGenerator == 10) {
     System.out.print("October");
   } else if(randomMonthGenerator == 11) {
     System.out.print("November");
   } else if(randomMonthGenerator == 12) {
     System.out.print("December");
   }
   

  }
}
