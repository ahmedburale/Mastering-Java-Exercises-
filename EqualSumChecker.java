/***********************************************************CODE EXERCISE 6: EQUAL SUM CHECKER**********************************************************
Description Exercise:
  - Write a method hasEqualSum with 3 parameters of type int
  - The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. 
  - Otherwise, return false. 
  
NOTES:
  - The hasEqualSum methodneeds to be defined as public static
  - This code solution does not contain main method. 
*********************************************************************************CODE******************************************************************/

public class EqualSumChecker {

  public static boolean hasEqualSum (int num1, int num2, int num3) {
  
    if ((num1 + num2) == num3){
    
      return true;
      
    }
    else {
    
      return false;
    
    }
  
  }

}
