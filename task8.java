import java.util.*;
class task8
{

public static void main(String []p)
{
   createSale();
   System.exit(0);
}

public static void createSale() //setting a record
{

  int basePrice = intput("Base Price?");
  String hybridElectric = input("Hybrid or Electric?");
  String sunroof = input("Sun roof?");
  Sale s1 = initSale(basePrice, hybridElectric, sunroof);
  int total = returnPrice(s1);
  System.out.print("Total: ");prInt(total);
}
public static int returnPrice(Sale s) //calculates the total price of the car
{

  int electricInt = 0;
  int sunroofInt = 0;
  int total = 0;
  if(getHybridElectric(s).equalsIgnoreCase("Electric"))
  {

    electricInt = -1000;
    String electricString = "1000";
    println("Electric model: -" + electricString);

  }
  else
  {

    electricInt = 0;
    println("Electric model: ");

  }
  if(getSunroof(s).equalsIgnoreCase("yes"))
  {

    sunroofInt = 500;
    String sunroofString = "500";
    println("sunroof: " + sunroofString);

  }
  else
  {

    sunroofInt = 0;
    println("sunroof: ");

  }
  total = getBasePrice(s) + electricInt + sunroofInt;
  return total;

}
public static Sale initSale(int basePrice, String hybridElectric, String sunroof) //creates and initialises a sale
{
   Sale s = new Sale();

   s = setBasePrice(s, basePrice);
   s = setHybridElectric(s, hybridElectric);
   s = setSunroof(s, sunroof);

   return s;
}

// Getter methods for Student record type
public static int getBasePrice (Sale s) // Return the base price from a sale record
{
 return s.basePrice;
}

public static String getHybridElectric (Sale s) // Return whether the car is hybrid or electric from a sale record
{
 return s.hybridElectric;
}

public static String getSunroof (Sale s) // Return whether the car has a sunroof or not from a sale record
{
 return s.sunroof;
}

// Setter methods for Sale record type
public static Sale setBasePrice(Sale s, int basePrice) // Set the base price of a Sale returning the updated record
{
 s.basePrice = basePrice;
 return s;
}


public static Sale setHybridElectric (Sale s, String hybridElectric) // Set whether the vehicle is hybrid or electric returning the updated record
{
 s.hybridElectric = hybridElectric;
 return s;
}

public static Sale setSunroof (Sale s, String sunroof) // Set whether the vehicle has a sunroof returning the updated record
{
 s.sunroof = sunroof;
 return s;
}
public static String input(String message) // general user input
{

  Scanner scanner = new Scanner(System.in);
  println(message);
  String answer = scanner.nextLine();
  return answer;

}
public static int intput(String message) //general input integers
{

  Scanner scanner = new Scanner(System.in);
  println(message);
  int answer = scanner.nextInt();
  return answer;

}
public static void println(String m) // general print line for a string
{

  System.out.println(m);

}
public static void prInt(int i) // general print line for an integer
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
