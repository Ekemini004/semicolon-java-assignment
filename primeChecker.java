public class PrimeChecker{
    public static void main(String...arg){


        int counter = 0;
  

        for(int index = 2; index <= 100; index++){

            for(int divisor = 2; divisor < index; divisor++) {

                if(index % divisor == 0) counter++;

            }          
                if(counter > 0) System.out.println(index);
                
   
        }

















    }


}

  
