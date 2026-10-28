import java.util.Scanner;

public class StringReversal{
    
    public static void main(String...arg){

        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word,silly!");

        String userWord = input.next();

        int wordLength = userWord.length()-1;

        

        for(int index = wordLength; index >= 0; index--){ //we are doing greater than or equal to zero because we are moving down so index is 6 and while index is greatre than zero because we wanr toland at zero

            //userWord.charAt(index);

            System.out.println(userWord.charAt(index));
            

        }




        
    }



} 
