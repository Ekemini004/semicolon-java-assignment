import java.util.Scanner;

public class CreditCardValidator{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    //String userNumber = "4388576018402626";

    System.out.println("Hello kindly enter card details to verify: ");
    String userNumber = inputCollector.nextLine();

    System.out.println(CreditValidatorProcessor.creditCardTypeChecker(userNumber));

    System.out.println(userNumber);

    System.out.printf("Credit Card Digit Length: %d%n",userNumber.length());

    int parsedSum = Integer.parseInt(CreditValidatorProcessor.addDigitsInOddIndex(userNumber)) + Integer.parseInt(CreditValidatorProcessor.addSingleDigitNumbers(userNumber));

    if (parsedSum % 10 == 0){

        System.out.println("Credit Card Validity Status: valid");

        }else{

        System.out.println("Credit Card Validity Status: invalid");   

        }






    }


}
