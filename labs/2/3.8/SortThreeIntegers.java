/*
 * File: Sort Three Integers
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 2
 * Due Date: February 7th, 2017
 * Version: 1.8
 * This program sorts integers in increasing order
 */
import java.util.Scanner;
public class SortThreeIntegers {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
// Prompt the user to enter three numbers
    System.out.print("Enter three integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

//check to see if the first number entered is greater than the second number
    if (number1 > number2) {
      int programMemory = number1;
      number1 = number2;
      number2 = programMemory;
    }
//check to see if the second number entered is greater than the third number
    if (number2 > number3) {
      int programMemory = number2;
      number2 = number3;
      number3 = programMemory;
    }
//check to see if the first number entered is greater than the second number
    if (number1 > number2) {
      int programMemory = number1;
      number1 = number2;
      number2 = programMemory;
    }

    System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
  }
}