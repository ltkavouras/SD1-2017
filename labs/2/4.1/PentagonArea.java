/*
 * File: Pentagon Area
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 2
 * Due Date: February 7th, 2017
 * Version: 1.8
 * This program determines the area of a pentagon
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class PentagonArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //collect information regarding the side of the pentagon
    System.out.println("Please enter the length of the center of a pentagon"
    + " to a vertex");
    double r = input.nextDouble();
    double PI = 3.14159;

    //calculate the value of s
    double s = 2 * r * Math.sin(PI/5);

    //calculate the top half of the formula
    double top = 5 * Math.pow(s,2);

    //calculate the bottom half
    double bottom = 4 *  Math.tan(PI/5);

    //merging the top and the bottom
    double area = (top / bottom);

    //Indication of answer 
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("The area of the pentagon is: " + df.format(area));
  }
}
