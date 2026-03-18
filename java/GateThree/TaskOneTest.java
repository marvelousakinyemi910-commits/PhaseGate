import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class TaskOneTest{
    @Test
    public void testTheLengthOfTheArray(){
    TaskOne testing = new TaskOne();
    int [] numbers = {10,11,12,13,14};
    int number = 2;
    int [] actualResult = testing.reduceLength(numbers,number);
    int [] expectedResult = {10,11};
    assertArrayEquals(actualResult, expectedResult);


    }

    @Test
    public void testTheDefaultNumOfTheArray(){
    TaskOne testing = new TaskOne();
    int [] numbers = {10,11,12};
    int number = 5;
    int [] actualResult = testing.fillDefault(numbers,number);
    int [] expectedResult = {10,11,12,-1,-1};
    assertArrayEquals(actualResult, expectedResult);

    }

    @Test
    public void testTheFillingNumOfTheArray(){
    TaskOne testing = new TaskOne();
    int number = 5;
    int [] numbers =  new int [number];
   
    int [] actualResult = testing.fillEmptyArray(number);
    int [] expectedResult = {-1,-1,-1,-1,-1};
    assertArrayEquals(actualResult, expectedResult);

    }









}
