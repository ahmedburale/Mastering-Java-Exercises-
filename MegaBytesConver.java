/********************************************CODE EXERCISE 2: MEGABYTES CONVERTER****************************************************************

Description Exercise: 
  Write a method printMegaBytesAndKilBytes that has 1 parameter of type int with the name kiloBytes. 
  This method should not return anything(void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
  Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".  
  XX represents the original value kilobytes 
  YY represents the calculated megabytes 
  ZZ represents the calculated remaining kilobytes
  
  TIPS/NOTES:
      - Use the remainder operator 
      - 1 MB = 1024KB
      - Do not set kilobytes parameter value inside your method
      - The printMegaBytesAndKiloBytes method needs to be defined as public static 
  
  In this code, main method is not included.

********************************************************************CODE**************************************************************************/

public class MegaBytesConverter {

  public static void printMegaBytesAndKiloBytes (int kiloBytes) {
  
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    }
    else {
      System.out.println(kiloBytes + " KB" + (kiloBytes " MB" " and" +  (kiloBytes % 1024) + " kb");
    }
  }
}
