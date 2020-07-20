/*******************************************************CODE EXERCISE 5: DECIMAL COMPARATOR*************************************************************
Description Exercise:
  - Write a method areEqualByThreeDecimalPlaces with two parameters of type double
  - The method should return boolean and it needs to return if two double numbers are the same up to three decimal places. Otherwise return false. 
TIPS/NOTES: 
  - Use casting 
  - The areEqualByThreeDecimalPlaces method needs to be defined as a public static 
  - This code solution does not contain main method. 
**************************************************************************CODE**************************************************************************/

public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
  
    a = (int) (a * 1000);
    b = (int) (b * 1000);
    
    if (a == b) {
    
      return true; 
      
    }
    else {
    
      return false;
    }
  }
}
