public class Main {

  public static void main(String[] args) {
  
    //Test Code:
    Circle circle = new Circle(3.75);
    System.out.println("circle.radius = " + circle.getRadius());
    System.out.println("circle.area = " + circle.getArea());
    
    Cylinder cyclinder = new Cylinder(5.55, 7.25);
    System.out.println("cylinder.radium = " + cylinder.getRadius());
    System.out.println("cylinder.height = " + cylinder.getHeight());
    System.out.println("cylinder.area = " + cyclinder.getArea());
    System.out.println("cylinder.volume = " + cyclinder.getVolume());
  
  }

}
