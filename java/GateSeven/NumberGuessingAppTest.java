import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class NumberGuessingAppTest{
    @Test
    public void testRating(){
    NumberGuessingApp testing = new NumberGuessingApp();
    
    String expected  = "Legendary";
    String actual = testing.rating(1);
    assertEquals(expected,actual);
    
 
    
}
 @Test
    public void testThatUserInputIsNotValid(){
    NumberGuessingApp testing = new NumberGuessingApp();
    
    String expected  = "Number should be between 1 and 100";
    String actual = testing.validateUserInput(101);
    assertEquals(expected,actual);




}
   @Test
    public void testRating2(){
    NumberGuessingApp testing = new NumberGuessingApp();
    
    String expected  = "Good";
    String actual = testing.rating(4);
    assertEquals(expected,actual);

}
}
