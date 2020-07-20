/****************************************************CODE EXERCISE 1: SPEED CONVERTER *****************************************************************
First method:     Write a method called toMilesPerHur that has 1 parameter of type double with the name kiloMetersPerHour. 
                  This method needs to return value of the calculation type long.
                  If the parameter of the killometerPerHour is less than 0, the method  toMilesPerHours needs to return  -1 to indicatean invalid value. 
                  Otherwise, ifbit is positive, calculate the value of miles per hour, round it and return it. 
Second method:    Write another  method called printConversion with 1 parameter of type double with the name kilometersPerHour. 
                  This method should not return anything(void) and it needs  to calculate milesPerHour from the killometersPerHour parameter. Then it 
                  needs to print a message in the format "XX km/h = YY mi/h".
                  XX represents the original value kilometersPerHour
                  YY represents the rounded milesPerHour from the kilometersPerHour parameter.
                  If the parameter kilometersPerHour is < 0 then the text "Invalid Value".
                  Use method Math.round to round the number of calculated miles per hour (double). The method should return long. 
                  NO ADDED MAIN METHOD IN THIS CODE.
                  All methods should be defined as public static
                  1 mile per hous is 1.609 kilometers per hour
                  
/*****************************************************CODE*********************************************************************************************

public class SpeedConverter {
  
  public static long toMilesPerHour (double kilometersPerHour) {
    
    if (kilometersPerHour < 0) {
      return -1;
    }
    return Math.round(kilometersPerHou / 1.609);
  }
  
  public static void printConversion (double kilometersPerHour) {
  
    if (kilometersPerHour < 0) {
      System.out.println("Invalid Value");
    }
    else {
      long milesPerHour = toMilesPerHour(kilometersPerHour);
      System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
  }
 }
}
