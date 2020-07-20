/****************************************************************CODING EXERCISE 8: AREA CALCULATOR***************************************************
Description Exercise:
Method1: 
  - Write a method named area with one double parameter named radius.
  - The method needs to return a double value that represents the area of a circle.
  - If the parameter radius is negative then return -1.0 to represent an invalid value. 
Method2:
  - Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
  - The method needs to return an area of a rectangle
  - If either or both parameters is/are a negative return -1.0 to indicate an invalid value. 
TIPS/NOTES:
  - The formula for calculating the area of a rectangle is x * y. 
  - The formula for calculating a circle area is radius * radius * Math.PI.
  - All methods need to be defined as a public static 
  - This code solution does not contain a main method.
*******************************************************************************CODE*******************************************************************/

public class AreaCalculator {

  public static double area (double radius) {
  
    if (radius < 0) {
    
      return -1.0; 
    
    }
    return (radius * radius * Math.PI);
  
  }
  
  public static double area (double x, double y) {
  
    if (x < 0 || y < 0) {
    
      return -1.0;
    
    }
    return (x * y);
  
  }

}
