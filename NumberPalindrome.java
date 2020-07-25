/****************************************************************CODING EXERCISE 15: NUMBER PALINDROME****************************************************************
DESCRIPTION EXERCISE:
  - Write a method called isPalindrome with one int parameter called number
  - The method needs to return a boolean
  - It should return true if the number is a palindrome number otherwise it should return false
  - Check the tips below for more info about palindromes 

TIP: Logic to Check a Palindrome Number 
  - Find the reverse of the given number. Store it in some variable  say reverse. Compare the number withe reverse
  - If both are the same then the nmber is a palindrome otherwise it is not. 
TIP: Logic to Reverse a Number 
  - Declare and initialize another variable to store the reverse of a number, for example reverse = 0
  - Extract the last digit of the given number by performing the modulo division (remainder). 
  - Store the last digit to some variable say lastDigit = num % 10
  - Increase the place value of reverse by one 
  - To increase place value multiply the reverse variable by 10. e.g. reverse = reverse * 10
  - Add lastDigit to reverse 
  - Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10 
  - Repeat steps until number is not equal to (or greater than) zero 
  - A While loop would be good for this coding exercise 
  
  - Be careful with negative numbers. They can also be a palindrome numbers
  - Be careful with reversing a number, you'll need a parameter for comparing a reversed number with the starting number(parameter) 
NOTE: The method isPalindrome needs to be defined as a public static 
*****************************************************************************CODE**********************************************************************************/

public class NumberPalindrome {

  public static void main(String [] args) {
  
    System.out.println(isPalindrome (number: 1221);
    
  }
  
  public static boolean isPalindrome(int number){
        
    int reverse = 0;
    int originalNumber = number;
        
    while (number !=0){
      int lastDigit = number % 10;
      reverse = (reverse * 10) + lastDigit;
      number /= 10;
    }
        
        return originalNumber == reverse;
 
  }
}
