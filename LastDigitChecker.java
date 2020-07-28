/*********************************************CODING EXERCISE 19: LAST DIGIT CHECKER****************************************
DESCRIPTION EXERCISE:
Method1:
  - Write a method named hasSameLastDigit with 3 parameters of type int. 
  - Each number should be within the range of 10(inclusive) - 1000(inclusive). If one of the numbers is not within the range,
    the method should return false. 
  - The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return 
    false. 
Method2:
  - Write another method named isValid with one parameter of type int
  - The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise, return
    false. 
NOTE:
  - All methods needs to be defined as a public static 
***************************************************************CODE*********************************************************/
public class LastDigitChecker {

  public static void main(String [] args){
  
    System.out.println(hasSamelastDigit (41,22,71);
    System.out.println(isValid (10));
  
  }
  
  public static boolean hasSameLastDigit(int fDigit, int sDigit, int lDigit) {
  
    if((isValid(fDigit) && isValid(sDigit) && isValid(lDigit))) {
    
      if((fDigit % 10 == sDigit % 10 || (sDigit % 10 == lDigit % 10 == fDigit % 10))) {
      
        return true;
      
      }
    
    }
    return false;
  
  }
  public static boolean isValid(int number) {
  
    return(number >= 10 && number <= 1000));
  
  }

}
