/*
 * File: Gratitude Calculator
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 1
 * Due Date: January 31, 2017
 * Version: 1.8
 * This file regards a computer program that helps determine how much to tip
 * based on the subtotal amount
 */
import java.util.Scanner;
public class GratitudeCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    System.out.println("Enter the Subtotal Amount");
    double subtotal = input.nextDouble();
 
    System.out.println("Enter the Gratiuty Rate");
    double percentage = input.nextDouble();
  
    double gratTotal = (percentage * subtotal);
    double total = (gratTotal + subtotal);
    System.out.println("The gratuity is " + gratTotal + "and the total is " +
    total );
  }  
}
