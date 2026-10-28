import java.util.Scanner;

public class Factorial{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int userNumber = input.nextInt();

        long factorial = 1;
        
      
               for(int index = userNumber; index >= 1; index--){

               factorial = factorial * index;
                                                    
                 }
                          
                System.out.println(factorial);
                
            
        }

  }
