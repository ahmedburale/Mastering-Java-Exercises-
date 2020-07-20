/*********************************************************CODE EXERCISE 7: TEEN NUMBER CHECKER*********************************************************
Description Exercise:
  - We'll say that a number is "teen" if it is in the range 13 - 19 (inclusive).
Method1: - Write a method named hasTeen with 3 parameters of type int. 
         - The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19(inclusive). 
         - Otherwise, return false. 
Method2: - Write another method isTeen with 1 parameterof type int. 
         - The method should return boolean and it needs to return true if the parameter is in the range 13(inclusive) - 19(inclusive)
         - Otherwise, return false. 
NOTES: 
        - All methods need to be defined as a public static. 
        - This code solution does not contain main method. 
**************************************************************************CODE************************************************************************/

public class TeenNumberChecker {

  public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
  
    if((firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19) || (thirdNumber >= 13 && thirdNumber <= 19)) {
    
      return true; 
    
    }
    else {
    
        return false;
    
    }
  }
  
  public static boolean hasTeen(int number) {
  
    if (number >= 13 && number <= 19) {
    
      return true;
    
    }
    else {
    
      return false;
      
    }
  
  }

}
