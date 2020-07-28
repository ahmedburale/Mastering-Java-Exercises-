/***************************************************CODING EXERCISE 24: FLOUR PACK*********************************************************
DESCRIPTION EXERCISE: 
  - Write a method named canPack with 3 parameters of type int named bigCount, smallCount and goal
  - The parameter bigCount represents the count of big flour bags(5 kilos each)
  - The parameter smallCount represents the count of small flour bag (1 kilo each)
  - The parameter goal represents the goal amount of kilos of flour needed to assemble a package 
  - Therefore, the sum of kilos of bigCount and smallCount must be at least eqaul to the value of goal. The method should return true if it
    is possible to make a package with goal kilos of flour
  - If the sum is greater than goal, ensure that only full bags are used towards the goal amount. 
  - If any of the parameters are negative, return false. 
NOTE: The method canPack shoulde be defined as a public static
********************************************************************CODE*****************************************************************/
public class FlourPack {

  public static void main(String [] args) {
  
    System.out.println(canPack(1, 0, 4));
  
  }
  public static boolean canPack(in bigCount, int smallCount, int goal) {
  
    int sumOfKilos = 0; 
    bigCount *= 5;
    sumOfKilos = bigCount +  smallCount; 
    
    if(bigCount < 0 || smallCount < 0 || goal < 0 || sumOfKilos < goal) {
    
      return false;
    
    } else if(sumOfKilos == goal) {
    
      return true; 
    
    }
    if(smallCount == 0){
    
      if(bigCount % goal == 0) {
      
        return true;
      
      }else {
      
        return false;
      
      }
    
    } else {
    
      if(bigCount > goal && bigCount % goal != 0) {
      
        return true;
      
      }else {
      
        return false;
        
      }
    
    }
  
  }

}
