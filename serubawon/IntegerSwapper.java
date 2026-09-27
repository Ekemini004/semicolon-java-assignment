 
public class IntegerSwapper{
    
    public static void main(String [] args){

    int firstNumber = 5;

    int secondNumber = 8;

    System.out.printf("first number is: %d, second number is: %d", firstNumber, secondNumber);

    int tempoContainer = firstNumber;

    firstNumber = secondNumber;

    secondNumber = tempoContainer;

    System.out.printf("first number is: %d, second number is: %d", firstNumber, secondNumber);


  


    }

}
