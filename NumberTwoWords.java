/*************************************************CODING EXERCISE 23: NUMBER TO WORDS******************************************
DESCRIPTION EXERCISE: 
Method1: 
        - Write a method called numberToWords with 1 int parameter named number
        - The method should print out the passed number using word for the digits 
        - If the number is negative, print "Invalid Value"
 Steps to Print the Number as Words: 
        1. Extract the last digit of the given number using the remainder operator
        2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those
           being 0,1,2,3,4,5,6,7,8,9. Print the corresponding word for each digit. e.g. print "Zero" if the digit is 0, "One"
           if the digit is 1, and so on. 
        3. Remove the last digit from the number
        4. Repeat Step 2 through 4 until the number is 0
 Method 2: 
        - The logic abobe is correct, but in its current state, the words will be printed in reverse order. For example, if the
          number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this
          problem, write a second method called reverse.
        - The method reverse should have 1 int parameter and return the reversed number(int). For example, if the number passed
          is 234, then the reversed number would be 432. The method reverse should also reverse negative numbers
        - Use the method reverse within the method numberToWords in order to print the words in the correct order. 
        - Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). 
          The logic above for the metho numberToWords will print "One", but that is incorrect. It should print "OneZeroOne". To
          solve this problem, write a third method called getDigitCount
 Method 3:
        - The method getDigitCount should have 1 int parameter called number and return the count of the digits in that number.
          If the number is negative, return -1 to indicate an invalid value. 
        - For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 10 has 3 
          digits (1,0,0).
  HINTS: 
        - Use a for loop statement to print zeroes after reversing the number. As seen in a previous example, 100 reversed 
          becomes 1, but the method numberToWords should print "OneZeroZero". To get the number of zeroes, check the difference
          between the digit count from the original number and the reversed number.
  NOTES:
        - When printing words, each word can be in its own line 
        - They don't have to be separated by a space
        - The method numberToWords, getDigitCount, reverse should be defined as public static 
        - In total, you've 3 methods
*********************************************************CODE*****************************************************************/
public class NumberTwoWords {
    
    public static void main(String [] args) {
    
      System.out.println(getDigitCount(0));
      System.out.println(reverse(1234));
      (numberToWords(123));
    
    }
    // write your code here
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        else{
            int rev = reverse(number);
            int count = getDigitCount(number);
            
            while(count > 0) {
                int lastDigit = rev % 10;
                rev = rev / 10;
                count--;
                
                switch (lastDigit) {
                       case 0:
                           System.out.printf("Zero");
                           break;
                       case 1:
                           System.out.printf("One");
                           break;
                       case 2:
                           System.out.printf("Two");
                           break;
                       case 3:
                           System.out.printf("Three");
                           break;
                       case 4:
                           System.out.printf("Four");
                           break;
                       case 5:
                           System.out.printf("Five");
                           break;
                       case 6:
                           System.out.printf("Six");
                           break;
                       case 7:
                           System.out.printf("Seven");
                           break;
                       case 8:
                           System.out.printf("Eight");
                           break;
                       case 9:
                           System.out.printf("Nine");
                           break;
                       default:
                           System.out.println();
                   }
               }
        }
    }

    public static int reverse(int number){
        int rev = 0;
        if(number < 0) {
            number = -1 * number;
            
            while (number > 0) {
                int lastDigit = number % 10;
                rev = lastDigit + rev * 10;
                number /= 10;
           }
           return - rev;
       }
       
       while (number > 0) {
           int lastDigit = number % 10;
           rev = lastDigit + rev * 10;
           number /= 10;
       }
        return rev;
    }

    public static int getDigitCount(int num){
        if(num < 0){
            return -1;
        }
        else if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
