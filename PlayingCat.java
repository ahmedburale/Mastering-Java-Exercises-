/************************************************************CODING EXERCISE 11: PLAYING CAT************************************************************
Description Exercise: 
  - The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then 
    the upper limit is 45 (inclusive) instead of 35. 
  - Write a method isCatPlaying that has 2 parameters
  - Method needs to return if the cat is playing, otherwise, return false. 
  - 1st parameter should be of type boolean and be named summer - it represents if it is summer 
  - 2nd parameter represents the temperature and is of type int with the name temperature. 

NOTES:
  - The isCatPlaying method needs to be defined as public static
  - This code solution has no main method.
******************************************************************************CODE**********************************************************************/

public class PlayingCat {

  public static boolean isCatPlaying (boolean summer, it temperature) {
  
    return ((temperature >= 25 && temperature <=35) || (temperature >= 25 && temperature <=45 && summer));
  
  }

}
