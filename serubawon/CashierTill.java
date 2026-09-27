import java.util.Scanner;
    
public class CashierTill{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter item price:");

    double itemPrice = input.nextDouble();

    System.out.println("Enter item Quantity:");

    double itemQuantity = input.nextDouble();
       
    double subTotal = itemPrice * itemQuantity;

    double vAtTax = subTotal * 0.20;

    double grandTotal = subTotal + vAtTax;

    

    System.out.printf( "%.2fd", grandTotal);
    
    

    }

}
