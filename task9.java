/*
Author Nathan Johnson
Program stores information about a painting in a room in a record and prints it on request
*/
import java.util.Scanner;
class task9
{

   public static void main(String []p)
   {

       createPainting();
       System.exit(0);
   }

    public static void createPainting() //creates the records
    {

      Painting s1 = initPainting("Woman with a Pearl Necklace in a Loge", "Mary Cassatt", "1879", "1");
      Painting s2 = initPainting("Self-Portrait with Beret and Turned-Up Collar", "Rembrandt", "1659", "2");
      Painting s3 = initPainting("Girl with Chrysanthemums", "Olga Boznanska", "1894", "3");
      Painting s4 = initPainting("Impression, Sunrise", "Claude Monet", "1872", "4");
      initArray(s1,s2,s3,s4);

    }

    public static void initArray(Painting a1, Painting a2, Painting a3, Painting a4) //initialises the array
    {

      final int HOWMANYROOMS = 4;
      String [] artCollection = new String [HOWMANYROOMS];

      artCollection[0] = PaintingToString(a1);
      artCollection[1] = PaintingToString(a2);
      artCollection[2] = PaintingToString(a3);
      artCollection[3] = PaintingToString(a4);
      enterRoom(artCollection);

    }

    public static void enterRoom(String[] artCollection) //repeatedly asks user for the room number and prints out information about what is in that room
    {

      for(int i = 1; i < 5; i++)
      {

        int inputInt = inputInt("What room you in? ");
        if(inputInt > 0 && inputInt < 5)
        {

          int roomNumberToArrayFormat = inputInt - 1;
          println(artCollection[roomNumberToArrayFormat]);

        }
        else
        {

          println("Closing down");
          System.exit(0);

        }

      }

    }

    public static String input(String message) // general user input method
    {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.print(message);
       answer = scanner.next();

       return answer;
    }

    public static int inputInt(String message) // general integer input method
    {
       return Integer.parseInt(input(message));
    }

   public static String PaintingToString (Painting s) // converts a record to a string
   {
     String message = "The painting in Gallery " + getRoomNumber(s) + " is by " + getArtistName(s) + ". It was painted in " + getYear(s) +" and is called " + getPaintingName(s);
     return message;
   }

    // Getter methods for Painting record type

   public static String getPaintingName (Painting s) // return the painting name
   {
     return s.paintingName;
   }

    // Return the id from a student record
   public static String getArtistName (Painting s) // return the artist name
   {
     return s.artistName;
   }

   public static String getYear (Painting s) // returns the year
   {
     return s.year;
   }

   public static String getRoomNumber (Painting s) // returns the room number
   {
     return s.room;
   }
   public static Painting initPainting (String paintingName, String artistName, String year, String room) // create and initialises a painting
   {
     Painting s = new Painting();

     s.paintingName = paintingName;
     s.artistName = artistName;
     s.year = year;
     s.room = room;

     return s;
   }

   public static void println(String m) // general print line method
   {

      System.out.println(m);

   }
}

class Painting
{
   String paintingName;
   String artistName;
   String year;
   String room;
} // END class Painting
