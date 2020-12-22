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
      System.out.println(contact.getName() + " was not found.");
      return false; 
    }
    this.myContacts.remove(foundPosition);
    System.out.println(contact.getName() + ", was deleted.");
    return true;
  }
  
  //findContact method 
  private int findContact(Contact contact){
    return this.myContacts.indexOf(contact);
  }
  
  private int findContact(String contactName){
    for(int i=0; i<this.myContacts.size(); i++){
      Contact contact = this.myContacts.get(i);
      if(contact.getName().equals(contactName)) {
        return i;
      }
    }
    return -1;
  
  }
  // queryContact 
  public String queryContact(Conctact contact) {
    if(findContact(conctact) >= 0){
      return contact.getName();
    }
    return null; 
  }
  
  public Contact queryContact(String name) {
    int position = findContact(name);
    if(position >= 0) {
      return this.myContacts.get(position);
    }
    return null;
  }
  
  public void printContacts(){
    System.out.println("Contact List");
    for(int i=0; i<this.myContacts.size(); i++){
      System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber()); 
    }
  }

}// class MobilePhone
