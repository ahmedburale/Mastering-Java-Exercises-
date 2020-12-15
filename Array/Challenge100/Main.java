/*
CODE CHALLENGE DESCRIPTION: 
  - Create a program using arrays that sorts a list of integers in descending order. 
  - Descending orders is the highest value to lowest 
  - In other words if the array had the valuees in it 106,26,8,5,15 your program should ultimately have an array with 106,81,26,15,5, in it. 
  - Set up the program so that the numbers to sort are read in from the keyboard. 
  - Implement the following methods - getIntegers, printArray, and sortIntegers
  - getIntegers -  returns an array of entered integers from keyboard
  - printArray - prints out the contents of the array
  - and sortArray - should sort the array and return a new array containing the sorted numbers
  - you'll have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array 
*/
//libraries 
import java.util.Arrays;
import java.util.Scanner; 

//Main class
public class Main{
    //Scanner
    private static Scanner scanner = new Scanner(System.in); 
    
    public static void main(String [] args){
    
      int[] myIntegers = getIntegers(5);
      int[] sorted = sortIntegers(myIntegers);
      printArray(sorted);  
    } // Main method 
    
    public static int[] getIntegers(int capacity) {
    
      int[] array = new int[capacity]; 
      System.out.println("Enter " + capacity +" integer values: \r);
      for(int i=0; i<array.length; i++){
        array[i] = scanner.nextInt();
      }
      return array; 
    }
    
    public static void printArray(int[] array) {
    
      for(int i=0; i<array.length; i++){
      
        System.out.println("Element " + i + " contents " + array[i]);
      }
    }
                         
    public static int[] sortIntegers(int[] array) {
    
  //    int[] sortedArray = new int[array.length]; 
  //    for(int i=0;  i<array.length; i++) {    
  //      sortedArray[i] = array[i]; 
  //    }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        
        boolean flag = true; 
        int lamp; 
        while(flag) {
        
          flag = false;
          // element 0  160
          // element 1  50
          // element 2  40
          
          for(int i=0; i<sortedArray.length-1; i++) {
          
            if (sortedArray[i] < sortedArray[i+1]){
            
              temp = sortedArray[i];
              sortedArray[i] = sortedArray[i+1];
              sortedArray[i+1] = temp;
              flag = true; 
            }
          }
        }
        return sortedArray;
    }

}// Main class
