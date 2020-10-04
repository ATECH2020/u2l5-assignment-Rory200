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
       double RADIUS = 3963.1676;

      // created scanner
       Scanner scan = new Scanner(System.in);

       
      //system outprints
       System.out.print("Enter the latitude of the starting location:" );
       startLatitude = scan.nextDouble();

       System.out.print("Enter the longitude of the starting location: ");
       startLongitude = scan.nextDouble();

       System.out.print("Enter the latitude of the ending location: ");
       endLatitude = scan.nextDouble();

       System.out.print("Enter the longitude of the ending location: ");
       endLongitude = scan.nextDouble();
      //stupid math
       double lat1 = Math.toRadians(startLatitude);
        double long1 = Math.toRadians(startLongitude);
        double lat2 = Math.toRadians(endLatitude);
        double long2 = Math.toRadians(endLongitude);
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos); 
        arcLength = arcLength * RADIUS;
        distance = arcLength;
      //final outprint
       System.out.print("The distance is " + distance + " miles");

    

    }
}