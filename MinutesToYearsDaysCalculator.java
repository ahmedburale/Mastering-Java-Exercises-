/****************************************************CODING EXERCISE 9: MINUTES TO YEARS AND DAYS CALCULATOR********************************************
Description Exercise: 
  - Write a method printYearsAndDays with parameter of type long named minutes.
  - The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter. 
  - If the parameter is less than 0, print text 'Invalid Value".
  - Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
  - XX represents the original value minutes 
  - YY represents the calculated years 
  - ZZ represents the calculated days. 

TIPS/NOTES:
  - Use remainder operator (%)
  - 1hr =60min, 1day = 24hr, 1year = 365days
  - The printYearsAndDays methods needs to be defined as a public static 
  - This code solution does not contain a main method.
***********************************************************************CODE*****************************************************************************/

public class MinutesToYearsDaysCalculator {

  public static void printYearsAndDays(long minutes) {
  
    if (minutes < 0) {
    
      System.out.println("Invalid Value");
    
    }
    else {
    
      long years = (minutes / (365 * 24 * 60));
      long remainingDays = ((minutes / (60 * 24)) % 365);
      System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d ");
    
    }
   
  }

}
