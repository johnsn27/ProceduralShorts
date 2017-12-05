/*
Author Nathan Johnson
Program asks user for the takings at the box office for certain films and then prints the film that took the highest earnings and the total takings of each
of the films at the box office
*/
import java.util.*;

class task6
{

    public static void main(String args[])
    {

      final int HOWMANYFILMS = 5;
      int max = 0;
      int a = 0;
      int boxofficetakings = 0;
      String [] filmNameArray = new String [HOWMANYFILMS];
      filmNameArray[0] = "Despicable Me 3";
      filmNameArray[1] = "Wonder Woman";
      filmNameArray[2] = "It";
      filmNameArray[3] = "Cars 3";
      filmNameArray[4] = "Hidden Figures";
      int [] filmArray = new int [HOWMANYFILMS];

      for(int i = 0; i < HOWMANYFILMS; i++)
      {

          String film = filmNameArray[i];
          filmArray[i] = inputInt("How much money did " + film + " take in millions of dollars?");
          boxofficetakings = boxofficetakings + filmArray[i];
          if(filmArray[i] > max)
          {

            max = filmArray[i];
            a = i;

          }

      }
      println("The highest grossing film is currently " + filmNameArray[a]);
      println("Together these " + HOWMANYFILMS +  " films took $" + boxofficetakings + " million at the box office.");
      println("The films’ takings are:");
      for(int t = 0; t < HOWMANYFILMS; t++)
      {

        printResult(filmNameArray[t], filmArray[t]);

      }
    }

    public static Film createFilm (String film, int revenue) //create and initialise a film
    {

      Film f = new Film();
      f.film = film;
      f.revenue = revenue;
      return f;

    }
    public static String getFilm (Film f) // Return the film name from a Film record
    {

      return f.film;

    }
    public static int getRevenue (Film f) // Return the revenue from a film record
    {

      return f.revenue;

    }
    public static Film setFilm(Film f, String film) // Set the current film returning the updated record
    {

      f.film = film;
      return f;

    }
    public static Film setRevenue(Film f, int revenue) // Set the revenue of a film returning the updated record
    {

      f.revenue = revenue;
      return f;

    }
    public static int inputInt(String message) // general inputting of an integer
    {

      Scanner scanner = new Scanner(System.in);
      println(message);
      int answer = scanner.nextInt();
      return answer;

    }
    public static void println(String m) // general print line
    {

      System.out.println(m);

    }
    public static void printResult(String name, int revenue) // print the result of name and revenue
    {

      System.out.println(name + ", " + revenue);


    }
    public static void prInt(int i) // general print integer
    {

      println(Integer.toString(i));

    }
}
class Film
{

  String film;
  int revenue;

} // end class film
