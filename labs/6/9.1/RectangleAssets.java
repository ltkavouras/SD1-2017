/*
* File: RectangleAssets.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 6
* Due Date: April 18th, 2017
* Version 1.8
* This file contains all of the variables and necessities for the 
* output file to display the data regarding the two rectangles.
*/
public class RectangleAsets {

  private double width;
  private double height;

  public RectangleAssets() {
    this.width = 1.0;
    this.height = 1.0;
  }
  public RectangleAssets(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /* Return Area */
  public double getArea() {
    return this.width * this.height;
  }
  /* Return Perimeter */
  public double getPerimeter() {
    return this.width * 2 + this.height * 2;
  }
}
