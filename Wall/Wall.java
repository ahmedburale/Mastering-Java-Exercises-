/*********************************************************************CODING EXERCISE 31: WALL AREA*********************************************************************
DESCRIPTION EXERCISE:
  - Write a class with name Wall.The class needs to have two fields(instance variable) with name width and height of type double
  - The class needs to have two constructors. 
    * The first constructor does not have any parameters(no-arg constructor). 
    * The second constructor has parameters width and height of type double and it needs to initialize the fields.
    * In case the width is less than 0, it needs to set the width field value to 0.
    * In case the height parameter is less than 0, it needs to set the height field value to 0.
  - Write the   following methods(instance methods)
    * Method named getWidth without any parameters, it needs to return the value of width field.
    * Method named getHeight without any parameters, it needs to return the value of height field.
    * Method named setWidth  with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0, it needs to set the 
      width field value to 0.
    * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0, it needs to the the 
      height field value to 0.
    * Method named getArea without any parameters, it needs to return the area of the wall.
  NOTE:
    - All methods should be defined as public NOT public static
    - In total,  you've to write 5 methods and 2 constructors.
********************************************************************************CODE***********************************************************************************/
public class Wall {
    // write your code here
    private double width;
    private double height;
 //constructors 
    public Wall() {}
 
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    } 
  
  // instance methods
 
    public double getWidth() {
        return width;
    }
 
    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }
 
    public double getHeight() {
        return height;
    }
 
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }
 
    public double getArea(){
        return this.getWidth() * this.getHeight();
    }
}// end of Wall class
