import java.util.Scanner;


class task9
{

   public static void main(String []p)
   {

       createPainting();
       System.exit(0);
   }

    public static void createPainting()
    {

      Painting s1 = initPainting("Woman with a Pearl Necklace in a Loge", "Mary Cassatt", "1879", "1");
      Painting s2 = initPainting("Self-Portrait with Beret and Turned-Up Collar", "Rembrandt", "1659", "2");
      Painting s3 = initPainting("Girl with Chrysanthemums", "Olga Boznanska", "1894", "3");
      Painting s4 = initPainting("Impression, Sunrise", "Claude Monet", "1872", "4");
      initArray(s1,s2,s3,s4);

    }

    public static void initArray(Painting a1, Painting a2, Painting a3, Painting a4)
    {

      final int HOWMANYROOMS = 4;
      String [] artCollection = new String [HOWMANYROOMS];

      artCollection[0] = PaintingToString(a1);
      artCollection[1] = PaintingToString(a2);
      artCollection[2] = PaintingToString(a3);
      artCollection[3] = PaintingToString(a4);
      enterRoom(artCollection);

    }

    public static void enterRoom(String[] artCollection)
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

    public static String input(String message)
    {
       Scanner scanner = new Scanner(System.in);
       String answer;

       System.out.print(message);
       answer = scanner.next();

       return answer;
    }

    public static int inputInt(String message)
    {
       return Integer.parseInt(input(message));
    }

   public static String PaintingToString (Painting s)
   {
     String message = "The painting in Gallery " + getRoomNumber(s) + " is by " + getArtistName(s) + ". It was painted in " + getYear(s) +" and is called " + getPaintingName(s);
     return message;
   }

    // Getter methods for Painting record type
    // Return the name from a student record
    //
   public static String getPaintingName (Painting s)
   {
     return s.paintingName;
   }

    // Return the id from a student record
   public static String getArtistName (Painting s)
   {
     return s.artistName;
   }

   public static String getYear (Painting s)
   {
     return s.year;
   }

   public static String getRoomNumber (Painting s)
   {
     return s.room;
   }
   public static Painting initPainting (String paintingName, String artistName, String year, String room)
   {
     Painting s = new Painting();

     s.paintingName = paintingName;
     s.artistName = artistName;
     s.year = year;
     s.room = room;

     return s;
   }

   public static void println(String m)
   {

      System.out.println(m);

   }
}

class Painting
{
   String paintingName; // The Paintings full name
   String artistName;
   String year;
   String room;
} // END class Painting
