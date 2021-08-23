package src;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
  
  private List<Contract> contracts;
  
  public ContactService() {
    contracts = new ArrayList<Contract>();
  }
  
  public void addContract(String ID, String firstName, String lastName, String phone, String address) throws Exception {
   for(int i = 0; i < contracts.size(); i++) {
     if(contracts.get(i).getID() == ID) {
       Exception e = new Exception("ID already exsits");
       throw e;
       //throw exception here
     }
   }
   Contract c = new Contract(ID, firstName, lastName, phone, address);
   contracts.add(c);
   
  }
  
  public void deleteContract(String ID) {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        contracts.remove(i);
      }
    }
  }
  
  public String getFirstName(String ID) {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        return contracts.get(i).getFirstName();
      }
    }
    return null; //returns null for not found
  }
  
  public String getLastName(String ID) {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        return contracts.get(i).getLastName();
      }
    }
    return null;
  }
  
  public String getPhone(String ID) {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        return contracts.get(i).getPhone();
      }
    }
    return null;
  }
  
  public String getAddress(String ID) {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        return contracts.get(i).getAddress();
      }
    }
    return null;
  }
  
  public void updateFirstName(String ID, String firstName) throws Exception {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        contracts.get(i).setFirstName(firstName);;
      }
    }
  }
  
  public void updateLastName(String ID, String lastName) throws Exception {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        contracts.get(i).setLastName(lastName);;
      }
    }
  }
  
  public void updateNumber(String ID, String phoneNumber) throws Exception {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        contracts.get(i).setPhone(phoneNumber);
      }
    }
  }
  
  public void updateAddress(String ID, String address) throws Exception {
    for(int i = 0; i < contracts.size(); i++) {
      if(contracts.get(i).getID() == ID) {
        contracts.get(i).setAddress(address);
      }
    }
  }

}
