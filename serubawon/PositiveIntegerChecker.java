import java.util.Scanner;
    
public class PositiveIntegerChecker{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter any whole number:");

    int userNumber = input.nextInt();
       
    if(userNumber > 0){

        System.out.pritnln("Positive");

        }


    }

}
