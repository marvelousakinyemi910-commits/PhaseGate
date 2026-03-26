import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class ContactAppMethodTest{

    @Test
    public void testThatContactDetailsIsAddSuccessfully(){
    ContactAppMethod testing = new  ContactAppMethod();
    String expected = "Contact Added successfully";
    String actual = testing.addContact("Marvellous","Akinyemi","08160599791");
    assertEquals(expected,actual);

}

    @Test
    public void testThatContactDetailsIsRemovedSuccessfully(){
    ContactAppMethod testing = new  ContactAppMethod();
     String expected = "contact successfully removed";
     String actual = testing.removeContact("Marvellous","Akinyemi","08160599791"); 
    
     assertEquals(expected,actual);

}
    @Test
    public void testFirstNameIsReturnAfterSearchByPhoneNumber(){
    ContactAppMethod testing = new  ContactAppMethod();
     String expected = "Marvellous";
     String actual = testing.findContactByPhoneNumber("Marvellous","Akinyemi","08160599791"); 
    
     assertEquals(expected,actual);

}
    @Test
    public void testFirstNameIsReturnAfterSearchByFirstName(){
    ContactAppMethod testing = new  ContactAppMethod();
     String expected = "08160599791";
     String actual = testing.findContactByFirstName("Marvellous","Akinyemi","08160599791"); 
    
     assertEquals(expected,actual);


 }    
}
