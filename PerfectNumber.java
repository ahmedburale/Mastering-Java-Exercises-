/*********************************************CODING EXERCISE 22: PERFECT NUMBER***********************************************
DESCRIPTION EXERCISE:
  - A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
  - Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and 
    exclude the perfect number itself. 6 is a perfect number
  * Write a method named isPerfectNumber with 1 parameter of type int named number 
  * If number is < 1, the method should return false
  * The method must calculate if the number is perfect. If the number is perfect, the method should retrun true; otherwise, 
    it should return false. 
HINT: 
    - Use a while or for loop statement 
    - Use the remainder operator 
NOTE: 
    - The method isPerfectNumber should be defined as public static 
*****************************************************************CODE*********************************************************/
public class PerfectNumber {

  public static void main(String [] args) {
  
    System.out.println(isPerfectNumber(6));
  
  }
  
  public static boolean isPerfectNumber(int number) {
  
    if(number < 1) {
     
     return false; 
      
    }
    int perfect = 0; 
    for(int i = 1; i < number; i++) {
    
      if(number % i == 0) {
      
        perfect += i; 
      
      }
      if(perfect == number) {
      
        return true; 
      
      }
    
    }
    return false;
  
  }

}
