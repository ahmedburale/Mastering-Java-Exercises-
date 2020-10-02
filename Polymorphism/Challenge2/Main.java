public class Main {

  public static void main(String [] args){
    
    Car car = new Car(8, "Base car")'
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake()); 
    
    Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD"); 
    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());
    
    Ford ford = new Ford(6, "Ford Falcon");
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());
    
    Holden holden = new Holden(6, "Holden Commodore");
    System.out.println(holden.startEngine());
    System.out.println(holden.accelerate());
    System.out.println(holden.brake()); 
  }
}
