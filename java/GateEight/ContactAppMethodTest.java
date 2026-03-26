import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactAppMethodTest{
    @Test
    public void testThatContactDetailsIsAddSuccessfully(){
    ContactAppMethod testing = new  ContactAppMethod();
    String expected = "Contact Added successfully";
    String actual = testing.addContact("Marvellous","Akinyemi","0816599791");
    assertEquals(expected,actual);

}

    @Test
    public void testThatContactDetailsIsRemovedSuccessfully(){
    ContactAppMethod testing = new  ContactAppMethod();
     String expected = "contact successfully removed";
     String actual = testing.removeContact("Marvellous","Akinyemi","0816599791"); 
    
     assertEquals(expected,actual);

}

}
