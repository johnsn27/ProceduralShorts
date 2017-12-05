/*
AUTHOR Nathan Johnson
Program prints the items on a menu
*/

import java.util.Scanner; // import the swing library for I/O

class task3
{
    public static void main (String[] param)
    {

        choiceOutput();
        System.exit(0);

    } // END main
    public static void choiceOutput() //outputs the cost of each drink using the user input in menu()
    {

       // Declare variables
       //
       int drink;
       int answer;

       drink = menu();

       if(drink == 1)
       {

         System.out.println("Coffee costs 3.50");

       }
       else if(drink == 2)
       {

         System.out.println("Tea costs 2.50");

       }
       else if(drink == 3)
       {

         System.out.println("Chocolate costs 3.00");

       }
       else
       {

         System.out.println("I do not have a drink for number " + drink);

       }

       return;

    } // END squarethird
    public static int menu() //takes user input
    {
       Scanner scanner = new Scanner(System.in);
       int choice;

       System.out.println("What drink do you want (1 Coffee, 2 Tea, 3 Chocolate)?");
       choice = Integer.parseInt(scanner.nextLine());

       return choice;
    }
} // END class if_boolean
