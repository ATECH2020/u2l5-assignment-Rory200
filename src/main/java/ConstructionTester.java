import java.util.Scanner;


public class ConstructionTester
{
    public static void main(String[] args)
    {
        

        //initializes variables

        double taxRate;
        double windows;
        double lumber;
        double total;
        int numBoards = 8;
        int numWindows = 11;
        double grandTotal;


        //creates a new scanner 
        
        Scanner scanner = new Scanner(System.in);
       
        
        
        //asks for the values
        System.out.println("Enter the sales tax rate:");
        taxRate = scanner.nextDouble();
        
        System.out.println("How many boards do you need?");
        lumber = scanner.nextDouble();
        

        System.out.println("How many windows do you need?");
        windows = scanner.nextDouble();

        //does stupid math
        lumber = lumber * numBoards;
        windows = windows * numWindows;
        total = lumber + windows;
        grandTotal = total * (1 + taxRate);

        //tells totals
        System.out.println("Total : " + total);

        System.out.println("Grand Totoal : " + total * (1 + taxRate));

    }
}
