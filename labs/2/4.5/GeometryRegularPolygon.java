import java.util.Scanner;
public class GeometryRegularPolygon {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


    //Prompt the user for the number of sides of the polygon
    System.out.println("Please enter the number of sides of the polygon: ");
    double n = input.nextDouble();


    //Prompt the user to indicate the length of the side
    System.out.println("Please Enter the length of the side");
    double s = input.nextDouble(); 


    //Calculation of the top half of the formula
    double top = n * Math.pow(s,2);


    //Defining the value of PI
    

    //Calculation of the bottom half of the formula
    double bottom = 4 * Math.tan(Math.PI/n);


    //Merging the top and bottom half together
    double area = (top / bottom);


    //Display of the Answer
    System.out.println("The area of the polygon is: " + area);


  }
}
