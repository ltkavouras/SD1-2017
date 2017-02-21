/*
* File: PalindromInteger.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: February 20th, 2017
* Version 1.8
* This program returns the reversal of an integer.
*/import java.util.*;
public class PalindromeInteger {
  public static void main(String[] args) {
  
    // Create Scanner
    Scanner userInput = new Scanner(System.in);
  
    // Prompt the user to enter an integer
    System.out.print("Enter an integer:");
    int number = userInput.nextInt();
 
    if (isPalindrome(number)) {
      System.out.print(number + " is a palindrome");
    } else {
      System.out.print(number + " is not a palindrome");
    }
}
  public static int reverse(int number) {
    int reverse = 0;
    int digit;
    
    do {
      digit = number % 10;
      reverse = reverse * 10 + digit;
      number /= 10;
    } while (number != 0);
      return reverse;
  }
  public static boolean isPalindrome (int number) {
    return number == reverse(number);
   }
}
