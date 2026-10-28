public class CombinatorMethod{


public static int CombinatorMachine(int num1, int num2){


    int factorialNum1 = 1;
    int factorialNum3 = 1;
    int factorialNum2 = 1;

    for(int indexOne = num1; indexOne >= 1; indexOne--){

               factorialNum1 = factorialNum1 * indexOne;
                                                    
                 
                          
                //System.out.println(factorialNum1);
                
            
        }




for(int indexTwo = num2; indexTwo >= 1; indexTwo--){

               factorialNum2 = factorialNum2 * indexTwo;
                                                    
                 
                          
                //System.out.println(factorialNum2);
                
            
        }

int newNum = num1 - num2;

for(int indexThree = newNum; indexThree >= 1; indexThree--){

               factorialNum3 = factorialNum3 * indexThree;
                                                    
                 
                          
                //System.out.println(factorialNum3);
                
            
        }




int CombinatorResult = factorialNum1 / (factorialNum2 * factorialNum3);




return CombinatorResult;
}













}
