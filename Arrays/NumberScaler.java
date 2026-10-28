import java.util.Scanner;
public class NumberScaler{



    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    int index = 0;
    int[] numberBasket = new int[5];

    int largest = 0;
    

    
    

    for(; index<= 4; index++){

        System.out.println("Enter a number");
        int userNumber = input.nextInt();
        numberBasket[index] = userNumber; 

    }

    int ArrayPosition = 0;
    for(; ArrayPosition <= 4; ArrayPosition++){

    System.out.println("The number you entered is: " + numberBasket[ArrayPosition]);

        }


     ArrayPosition = 0;
    for(; ArrayPosition <= 4; ArrayPosition++){

       if(numberBasket[ArrayPosition] > largest){
                    
            largest  =  numberBasket[ArrayPosition];   

            } 

        }

    System.out.println("The largest number is: " + largest );

    ArrayPosition = 0;
    int smallest = largest;
    int sumOfNumbers = 0;

    for(; ArrayPosition <= 4; ArrayPosition++){

    int numberInArray = numberBasket[ArrayPosition];
    sumOfNumbers += numberInArray;
        
       if(numberBasket[ArrayPosition] < smallest ){
           
            smallest  =  numberBasket[ArrayPosition];   

            } 

        }
    
   System.out.println("The smallest number is: " + smallest );
    System.out.println("The sum of all the numbers is: " + sumOfNumbers );
    System.out.println("The average of all the numbers is: " + sumOfNumbers/numberBasket.length );
    







    }




}


