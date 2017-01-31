/*
 * File: Sum Of The Digits
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 1
 * Due Date: January 31, 2017
 * Version: 1.8
 * This file is able to determine the Sum Of the Digits
 */
import java.util.Scanner;

public class SumOfInteger {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x;
    System.out.print("Please provide a integer that is postitve: ");
    x = in.nextInt();
    if (x <= 0)
    System.out.println("Oops!  I see a negative integer was entered,"
            + " please try again, as they are invalid");
    else {
    int sum = 0;
    while (x != 0) {
    sum += x % 10;
    x /= 10;
    }
     System.out.println("Sum of digits: " + sum);
    }
  } 
}
