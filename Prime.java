public class PrimeNumber{
    public static void main(String...arg){

        int number = 10;
        int counter = 0;        

        for(int index = 2; index < number;index++){

            if(number % index == 0) counter++;
        }


        if(counter > 0){
            System.out.println("its not a prime number ");
        }else{
            System.out.println("its a prime number");
        }

    }


}

  
