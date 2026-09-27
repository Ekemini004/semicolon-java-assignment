import java.util.Arrays;
import java.util.Scanner;
public class Kata{

public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    //int[] arrayOfNUmbers = new int[1];


    //System.out.println("Enter a number");
    //int userInputOne = input.nextInt();

    //System.out.println("Enter a number");
    //int userInputTwo = input.nextInt();

    //maximumOfNumbers(userInputOne, userInputTwo);


    //System.out.println("The maximum of the two numbers is " + maximumOfNumbers(userInputOne, userInputTwo)); 
    
    //System.out.println("is the above number even? " + evenChecker(maximumOfNumbers(userInputOne, userInputTwo)));
    
    //System.out.println( "is this a prime number: " + primeNumberChecker(11));
    //System.out.println(differenceOfNumbers(3, 7));

    factorsChecker(24);
    


    }












        public static int maximumOfNumbers(int numberOne, int numberTwo){

            int maximum = numberOne;

            if(numberTwo > maximum) 

            maximum = numberTwo;

            
            return maximum;

            }



        public static boolean evenChecker(int firstNumber){

           Scanner input = new Scanner(System.in);

            boolean isNumberEven = false;
            
            if(firstNumber % 2 == 0){

            isNumberEven = true;
           

            }else{

            isNumberEven = false;

            }
            
            return isNumberEven;
          }



    
        public static boolean primeNumberChecker(int firstNumber){
            
            boolean isNumberPrime = false;
            int count = 0;

            for(int index = 1; index <= firstNumber; index++){
        
                if(firstNumber % index == 0){

                count = count + 1;

                }

             }
                if(count == 2){

                isNumberPrime = true;

                }else

                isNumberPrime = false;



           return isNumberPrime;
        }



        


        public static int differenceOfNumbers(int firstNumber, int secondNumber){

         int difference = 0;  
         if(secondNumber > firstNumber){

         difference = secondNumber - firstNumber;

         }else {
            
           difference = firstNumber - secondNumber; 

         }

               return difference;
            }




        public static int QuotientOfNumbers(int firstNumber, int secondNumber){

         int quotient = 0; 
         quotient = firstNumber/secondNumber; 

         if(secondNumber == 0){

         quotient = 0;

         }

               return quotient;
            }



    public static int factorsChecker(int firstNumber){
            

            int numberOfFactors = 0;
            

            for(int index = 1; index <= firstNumber; index++){
        
                if(firstNumber % index == 0){

                numberOfFactors = numberOfFactors + 1;


                //System.out.printf("%d, ", index,);

                }
            
                


             }

            int[] arrayBasket = new int[numberOfFactors];
            int arrayIndex = 0;
            for(int index = 1; index <= firstNumber; index++){

                    
                if(firstNumber % index == 0){
                   
                arrayBasket[arrayIndex] = index;

                arrayIndex++;               
                
                
                }
             }

            
            System.out.printf( "%n%d(factors: %s,)",numberOfFactors, Arrays.toString(arrayBasket) );
               

           return numberOfFactors;
        }



















}


 
