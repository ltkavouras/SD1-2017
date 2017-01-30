package pkg2_5;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the subtotal Amount");
    double subtotal = input.nextDouble();
   
    System.out.println("Enter the Gratiuty Rate");
    double percentage = input.nextDouble();
    
    double gratTotal = (percentage * subtotal);
    double total = (gratTotal + subtotal);
    System.out.println("The gratuity is " + gratTotal + "and the total is " +
     total );
  }
}


