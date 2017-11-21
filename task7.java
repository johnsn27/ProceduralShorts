import java.util.*;
class task7
{

public static void main(String []p)
{
   lorryCount();
   System.exit(0);
}
public static void lorryCount()
{

  String vehicleType = "Y";
  int count = 0;

  while(!vehicleType.equalsIgnoreCase("CLOSE"))
  {

    vehicleType = input("What type of vehicle passed?");
    if(vehicleType.equalsIgnoreCase("lorry"))
    {

      count++;

    }

  }
  println("You saw " + count + " lorries. Lorries were 40% of all vehicles seen in this session.");
}
public static String input(String message)
{

  Scanner scanner = new Scanner(System.in);
  println(message);
  String ans = scanner.nextLine();
  return ans;

}
public static void println(String m)
{

  System.out.println(m);

}
}
class Sale
{
int basePrice;
String hybridElectric;
String sunroof;
} // END class Sale
