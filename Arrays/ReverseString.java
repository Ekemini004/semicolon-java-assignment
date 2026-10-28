
import java.util.Scanner;
public class ReverseString{


    public static void main(String [] args){
    
    char[] vowels = {'a', 'e', 'i', 'o', 'u'}; //created an array that contains all vowels

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word"); //ask the user for a word


    String userInput = input.next(); //read the users input and hold in container named userInput 

    int count = 0;

    int countTwo = 0;




    for (int index = userInput.length()-1; index >= 0; index--){ // move through the users input string 

      char reversedString = userInput.charAt(index);

        //System.out.print(reversedString);

            for(int indexTwo = index + 1; indexTwo <= userInput.length()-1; indexTwo++){

                    if(userInput.charAt(index) == userInput.charAt(indexTwo)){

                        countTwo++;

                        System.out.printf("%s, ",userInput.charAt(index));

                     }
                    
                    
            
            }  


        for(int arrayIndex = 0; arrayIndex < vowels.length-1; arrayIndex++){

                if(vowels[arrayIndex] == userInput.charAt(index)){

                      count++;                      

                }            
                               


          }
           

    }

    
    System.out.printf("%n there are %d vowels in this word", count); 
    System.out.printf("%n there are %d duplicates in this word", countTwo); 
    


      










    }





}
