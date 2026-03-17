import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Level4Test{
@Test
public void testAdditionOfTwoNumbers(){

    Level4 testing = new Level4();

    int actualResult = testing.addition(4,6);
    int expectedResult = 10;
    assertEquals(actualResult, expectedResult);


    }

@Test
    public void testAdditionOfTwoNumbers2(){

    Level4 testing = new Level4();

    int actualResult = testing.addition(6,6);
    int expectedResult = 12;
    assertEquals(actualResult, expectedResult);

}

@Test
public void testNumberIsEven(){

    Level4 testing = new Level4();
    
   boolean actualResult = testing.isEven(6);
   boolean expectedResult = true;
    assertEquals(actualResult, expectedResult);



}

    @Test
    public void testNumberIsOdd(){

    Level4 testing = new Level4();
    
   boolean actualResult = testing.isEven(7);
   boolean expectedResult = false;
    assertEquals(actualResult, expectedResult);


}

    @Test
    public void testSquareOfNumber(){

    Level4 testing = new Level4();
    
   int actualResult = testing.square(7);
   int expectedResult = 49;
    assertEquals(actualResult, expectedResult);


}

    @Test
    public void testSquareOfNumber2(){

    Level4 testing = new Level4();
    
   int actualResult = testing.square(8);
   int expectedResult = 64;
    assertEquals(actualResult, expectedResult);


}
 @Test
    public void testtemperatureConversion(){

    Level4 testing = new Level4();
    
   double actualResult = testing.fahrenheit(0);
   double expectedResult = 32;
    assertEquals(actualResult, expectedResult);


}
 @Test
    public void testtemperatureConversion2(){

    Level4 testing = new Level4();
    
   double actualResult = testing.fahrenheit(1);
   double expectedResult = 33.8;
    assertEquals(actualResult, expectedResult);


}
    @Test
    public void testLargestNumber(){

    Level4 testing = new Level4();
    
   double actualResult = testing.findLargest(3,4,8);
   double expectedResult = 8;
    assertEquals(actualResult, expectedResult);


}
    @Test
    public void testLargestNumber2(){

    Level4 testing = new Level4();
    
   double actualResult = testing.findLargest(3,40,8);
   double expectedResult = 40;
    assertEquals(actualResult, expectedResult);


}

     @Test
    public void testSimpleInterest(){

    Level4 testing = new Level4();
    
   double actualResult = testing.simpleInterest(3.0,40.0,8.0);
   double expectedResult = 9.6;
    assertEquals(actualResult, expectedResult);


}
     @Test
    public void testSimpleInterest2(){

    Level4 testing = new Level4();
    
   double actualResult = testing.simpleInterest(1.0,40.0,8.0);
   double expectedResult = 3.2;
    assertEquals(actualResult, expectedResult);


}

@Test
    public void testRectangleArea(){

    Level4 testing = new Level4();
    
   double actualResult = testing.area(1,8);
   double expectedResult = 8;
    assertEquals(actualResult, expectedResult);




}

    @Test
    public void testRectangleArea2(){

    Level4 testing = new Level4();
    
   double actualResult = testing.area(8,8);
   double expectedResult = 64;
    assertEquals(actualResult, expectedResult);




}
}
