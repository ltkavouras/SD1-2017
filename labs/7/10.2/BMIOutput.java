/*
* File: Location.java
* Author: Louis Thomas Kavouras
* Course: CMPT 220
* Assignment: Lab 6
* Due Date: April 18th, 2017
* Version 1.8
* This program  is an addition to the BMI example from the textbook
*/

public class BMIOutput {
  public static void main(String[] args) {
  
  BMI x = new BMI("Louis" +" Age:"+19,175,5,7);
  
  System.out.printf("Name: %s Weight:%d Feet: %.2f Inches: %.2f %.2f\n", x.getName(),x.getAge(),x.getWeight(),x.getFeet(),x.getInches());
  }
}
