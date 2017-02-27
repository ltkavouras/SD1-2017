/* 
* File: ConversionTable.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 4
* Due Date: February 27th, 2017
* Version: 1.8
* This program creates a table that displays the various conversions between
* Celsius and Fahrenheit
* 
*/
public class ConversionTable {
  public static void main(String[] args) {
 
  //Declaration of any strings and variables
  String headerDivider = "---------------------------------------------------"+
     "-------";       

  // Output the header for the table
  System.out.printf("%-15s%-15s|    %-15s%-15s\n","Celsius","Fahrenheit",
    "Fahrenheit","Celsius");
  
  // Print out a dashed line divider to seperate the header from the data set
  System.out.println(headerDivider);
  
  for (int c = 40, f = 120  ; c >=31; c--, f-=10) {

  System.out.printf("%-15.1f%-15.1f|    %-15.1f%-15.2f\n",(float)c,
    celsiusToFahrenheit(c),(float)f, fahrenheitToCelsius(f));
 
  }

 }		  
  
  public static double celsiusToFahrenheit(double celsius) {
  
    return (9.0 / 5) * celsius + 32;
  
  }
  
  public static double fahrenheitToCelsius(double fahrenheit) {
  
    return (5.0 / 9) * (fahrenheit - 32);
  
  }

}
