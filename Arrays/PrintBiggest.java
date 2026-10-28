import java.util.Scanner;

public class PrintBiggest{

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");

    int userNumber = input.nextInt();  


    int biggest = userNumber;  

    int count = 0;

    int position = 0;


    for(int index = 0; index <= 3; index++){

    System.out.println("Enter a number: ");

    userNumber = input.nextInt();

        if(userNumber > biggest ){
   
            biggest = userNumber;

            count++;

            position++;

             if(position == 1){

              System.out.printf("position of first occurence of biggest number is position: %d ", position);  

            }        


        }


    }

    

    System.out.printf("BIggest number is %d and it was in position number %d ",biggest, position);
    System.out.printf("%n%d numbers were greater than the biggest number seen immediately before them", count);











































    }






}
