/*
 * File: Find Number Of Days
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 2
 * Due Date: February 7th, 2017
 * Version: 1.8
 * This program indicates the number of days
 * per month on a given year
 */
import java.util.Scanner;
public class FindNumberOfDays {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int month;
      int year;
      boolean annualLeap;

      System.out.print("Enter the numerical value of the desired month: ");
      month = s.nextInt();
  
      System.out.print("Enter the desired year: ");
      year = s.nextInt();
  
      annualLeap = (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0);
  
    if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || 
       month == 10 || month == 12) {
    if(month == 1) {
        System.out.print("The month January of " + year + " has 31 days.");
      } else if(month == 3) {
        System.out.print("The month March of " + year + " has 31 days.");
      } else if(month == 5) {
        System.out.print("The month May of " + year + " has 31 days.");
      } else if(month == 7) {
        System.out.print("The month July of " + year + " has 31 days.");
      } else if(month == 8) {
        System.out.print("The month August of " + year + " has 31 days.");
      } else if(month == 10) {
        System.out.print("The month October of " + year + " has 31 days.");
      } else if(month == 12) {
        System.out.print("The month December of " + year + " has 31 days.");
      }


      } else if(month == 4 || month == 6 || month == 9 || month == 11) {
    if(month == 4) {
        System.out.print("The month April of " + year + " has 30 days.");
      } else if(month == 6) {
        System.out.print("The month June of " + year + " has 30 days.");
      } else if(month == 9) {
        System.out.print("The month September of " + year + " has 30 days.");
      } else if(month == 11) {
        System.out.print("The month November  of " + year + " has 30 days.");
      }
      } else {
    if(annualLeap) {
       System.out.print("The month February of " + year + " has 29 days.");
    } else {
       System.out.print("The month February of" + year + " has 28 days.");
    }
  }


 }
}
