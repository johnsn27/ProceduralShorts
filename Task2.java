/*
Author Nathan Johnson
Program gets information about a room and gives the area waste and total area of carpet there needs to be
*/
import java.util.Scanner;

class Task2
{

    public static void main (String[] param)
    {

        area();
        System.exit(0);
    } // END main




    public static void area() //outputs the area, total area and waste
    {
       double length;
       double width;
       double area;
       double waste;
       double totalArea;


       length = length();
       width = width();

       area = length * width;
       waste = area*0.05;
       totalArea = area+waste;

       System.out.printf("Your room area is: %.2f \n", area);
       System.out.printf("The extra you need for wastage is: %.3f \n", waste);
       System.out.printf("The total carpet area you need to order is: %.1f \n", totalArea);
       return;
    }

    public static double length() //ask user to enter length then returns the user inputted length
    {
       double length;
       Scanner scanner = new Scanner(System.in);


       System.out.println("Enter a length greater than 0: ");

       length = scanner.nextDouble();

       return length;
    }

    public static double width() //ask user to enter width then returns the user inputted width
    {
    {
       double width;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a width greater than 0: ");

       width = scanner.nextDouble();

       return width;
    }
}
