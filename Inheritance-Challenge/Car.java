public class Car extends Vehicle {

  private int wheels;
  private int doors; 
  private int gears;
  private boolean isManual; 
  
  public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
    
    super(name, size); 
    this.wheels = wheels; 
    this.doors = doors;
    this.gears = gears; 
    this.isManual = isManual; 
    this.currentGear
  
  }
  
  public void changeGear(int currentGeare) {
    this.currentGear = currentGear;
    System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
  
  }
  
  public void changeVelocity(int speed, int direction0 {
    System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    move(speed, direction);
  
  }

}
