/*
 * File: Celsius To Fahrenheit
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 1
 * Due Date: January 31, 2017
 * Version: 1.8
 * This file regards a computer program translates a Celsius value to 
 * Fahrenheit
 */
import java.util.Scanner;
public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a degree in Celsius");
    double celsius = input.nextDouble();
    
    double fahrenheit = (9.0/5) * celsius + 32;
    System.out.println(celsius + " Celsius is " + fahrenheit + 
    " in Fahrenheit");
  }
}
