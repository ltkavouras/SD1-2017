/*
* File: CountLetters.java
* Author: Louis Thomas Kavouras
* Course CMPT 220
* Assignment: Lab 4
* Due Date: February 27th, 2017
* Version: 1.8
* For this an user is able to input a phrase or word, and then the program
* will output the numerical amount of letters that exist.  For instance, if the
* word entered was "mom", the output would be "3".
*/
import java.util.*;
public class CountLetters {
  public static void main(String[] args) {
  //Create Scanner
  Scanner input = new Scanner(System.in);

  //Prompt the user to enter a phrase
  System.out.println("Enter a phrase to find out how many letters exist in it");
  String string = input.nextLine();

  //Output the amount of letters within the phrase entered
  System.out.println("The amount of letters within the phrase: " +
    string + " are: " + countLetters(string));
  }

  public static int countLetters(String s) { 
  
  // Declare the variable AmountofLetters
  int AmountOfLetters = 0;
  int x =0;
    for (x = 0; x <s.length(); x++) {
      if (Character.isLetter(s.charAt(x)))
      AmountOfLetters++;
    }
    return AmountOfLetters;
  }
}
