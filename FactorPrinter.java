/************************************************CODING EXERCISE 21: ALL FACTORS*******************************************
DESCRIPTION EXERCISE:
  - Write a method named printerFactors with 1 parameter of type int named number
  - If number < 1, the method should print "Invalid Value"
  - The method should print all factors of the number. A factor of a number is an integer which divides that numbers wholy
    (i.e. without leaving a remainder)
HINT:
    - Use a while or for loop statement 
NOTE: 
    - When printing numbers, each number can be in its own line. They don't have to be separated by a space
    - The method printFactors shoud be defined as a public static 
*********************************************************CODE*************************************************************/
public class FactorPrinter {

  public static void main(String [] args) {
  
    System.out.println(printFactors(6));
  
  }
  public static void printFactors(int number) {
  
    if(number < 1) {
    
      System.out.println("Invalid Value");
    
    }
    int factor = 0;
    for(int i = 1; i <= number; i++) {
    
      if(number % i == 0){
      
        factor = i;
        System.out.println(factor);
      
      }
    
    }
  
  }

}
