/************************************************************CODING EXERCISE 9: EQUALITY PRINTER**********************************************************
Description Exercise: 
  - Write a method printEqual with 3 parameters of type int. 
  - The method should not return anything (void).
  - If one of the parameters is less than 0, print text "Invalid Value"
  - If all numbers are equal print text "All numbers are equal"
  - If all numbers are different print text "All numbers are different"
  - Otherwise, print text "Neither all are equal or different"

NOTES: 
  - The method printEqual needs to be defined as a public static
  - This solution code does not contain a main method. 
********************************************************************************CODE*********************************************************************/

public class IntEqualPrinter {

  public static void printEqual(int fNumber, int sNumber, int tNumber) {
  
    if (fNumber < 0 || sNumber  0 || tNumber < 0) {
    
      System.out.pintln("Invalid Value");
    
    }
    else if (fNumber == sNumber && fNumber == tNumber && sNumber == tNumber) {
    
      System.out.println("All numbers are equal");
    
    }
    else if (fNumber != sNumber && fNumber != tNumber && sNumber != tNumber) {
    
      System.out.println("All numbers are different");
    
    }
    else {
    
      System.out.println("Neither all are equal or different");
    
    }
  
  }

}
