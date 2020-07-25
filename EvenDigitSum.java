/*******************************************************************CODING EXERCISE 17: EVEN DIGIT SUM*************************************************************
DESCRIPTION EXERCISE: 
  - Write a method named getEvenDigitSum with one parameter of type int called number
  - The method should return the sume of the even digits within the number 
  - If the number is negative, the method should return -1 to indicate an invalid value
NOTE: 
  - The method getEvenDigitSum should be defined as public static like 

*****************************************************************************CODE**********************************************************************************/

public class EvenDigtSum {

  public static void main(String [] args){
  
    System.out.println(getEvenDigitSum(number: 252));
  
  }
  public static int getEvenDigitSum(int number) {
    int sumEvenDigits = 0;
    if (number < 0) 
      return -1;
            
      while (number > 0) {
        int evenDigits = number % 10;
        if (evenDigits % 2 == 0 ) 
          sumEvenDigits += evenDigits;
          number /= 10;
      }
        return sumEvenDigits;
   }//end of getEvenDigitSum method

}//end of main class
