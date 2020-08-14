/**********************************************************Inheritance Challenge********************************************************************
Challenge Description: 
  - Start with a base class of a Vehicle, then create a Car class that inherits from this base class
  - Finally, create another class, a specific type of Car that inherits from the Car class
  - You should be able to hand steering, change gear, and moving(Speed in other words). 
  - You'll want to decide where to put the appropriate state and behaviors (fields and methods)
  - As mentioned above, changing gears, increasing/decreasing speed should be included
  - For you specific type of vehicle, you'll want to add something for that type of car
****************************************************************************************************************************************************/

public class Main {

  public static void main(String[] args){
  
    Outlander outlander = new Outlander(36);
    outlander.steer(45);
    outlander.accelerate(30);
    outlander.accelerate(20);
    outlander.accelerate(-42);
    
  }

}
