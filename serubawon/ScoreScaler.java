import java.util.Scanner;
    
public class ScoreScaler{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter student score:");

    double studentScore = input.nextDouble();
       
    double scaledScore = (studentScore / 50) * 100;

    System.out.printf( " student's score =  %.1f / 50%n student's scaled score = %.2f out of 100", studentScore, scaledScore );

    
    


    }

}
