import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class WeekendSnacksTest{
    @Test
    public void testNumberOfEvenNumbers(){
        WeekendSnacks testing = new  WeekendSnacks();
        int[] numbers = {9,4,5,6,8,7};
        int actualResult = testing.countEven(numbers);
        int expectedResult = 3;
        assertEquals(actualResult, expectedResult);


        }

    @Test
    public void testThatTargetIsInTheArray(){
        WeekendSnacks testing = new  WeekendSnacks();
        int[] numbers = {9,4,5,6,8,7};
        int target = 4;
        int actualResult = testing.linearSearch(numbers, target);
        int expectedResult = 1;
        assertEquals(actualResult, expectedResult);

        }
      @Test
      public void testThatTargetIsNotInArray(){
        WeekendSnacks testing = new  WeekendSnacks();
        int[] numbers = {9,4,5,6,8,7};
        int target = 1;
        int actualResult = testing.linearSearch(numbers,target);
        int expectedResult = -1;
        assertEquals(actualResult, expectedResult);

    }

     @Test
    public void testSquares(){
        WeekendSnacks testing = new  WeekendSnacks();
    
        int[] actualResult = testing.squares(4);
        int[] expectedResult = {1,4,9,16}; 
        assertArrayEquals(actualResult, expectedResult);

        }
    @Test
    public void testThatLengthOfTwoArraysIsNotEqual(){
        WeekendSnacks testing = new  WeekendSnacks();
        int [] firstArray = {2,3,4,5,6};
        int [] secondArray = {1,2,3,4};
        assertFalse(testing.arrayEquals(firstArray,secondArray));
       
    }

    @Test
    public void testThatLengthOfTwoArraysIsEqual(){
        WeekendSnacks testing = new  WeekendSnacks();
        int [] firstArray = {2,3,4,5,6};
        int [] secondArray = {2,3,4,5,6};
        assertTrue(testing.arrayEquals(firstArray,secondArray));
       
   }
    public void testFlatten(){
        WeekendSnacks testing = new  WeekendSnacks();
        int[][] arrays = {{2,3,4,5,6}, {7,8,9},{11,12,13}};
        int [] expectedResult = {2,3,4,5,6,7,8,9,11,12,13};
        int [] actualResult = testing.flatten(arrays);
        assertArrayEquals(actualResult, expectedResult);
        
}
}



