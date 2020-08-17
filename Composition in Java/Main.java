public class Main {

  public static void main(String [] args) {
  
  // TEST CODE
    
    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("220B", "Dell", "240", dimensions);
    
    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
    
    Motherboard = theMotherboard = Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
    
    PC thePC = new PC(theCase, theMonitor, theMotherboard);
    the.PC.powerUP();
    
    /* COMPOSITION CHALLENGE:
      - Create a single room of a house using composition 
      - Think about the things that sould be included in the room 
      - May be physical parts of the house but furniture as well
      - Add at least one method to access one object via getters and 
      - then that objects public methods as you saw in the previous video
      - then add at least one method to hide the object e.g. not using a getter 
      - but to access the object used in composition within the main class
    */
    
    Wall wall1 = new Wall("West"); 
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("North");
    
    Ceiling ceiling = new Ceiling(12, 55);
    
    Bed bed = new Bed("Modern", 4, 3, 2, 1); 
    
    Lamp lamp = new Lamp("Classic", false, 75); 
    
    Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
    bedRoom.makeBed(0);
    bedRoom.getLamp().turnOn();
  
  
  }

}
