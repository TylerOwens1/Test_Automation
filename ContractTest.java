package junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Contract;

class ContractTest {

  private static Contract contract1;
  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUpBeforeEachClass() throws Exception {
    contract1 = new Contract("ID","First","Last","1111111111","Address");
  }
  /**
   * Test method for {@link Contract#setFirstName(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testContract() throws Exception {
    assertThrows(Exception.class, () -> new Contract("ID more than 10 chars","First","Last","1111111111","Address"));
  }
  /**
   * Test method for {@link Contract#getID()}.
   */
  @Test
  final void testGetID() {
    assertTrue("ID" == contract1.getID());
  }

  @Test
  final void testGetFirstName() {
    assertTrue("First" == contract1.getFirstName());
  }

  @Test
  final void testGetLastName() {
    assertTrue("Last" == contract1.getLastName());
  }

  @Test
  final void testGetPhone() {
    assertTrue("1111111111" == contract1.getPhone());
  }

  @Test
  final void testGetAddress() {
    assertTrue("Address" == contract1.getAddress());
  }
  /**
   * Test method for {@link Contract#setFirstName(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testSetFirstName() throws Exception {
    contract1.setFirstName("New First");
    assertTrue("New First" == contract1.getFirstName());
    assertThrows(Exception.class, () -> contract1.setFirstName("This name is to long"));
  }

  /**
   * Test method for {@link Contract#setLastName(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testSetLastName() throws Exception {
    contract1.setLastName("New Last");
    assertTrue("New Last" == contract1.getLastName());
    assertThrows(Exception.class, () -> contract1.setLastName("This name is to long"));
  }

  /**
   * Test method for {@link Contract#setPhone(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testSetPhone() throws Exception {
    contract1.setPhone("9999999999");
    assertTrue("9999999999" == contract1.getPhone());
    assertThrows(Exception.class, () -> contract1.setPhone("not a num "));
  }


  /**
   * Test method for {@link Contract#setAddress(java.lang.String)}.
   * @throws Exception 
   */
  @Test
  final void testSetAddress() throws Exception {
    contract1.setAddress("New Address");
    assertTrue("New Address" == contract1.getAddress());
    assertThrows(Exception.class, () -> contract1.setAddress("This address is more than 30 chars"
        + "blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah"));
  }

}
