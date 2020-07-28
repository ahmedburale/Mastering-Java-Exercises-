/********************************************CODING EXERCISE 20: GREATEST COMMON DIVISOR**************************************
DESCRIPTION EXERCISE: 
  - Write a method named getGreatestCommonDivisor with 2 parameters of type int named first and second
  - If one of the parameters < 10, the method should return -1 to indicate an invalid value.
  - The method should return the greatest common divisor of the two numbers (int)
  - The greatest common divisor is the largest positive integer that can fully divide each of the integers(i.e. without leaving
    a remainder)
HINT:
    - Use a while or for loop statement and check if both numbers can be divided without a remainder
    - Find the minimum of the two numbers.
NOTE:
    - The method getGreatestCommonDivisor should be defined as a public static
*************************************************************CODE*************************************************************/
public class GreatestCommonDivisor {

  public static void main(String [] args) {
  
    System.out.println(getGreatestCommonDivisor(25,15));
  
  }
  public static int getGreatestCommonDivisor(int first, int second) {
  
    if(first < 10 || second < 10) {
    
      return -1; 
    
    }
    while(first != second) {
    
      if(first > second) {
      
        first -= second;
      
      }
      else {
      
        second -= first;
      
      }
    
    }
    return first;
  
  }

}
