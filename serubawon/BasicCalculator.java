import java.util.Scanner;
    
public class BasicCalculator{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");       
    
    int firstNumber = input.nextInt();

    System.out.println("Enter second number");       
    
    int secondNumber = input.nextInt();

    int sumOfNumbers = firstNumber +  secondNumber;     
     
    int difference = firstNumber - secondNumber; 

    int product = firstNumber * secondNumber; 

    int quotient = firstNumber / secondNumber; 

    System.out.println("Sum: " + sumOfNumbers );   

    System.out.println("Difference: " + difference );

    System.out.println("product: " + product );   

    System.out.println("quotient: " + quotient );   


     }


}
