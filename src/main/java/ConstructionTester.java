import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        //initializes variables

        double taxRate;
        int windows;
        int lumber;
        double total;
        
        //creates a new scanner 
        Scanner in = new Scanner(System.in);
        
        //asks for the values
        System.out.println("Enter the sales tax rate:");
        taxRate = in.nextDouble();
        
        System.out.println("How many boards do you need?");
        lumber = in.nextInt();

        System.out.println("How many windows do you need?");
        windows = in.nextInt();

        System.out.println("Total : ");

        System.out.println("Grand Totoal : ");

    }
}
