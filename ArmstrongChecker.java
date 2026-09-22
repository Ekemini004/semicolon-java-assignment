import java.util.Scanner;

public class ArmstrongChecker{

    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number");
        
        int userNumber = Integer.parse(input.next());

        userNumberLength = userNumber.length()-1;
        
        int index = 0;

        int sumOfUserNumber = 0;

            while(index <= userNumberLength){

              sumOfUserNumber += Integer.parseInt(userNumber.charAt(index))^userNumberLength;           
                        
            }

            if(sumOfUserNumber == userNumber)
            System.out.println(userNumber + "" + "is an armstrongs number");


            }

    }
        
   //Integer.parseInt(str);
