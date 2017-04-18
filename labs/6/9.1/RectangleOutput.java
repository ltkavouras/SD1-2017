/*
* File: RectangleOutput.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 6
* Due Date: April 18th, 2017
* Version 1.8
* This file outputs the information regarding two rectangles, one with 
* a width of 4 and a height of 40.  The other with a width of 3.5, and a
* height of 35.9
*/
public class RectangleOutput {
  public static void main(String[] args) {
  
  RectangleAssets[] rectangles = new RectangleAssets[2];
  rectangles[0] = new RectangleAssets(4,40);
  rectangles[1] = new RectangleAssets(3.5, 35.9);

  for (int i = 0; i < 2; i++) {
    System.out.println("Rectangle " + (i+1) + ":");
    System.out.println("---------");
    System.out.print("Area = " + rectangles[i].getArea() + "\n");
    System.out.println("Perimeter = " + rectangles[i].getPerimeter() + "\n");
  A
  }

  }
}
