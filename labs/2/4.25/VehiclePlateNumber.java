/*
* File: Random Vehicle Plate Number
* Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 2
 * Due Date: February 14th, 2017
 * Version: 1.8
 * This program randomly generates Vehicle Plate Numbers
 */
import java.util.Random;

public class VehiclePlateNumber {
  public static void main(String[] args) {
   
    //numberGenerator x = new numberGenerator();
    Random rand = new Random(); // Create a random generator
    char alpha[] = {
    	'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };
    int integer1 =  rand.nextInt(10);
    int integer2 = rand.nextInt(10);
    int integer3 = rand.nextInt(10);
    int integer4 = rand.nextInt(10);

    char character1 = alpha[rand.nextInt(26)];
    char character2 = alpha[rand.nextInt(26)];
    char character3 = alpha[rand.nextInt(26)];

    //System.out.println(character1 + "," + character2 + "," + character3);
   
   // System.out.println(integer1 + "," + integer2 + "," + integer3 + "," + integer4);
    System.out.println("The vehicle plate number is: " + character1 + "" + character2  + "" + character3 + "-" + integer1 + ""  + integer2 + "" + integer3 + "" +integer4);
  }
}