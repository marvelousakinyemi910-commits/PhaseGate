import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Level5Test{
    @Test
    public void thatNumberInAnArrayIsPrime(){
    Level5 testing = new Level5 ();
    int [] numbers = {2,3,4,6,8,9};
    int [] actualResult = testing.getPrimeNumber(numbers);
    int [] expectedResult = {3,2};
    assertArrayEquals(actualResult, expectedResult);
    
    }

     @Test
    public void thatNegativeNumberIsReplaced(){
    Level5 testing = new Level5 ();
    int [] numbers = {2,-3,4,-6,-8,9};
    int [] actualResult = testing.replacingNegatives(numbers);
    int [] expectedResult = {2,0,4,0,0,9};
    assertArrayEquals(actualResult, expectedResult);
    
    }
    

    @Test
    public void thatZeroIsMoved(){
    Level5 testing = new Level5 ();
    int [] numbers = {2,0,4,0,0,9};
    int [] actualResult = testing.moveZeros(numbers);
    int [] expectedResult = {2,4,9,0,0,0};
    assertArrayEquals(actualResult, expectedResult);
    
    }








}
