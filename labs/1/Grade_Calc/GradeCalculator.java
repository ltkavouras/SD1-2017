/*
 * File: Grade Calculator
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 1
 * Due Date: January 31, 2017
 * Version: 1.8
 * This file regards a computer program that helps determine what your grade is
 */
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
    //Create Scanner
    Scanner input = new Scanner(System.in);
    
    //Determine Midterm Exam Grade
    System.out.println("Enter your Midterm Grade as  Percentage: ");
    double midterm = input.nextDouble();
        
    //Determine Final Exam Grade
    System.out.println("Enter your Final Grade as a Percentage");
    double finalGrade = input.nextDouble();
    
    //Determine Project Grade
    System.out.println("Enter your Project Grades as a percentage");
    double project = input.nextDouble();
    
    //Determine Homework and Labs
    System.out.println("Enter your Homework and Labs Grades as a percentage");
    double homework = input.nextDouble();
    
    //Calculation
    System.out.println("Your Final Grade is : " + (midterm * 0.2  + 
            finalGrade * 0.2 + project * 0.2 + homework * 0.2 ) + "%");
    
  }  
}
