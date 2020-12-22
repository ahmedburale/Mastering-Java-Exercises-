import java.util.ArrayList;

public class MobilePhone {
  
  private String myNumber; 
  private ArrayList<Contact>myContacts;
  
  // constructor
  public MobilePohne(String myNumber){
    this.myNumber = myNumber; 
    this.myContacts = new ArrayList<Contact>();
  }
  // addNewContact method 
  public boolean addNewContact(Contact contact){
    if(findContact(contact.getname()) >= 0) {
      System.out.println("Contact isi already on file");
      return false;
    }
    
    myContacts.add(contact);
    return true;
  }
  //updateContact method 
  public boolean updateContact(Contact oldContact, Contact newContact) {
    int findPosition = findContact(oldContact); 
    if(foundPosition < 0) {
      System.out.println(oldContact.getName() + ", was not found"); 
      return false; 
    }else if(findContact(newContact.getName()) != -1) {
      System.out.println("Contact with name " +  newContact.getName() + " already exists. Update was not successefully."); 
      return false;
    }
    
    this.myContacts.set(foundPosition, newContact); 
    System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
    return true; 
  }
  
  // removeContact method 
  public boolean removeContact(Contact contact) {
    int foundPosition = findContact(contact);
    if(foundPosition  < 0) {
      System.out.println(contact.getName() + " was deleted.");
      return false; 
    }
  }
  
  


}// class MobilePhone
