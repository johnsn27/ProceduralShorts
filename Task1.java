/*
Author Nathan Johnson
Program prints out my initals
*/
class task1
{

    public static void main (String[] param)
    {

        bigInitials();
        System.exit(0);
    } // END main
    //prints initials down the page in block capitals
    public static void bigInitials()
    {

      println("N   N");
      println("NN  N");
      println("N N N");
      println("N  NN");
      println("N   N");
      println("");
      println("JJJJJ");
      println("  J  ");
      println("  J  ");
      println("  J  ");
      println(" J   ");

    }
    // general print line method
    public static void println(String s)
    {

      System.out.println(s);

    }
}
