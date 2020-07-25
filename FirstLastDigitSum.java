/************************************************************CODING EXERCISE 16: FIRST AND LAST DIGIT SUM*******************************************************
DESCRIPTION EXERCISE: 
  - Write a method named sumFirstAndLastDigit with one parameter of type int called number
  - The method needs to find the first and last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last 
    digit of that number
  - If the number is negative then the method needs to return -1 to indicate an invalid value 
NOTE: 
  - The method sumFirstAndLastDigit needs to be defined as public static
  - As per the exercise solution solution, do not add a main method
********************************************************************************CODE***************************************************************************

public class FirstLastDigitSum {

  public static void main (String [] args) {
  
    System.out.println(sumFirstAndLastDigit (number: 252) );
  
  }// end of main method
  
  public static int sumFirstAndLastDigit( int number){
        
        if (number < 0){
            return -1;
        }
        
        int lastDigit = number % 10;
        
        while( number >= 10){
            number /= 10;
            
        }
        
        return (number + lastDigit);
        
    } // end of sumFirstAndLastDigit method

}// end of main class
