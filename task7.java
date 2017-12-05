/*
Author Nathan Johnson
Program asks for the vehicles that have passed and counts the amount of lorries that have passed and gives a percentage of lorries that passed compared
to other vehicles
*/
import java.util.*;
class task7
{

public static void main(String []p)
{
   lorryCount();
   System.exit(0);
}
public static void lorryCount() //asks for vehicles that passed
{

  String vehicleType = "Y";
  int count = 0;
  int lorryCount = 0;
  float lorryPercent;
//asks for vehicles that passed
  while(!vehicleType.equalsIgnoreCase("CLOSE"))
  {

    vehicleType = input("What type of vehicle passed?");
    count++;
    if(vehicleType.equalsIgnoreCase("lorry"))
    {

      lorryCount++;

    }

  }
// calculates the amount of lorries that passed and the percentage of lorries compared to other vehicles
  count = count - 1;
  lorryPercent =  (lorryCount * 100.0f) / count;
  println("You saw " + lorryCount + " lorries. Lorries were " + lorryPercent + "% of all vehicles seen in this session.");
}
public static String input(String message) //general input method
{

  Scanner scanner = new Scanner(System.in);
  println(message);
  String ans = scanner.nextLine();
  return ans;

}
public static void println(String m) // general print line method
{

  System.out.println(m);

}
public static void prInt(int i) // general print integer method
{

  println(Integer.toString(i));

}
}
class Sale
{
int basePrice;
String hybridElectric;
String sunroof;
} // END class Sale
