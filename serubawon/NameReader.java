import java.util.Scanner;

public class NameReader{

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a name");

    String studentName = input.next();

    System.out.println("Enter student age");

    int studentAge = input.nextInt();
    
    System.out.println("Hello " + studentName  + ", " + studentAge +  " " + " years old");

    //System.out.printf("Hello %s, %d years old", studentName, studentAge);



    }



}
