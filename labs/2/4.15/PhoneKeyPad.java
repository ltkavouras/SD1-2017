/*
* File: Phone Key Pad
* Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 2
 * Due Date: February 14th, 2017
 * Version: 1.8
 * This program allows a user to input a letter
 * and based on a typical phone key pad, the 
 * program will output a number that corresponds
 * with the entered letter.
 */
import java.util.Scanner;
import java.util.*;
public class PhoneKeyPad {
    public static int getNumber(char uppercaseLetter) {
    int letterValue = 0;
    switch (uppercaseLetter) {
      case 'A': case 'B': case 'C': letterValue = 2;
    break;
      case 'D': case 'E': case 'F': letterValue = 3;
    break;
      case 'G': case 'H': case 'I': letterValue = 4;
    break;
      case 'J': case 'K': case 'L': letterValue = 5;
    break;
      case 'M': case 'N': case 'O': letterValue = 6;
    break;
      case 'P': case 'Q': case 'R': case 'S': letterValue = 7;
    break;
      case 'T': case 'U': case 'V': letterValue = 8;
    break;
      case 'W': case 'X': case 'Y': case 'Z': letterValue = 9;
    }
    return letterValue;
    }
    public static void main(String[] args) {
    char values[] = {'A','B','C','D','E','F','G','H','I','J','K',
    'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    String stringValues = new String(values);
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Letter: ");
      String stringUserIput = in.nextLine();

      for (int x = 0; x < stringUserIput.length(); x++) {
        if (Character.isLetter(stringUserIput.charAt(x))){
          System.out.print(getNumber(Character.toUpperCase(stringUserIput
            .charAt(x))));
        }else if(stringUserIput != stringValues){
          System.out.println("Sorry that is an invalid input");
        }else {
          System.out.print(stringUserIput.charAt(x));
        }
      }
    }
}