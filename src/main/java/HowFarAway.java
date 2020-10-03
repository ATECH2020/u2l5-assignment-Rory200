import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      //creats variables
       double startLatitude;
       double startLongitude;
       double endLatitude;
       double endLongitude;
       double distance;

       distance = distanceFrom();

       GeoLocation();

       Scanner scan = new Scanner(System.in);

       System.out.print("Enter the latitude of the starting location:" );
       startLatitude = scan.nextDouble();

       System.out.print("Enter the longitude of the starting location: ");
       startLongitude = scan.nextDouble();

       System.out.print("Enter the latitude of the ending location: ");
       endLatitude = scan.nextDouble();

       System.out.print("Enter the longitude of the ending location: ");
       endLongitude = scan.nextDouble();

       System.out.print("The distance is " + distance + "miles");

    }
}