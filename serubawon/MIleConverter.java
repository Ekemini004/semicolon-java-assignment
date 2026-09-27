import java.util.Scanner;
    
public class MileConverter{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter current value in miles:");

    double mileInput = input.nextInt();
       
    double kilometerOuptut = mileInput * 1.60934;

    System.out.printf( " %d miles =  %.2f kilometeres", mileInput, kilometerOutput );
    


    }

}
