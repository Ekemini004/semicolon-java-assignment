
import java.util.Scanner;
public class Fibonnacci {

    public static void main(String [] args){

     int start = 0;
     int next = 1;
     int newNumber = 0;
     System.out.printf("%d %d ", start, next);
        while (next <= 100){
            
            newNumber = start + next;
            System.out.printf("%d ", newNumber);
            start = next;
            next = newNumber;

             }

          

    }


}



//find out hoe to make it stop before 100. its suppsoed to be leess than 100
