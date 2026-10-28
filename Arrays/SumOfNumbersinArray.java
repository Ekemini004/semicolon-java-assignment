import java.util.Scanner;
public class SumOfNumbersinArray{


public static void main(String [] args){



Scanner input = new Scanner(System.in);


int [] userNumbers = new int [5];
int sum = 0;


//to put users number into an array

for(int index = 0; index<5 ; index++){


System.out.println("enter number " + (index + 1) );

userNumbers[index] = input.nextInt();

sum += userNumbers[index] ; //0 + the number at this current index



}



//to display the current numbers that are in each array position
for(int index = 0; index<5 ; index++){


System.out.print(userNumbers[index] + " ");



}

System.out.println("sum of numbers is " + sum); 































}






}
