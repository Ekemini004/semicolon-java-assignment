import java.util.Scanner;
    
public class AgeCalculator{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name:");

    String userName = input.next();

    System.out.println("Enter your year of birth:");

    int userYearOfBirth = input.nextInt();
       
     int age = 2025 - userYearOfBirth;

    System.out.printf( "Hello %s, You are %d years old", userName, age );
    


    }

}
