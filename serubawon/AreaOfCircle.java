import java.util.Scanner;
    
public class AreaOfCircle{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter radius:");

    double radius = input.nextDouble();

    double area = radius * 3.142;
    
    System.out.printf("area of the circle is: %.2f ", area); 

       



    }

}
