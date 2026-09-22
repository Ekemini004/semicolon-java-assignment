import java.util.Scanner;

public class Factors{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int userNumber = input.nextInt();

        int index = 1;

               while(index <= userNumber){

                       if( userNumber % index == 0){
                        
                            System.out.println(index);
                                                    
                        }
                            index++;

                }
            
        }

  }
