//Author Nathan Johnson
import java.util.*;


class task4
{

public static void main(String []p)
{

   System.out.print("What station do you want to know about?");
   createandprintstation();

   System.exit(0);
}


public static void createandprintstation() //writes a value to a record and asks if it matches user input and if that is true then gives information about a station
{
   String inputStation;
   Station mileEnd = new Station();
   Station kingsCross = new Station();
   Station woodford = new Station();
   Station oxfordStreet = new Station();

   inputStation = inputStation();
   mileEnd.name = "Mile End";
   mileEnd.access = false;
   mileEnd.zone = 2;
   kingsCross.name = "Kings Cross";
   kingsCross.access = true;
   kingsCross.zone = 1;
   woodford.name = "Woodford";
   woodford.access = true;
   woodford.zone = 4;
   oxfordStreet.name = "Oxford circus";
   oxfordStreet.access = false;
   oxfordStreet.zone = 1;

   if(inputStation.equalsIgnoreCase(getName(mileEnd)))
   {

     System.out.println(getName(mileEnd) + " is in zone " + getZone(mileEnd) + " and does not have wheelchair access");

   }
   else if(inputStation.equalsIgnoreCase(getName(kingsCross)))
   {

     System.out.println(getName(kingsCross) + " is in zone " + getZone(kingsCross) + " and does have wheelchair access");

   }
   else if(inputStation.equalsIgnoreCase(getName(woodford)))
   {

     System.out.println(getName(woodford) + " is in zone " + getZone(woodford) + " and does have wheelchair access");

   }
   else if(inputStation.equalsIgnoreCase(getName(oxfordStreet)))
   {

     System.out.println(getName(oxfordStreet) + " is in zone " + getZone(oxfordStreet) + " and does not have wheelchair access");

   }
   else
   {

     System.out.println("Is " + inputStation + " a London Underground Station? Maybe check your spelling.");

   }
   return;
}
public static String inputStation() //asks the user to input a station
{

  Scanner scanner = new Scanner(System.in);
  String inputStation = scanner.nextLine();

  return inputStation;

}


public static Station initStation(String stationname, int stationZone, Boolean sAccess1) //sets the station in the record
{
    Station s = new Station();

    s = setName(s, stationname);
    s = setZone(s, stationZone);
    s = setAccess(s, sAccess1);

    return s;
}


 // Convert a Station record details to a String eg for printing.
 // Places spaces between the fields.




 // Return the name from a station record
public static String getName (Station s)
{
  return s.name;
}

 // Return the Zone from a station record
public static int getZone (Station s)
{
  return s.zone;
}
public static Boolean getAccess (Station s) //returns access from the station record
{

  return s.access;

}

 // Return the total Access from a station record

// Setter methods for Station record type
// Set the Zone of a station returning the updated record
public static Station setZone (Station s, int stationZone)
{
  s.zone = stationZone;
  return s;
}


 // Set the name of a station returning the updated record
public static Station setName (Station s, String stationname)
{
  s.name = stationname;
  return s;
}
 // Set the Access of a station by giving exam and coursework Access /50 returning the updated record
 // The two Accesss are just added to give the overall final Access
public static Station setAccess (Station s, Boolean sAccess1)
{
  s.access = sAccess1;
  return s;
}

}
/* ***************************************************
   Create a new type (a record) called Station that records station data
*/

class Station
{
String name; // The Stations full name
Boolean access;   // Their unique Zone number
int zone;    // the zone
} // END class Station
