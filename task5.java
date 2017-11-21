import java.util.*;

class task5 {

    public static void main(String args[]){

         bottles();
         System.exit(0);
    }
    public static void bottles() //asks the user how many bottles they want
    {

      String bottles = input("How many bottles are there? ");
      int bottlesInt = Integer.parseInt(bottles);

      for(int i=bottlesInt; i>0; i--)  //iterates decreasing from the number of bottles the user specified until it reaches 0
      {

           print(i + " green bottles, standing on a wall,");
           print(i + " green bottles, standing on a wall,");
           print("but if 1 green bottle should accidentlly fall");
           print("There will be...");
           System.out.println();

      }

      print("No green bottles hanging on the wall");
      return;

    }
    public static void print(String m) //takes the string and prints it
    {

      System.out.println(m);

    }
    public static String input(String question) //takes the user input and returns it
    {

      Scanner scanner = new Scanner(System.in);
      print(question);
      String ans = scanner.nextLine();
      return ans;

    }

}
