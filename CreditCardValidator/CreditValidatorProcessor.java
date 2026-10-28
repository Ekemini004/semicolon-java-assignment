public class CreditValidatorProcessor{


public static String addSingleDigitNumbers ( String usersInput){

    int integerValueOfIndex = 0;
    String charValueOfIndex = "";
    int sumOfDoubleChar = 0;
    int singleValueSum = 0;
    int sumOfSingleDigitNumbers = 0;
    

    for(int index = usersInput.length() - 2; index >= 0; index = index - 2 ){

        //sumOfDoubleChar = 0;

        integerValueOfIndex = usersInput.charAt(index) - '0' ; 

        charValueOfIndex = "" + (integerValueOfIndex * 2); 

        if( charValueOfIndex.length()-1 > 0 ){ 


         sumOfDoubleChar += ((charValueOfIndex.charAt(0)-'0')+ (charValueOfIndex.charAt(1)- '0'));  



            }

        else singleValueSum += (charValueOfIndex.charAt(0) - '0');


        

    }


    sumOfSingleDigitNumbers = singleValueSum + sumOfDoubleChar;

    return "" + sumOfSingleDigitNumbers;
    


}




public static String addDigitsInOddIndex(String userInput){

    int sumOfOddIndex = 0;

    for(int index = 0; index < userInput.length(); index++){

        if(index % 2 > 0){
          
            sumOfOddIndex += userInput.charAt(index) - '0';


            }



        }


return "" + sumOfOddIndex;


}



public static String creditCardTypeChecker(String userInput){

    String invalidquote = "";

                if(userInput.charAt(0) == '4')
                  
                    invalidquote = "Credit Card Type: VisaCards"; 

                else if(userInput.charAt(0) == '5')   

                    invalidquote = "Credit Card Type: MasterCard"; 

                else if(userInput.charAt(0) == '3' && userInput.charAt(1) == '7')   

                    invalidquote = "Credit Card Type: American Express Cards"; 

                else 
                    invalidquote = "Invalid Card"; 
             

        return invalidquote;

}

























}
