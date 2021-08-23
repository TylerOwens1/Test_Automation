package src;

public class Contract {

  private String ID; //unique, no longer than 10 chars not null and unmutable
  private String firstName; //no longer than 10 chars not null
  private String lastName; //no longer than 10 chars not null
  private String phone; //exactly 10 digets not null
  private String address; //not longer than 30 chars, not null;
  
  
    //should I do verification in setters and throw exceptions (yes I should)
    //more specific exception? 
    public Contract(String ID, String firstName, String lastName, String phone, String address) throws Exception {
      this.setID(ID);
      this.setFirstName(firstName);
      this.setLastName(lastName);
      this.setPhone(phone);
      this.setAddress(address);
      
    }
    
    public String getID() {
      return this.ID;
    }
    
    public String getFirstName() {
      return this.firstName;
    }
    
    public String getLastName() {
      return this.lastName;
    }
    
    public String getPhone() {
      return this.phone;
    }
    
    public String getAddress() {
      return this.address;
    }
    
    private void setID(String id) throws Exception  {
      if(id == null || id.length() > 10){ // can't check for uniqueness here
        Exception e = new Exception("Invalid ID, must be not null and no more than 10 chars");
        throw e;
      }
      this.ID = id;
    }
    
    public void setFirstName(String firstName) throws Exception  {
      if(firstName == null || firstName.length() > 10){
        Exception e = new Exception("Invalid first name, must be not null and no more than 10 chars");
        throw e;
      }
      this.firstName = firstName;
    }
    
    public void setLastName(String lastName) throws Exception  {
      if(lastName == null || lastName.length() > 10){
        Exception e = new Exception("Invalid last name, must be not null and no more than 10 chars");
        throw e;
      }
      this.lastName = lastName;
    }
    
    
    public void setPhone(String phone) throws Exception  {
      if(phone == null || phone.length() != 10){
        Exception e = new Exception("Invalid phone, must be not null and 10 digits");
        throw e;
      }
      for(int i = 0; i < phone.length(); i++) {
        if(Character.digit(phone.charAt(i), 10) < 0) { // radix 10 (base 10) should work
          Exception e = new Exception("Invalid phone, must be not null and 10 digits");
          throw e;
        }
      }
      /*try {
        Long.parseLong(phone);
      } catch(NumberFormatException t) { 
        Exception e = new Exception("Invalid phone, must be not null and 10 digits");
        throw e;
      } catch(NullPointerException t) {
        Exception e = new Exception("Invalid phone, must be not null and 10 digits");
        throw e;
      }*/
      this.phone = phone;
    }
    
    public void setAddress(String address) throws Exception  {
      if(address == null || address.length() > 30){
        Exception e = new Exception("Invalid address, must be not null and no more than 30 chars");
        throw e;
      }
      this.address = address;
    }
}
