/*
 * File: Grade Calculator
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 1
 * Due Date: February 7th, 2017
 * Version: 1.8
 * This program determines what your grade is based on 
 * your input
 */
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
    //Create Scanner
    Scanner input = new Scanner(System.in);
    String letterGrade;

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
    double numGrade = (midterm * 0.2  + finalGrade * 0.2 + project * 0.2 +
    homework * 0.4 );
    
    if ((numGrade <= 100) && (numGrade >= 95)) {
      letterGrade = "A";
    }else if ((numGrade < 95) && (numGrade >= 90)){
      letterGrade = "A-";
    }else if ((numGrade < 90) && (numGrade >= 87)){
      letterGrade = "B+";
    }else if ((numGrade < 87) && (numGrade >= 83)){
      letterGrade = "B";
    }else if ((numGrade < 83) && (numGrade >= 80)){
      letterGrade = "B-";
    }else if ((numGrade < 80) && (numGrade >= 77)){
      letterGrade = "C+";
    }else if ((numGrade < 77) && (numGrade >= 73)){
      letterGrade = "C";
    }else if ((numGrade < 73) && (numGrade >= 70)){
      letterGrade = "C-";
    }else if ((numGrade < 70) && (numGrade >= 65)){
      letterGrade = "D+";
    }else if ((numGrade < 65) && (numGrade >= 60)){
      letterGrade = "D";
    }else{
       letterGrade = "F";
    }
    
    System.out.println("Your Final Grade is : " + letterGrade);
    
  }  
}
