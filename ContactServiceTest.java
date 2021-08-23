/**
 * 
 */
package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.ContactService;
import src.Contract;

/**
 * @author Tyler Owens
 *
 */
class ContactServiceTest {

  private static ContactService cs1;
  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUpBeforeEachClass() throws Exception {
    cs1 = new ContactService();
    cs1.addContract("ID","First","Last","1111111111","Address");
  }

  
  @Test
  final void testAddContract() {
    
    assertThrows(Exception.class, () -> cs1.addContract("ID","First","Last","1111111111","Address"));
  }

  /**
   * Test method for {@link Contract#getFirstName()}.
   */
  @Test
  final void testGetFirstName() {
    assertTrue("First" == cs1.getFirstName("ID"));
  }
  
  /**
   * Test method for {@link Contract#getLastName()}.
   */
  @Test
  final void testGetLastName() {
    assertTrue("Last" == cs1.getLastName("ID"));
  }

  /**
   * Test method for {@link Contract#getPhone()}.
   */
  @Test
  final void testGetPhone() {
    assertTrue("1111111111" == cs1.getPhone("ID"));
  }

  /**
   * Test method for {@link Contract#getAddress()}.
   */
  @Test
  final void testGetAddress() {
    assertTrue("Address" == cs1.getAddress("ID"));
  }

  /**
   * Test method for {@link Contract#setFirstName(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testSetFirstName() throws Exception {
    cs1.updateFirstName("ID", "New First");
    assertTrue("New First" == cs1.getFirstName("ID"));
  }

  /**
   * Test method for {@link Contract#setLastName(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testSetLastName() throws Exception {
    cs1.updateLastName("ID", "New Last");
    assertTrue("New Last" == cs1.getLastName("ID"));
  }

  /**
   * Test method for {@link Contract#setPhone(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testSetPhone() throws Exception {
    cs1.updateNumber("ID", "9999999999");
    assertTrue("9999999999" == cs1.getPhone("ID"));
  }

  /**
   * Test method for {@link Contract#setAddress(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testSetAddress() throws Exception {
    cs1.updateAddress("ID", "New Address");
    assertTrue("New Address" == cs1.getAddress("ID"));
  }

}
