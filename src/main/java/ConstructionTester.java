import java.util.Scanner;


public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //initializes variables

        double taxRate = scanner.nextDouble();
        double windows = scanner.nextDouble();
        double lumber = scanner.nextDouble();
        double total;


        //creates a new scanner 
        

        total = (lumber * 8) + (windows * 11);
        
        //asks for the values
        System.out.println("Enter the sales tax rate:");
        taxRate = scanner.nextDouble();
        
        System.out.println("How many boards do you need?");
        lumber = scanner.nextDouble();

        System.out.println("How many windows do you need?");
        windows = scanner.nextDouble();

        System.out.println("Total : " + total);

        System.out.println("Grand Totoal : " + total * (1 + taxRate));

    }
}
