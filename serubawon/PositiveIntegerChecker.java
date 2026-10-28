public class PrimeChecker{
    
    public static void main(String...arg){


        int counter = 0;
  

        for(int index = 1; index <= 50; index++){

            for(int divisor = 1; divisor <= index; divisor++) {

                if(index % divisor == 0) counter++;

            }      
    
            if(counter == 2) System.out.println(index);
            counter = 0;
   
        }



    }


}

  
