import java.util.Scanner;
    
public class TaxCalculator{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter price: ");

    double price = input.nextDouble();

    double tax = price * 0.075;

    double total = price + tax;
    
    System.out.println("Total is: " + total);    



    }

}
