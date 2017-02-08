/*
 * File: Lottery
 * Author: Louis Thomas Kavouras
 * Course: CMPT 220
 * Assignment: Lab 2
 * Due Date: February 7th, 2017
 * Version: 1.8
 * This program is a lottery game, where a
 * user must enter three digits with the intent
 * of guessing the 3 digits that are drawn
 * at random.
 */
import java.util.Scanner;
public class Lottery {
  public static void main(String[] args) {

  Integer lottery = (int)(Math.random() * 1000);
  Scanner input = new Scanner(System.in);
  String lotteryString = String.valueOf(lottery);
  Integer matches = 0;

  char lotteryChar1 = lotteryString.charAt(0);
  char lotteryChar2 = lotteryString.charAt(1);
  char lotteryChar3 = lotteryString.charAt(2);
  int lotteryDigit1 = Character.getNumericValue(lotteryChar1);
  int lotteryDigit2 = Character.getNumericValue(lotteryChar2);
  int lotteryDigit3 = Character.getNumericValue(lotteryChar3);


  //prompt the user for their input
  //System.out.println("Matches =" + matches + "Lottery is" + lottery);
  System.out.println("Enter your first digit");
  int userInput1 = input.nextInt();
  //  System.out.println("User Input 1 =" + userInput1);
  if ((userInput1 == lotteryDigit1) || (userInput1 == lotteryDigit2) || 
      (userInput1 == lotteryDigit3)) {
  	 matches++;
  }
// System.out.println("Matches =" + matches + "Lottery is" + lottery);
  System.out.println("Enter your second digit");
  int userInput2 = input.nextInt();
  if ((userInput2 == lotteryDigit1) || (userInput2 == lotteryDigit2) || 
      (userInput2 == lotteryDigit3)) {
  	 matches++;
  }
//  System.out.println("Matches =" + matches + "Lottery is" + lottery);
  System.out.println("Enter your third digit");
  int userInput3 = input.nextInt();
  if ((userInput3 == lotteryDigit1) || (userInput3 == lotteryDigit2) || 
      (userInput3 == lotteryDigit3)) {
  	 matches++;
  }

//Combine and store the users input

  String guess = userInput1 + "" + userInput2 + "" + userInput3;


//convert string to number

  int intGuess = Integer.parseInt(guess);


  System.out.println("Your guess is: " + guess);


  int outcome = 0; 

  if (intGuess == lottery) {
     outcome = 3;
  } else if (matches == 1) {
     outcome = 1;
  } else if (matches == 2) {
  	 outcome = 2;
  } else if (matches == 3) {
  	 outcome = 3;
  } else if (matches == 0) {
  	 outcome = 0;
  }
 
    
//Output the lucky numbers
  System.out.println("The lottery numbers are: "+ lottery);

//Results
  switch (outcome) {
  	case 0: 
  	  System.out.println("Sorry, there are no matches");
  	break;
  	case 1:
  	  System.out.println("There is one digit match! You win $1,000");
  	break;
  	case 2:
  	  System.out.println("There is a two digit match! You win $3,000");
  	break;
  	case 3:
  	  System.out.println("There is an exact match!  You win $10,000");
    break;
    }
  }
}