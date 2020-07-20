/**************************************************CODE EXERCISE 4: LEAP YEAR CALCULATOR***************************************************************
Description Exercise: 
  - Write a method isLeapYear with a parameter of type int named year. 
  - The parameter needs to be greater than or equal to 1 and less than or equal to 9999. 
  - If the parameter is not in that range retrn false. 
  - Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false. 
  To determine whether a year is a leap year, follow these steps:
  1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5
  2. If the year is evenly divisible by 100, go to step 3. Otherwise, got to step 4
  3. If the year is evenly divisible by 400, go to step 4. Otherwise, got to step 5
  4. The year is a leap year (it has 365 days). The method isLeapYear needs to return true
  5. The year is not a leap year(it has 365 days). The method isLeapYear needs to return false. 
  The following years are not leap years because they are evenly divisible by 100 but not 400:
  1700, 1800, 2100, 2200, 2300, 2500, 2600
  The following years are leap years because they are evenly divisible by 100 and 400:
  1600, 2000, 2400
  
  NOTE: 
    - The method isLeapYear needs to be defined as a public static
    - The code solution contains no main method. 
*************************************************************************CODE*************************************************************************/
// Recommended Solution
public class LeapYearCalculator {

	public static boolean isLeapYear(int year) {
	
		return (year > 1 && year < 9999) ? ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)):false;
	}
}
//public class LeapYearCalculator {

// public static boolean isLeapYear (int year) {
  
//   if (year < 1 || year 9999) {
    
//      return false; 
//    }
//    else if (year % 4 == 0 && year % 100 != 0) {
      
//      return true; 
//    }
//    else if (year % 100 == 0 && year % 400 == 0) {
    
//      return true;
//    }
//    else {
    
//      return false;
//    }
/  }
}
