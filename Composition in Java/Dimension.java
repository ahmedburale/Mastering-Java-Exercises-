public class Dimension {
  private int width;
  private int height;
  private int depth; 
  
  
  public Dimension(int width, int height, int depth){
    this.width = width; 
    this.height = height;
    this.depth = depth; 
  }
  
  //getters
  public int getWidth(){
    return width;
  }
  public int getHeight(){
    return height;
  }
  public int getDepth(){
    return depth;
  }
  
}
