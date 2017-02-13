/*
* File: Random Vehicle Plate Number
* Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 2
 * Due Date: February 14th, 2017
 * Version: 1.8
 * This program allows an user to enter an ACII code,
 * and the application will output a symbol/letter
 */
import java.util.Scanner;
public class DisplayASCII {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //prompt user for ASCII code
    System.out.println("Please enter an ACII code between 0 - 127");
    int aSCII = input.nextInt();

    char displayCharacter = (char) aSCII;

    System.out.println("The character for the ASCII code is: " + displayCharacter);
  }
}