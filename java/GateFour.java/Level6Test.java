import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class Level6Test{
    @Test
     public void testSpiltEvenAndOddNumbers(){
    Level6 testing = new Level6 ();

    int [] numbers = {2,3,4,6,8,9};
    int [][] actualResult = testing.splitEvenOdd(numbers);
    int []  expectedOdd = {3,9} ;
    int []  expectedEven = {2,4,6,8};

    assertArrayEquals(actualResult[0], expectedOdd);
    assertArrayEquals(actualResult[1], expectedEven);
    }



     @Test
     public void testThatNumberInArrayIsPalindromeIsTrue(){
    Level6 testing = new Level6 ();

    int [] numbers = {1,2,1};
    boolean  actualResult = testing.isPalindrome(numbers);
  
   
    assertTrue(actualResult);
    }

        @Test
     public void testThatNumberInArrayIsPalindromeIsFalse(){
    Level6 testing = new Level6 ();

    int [] numbers = {1,2,3};
    boolean  actualResult = testing.isPalindrome(numbers);
  
   
    assertFalse(actualResult);
    }


     @Test
     public void testPerfectSquare(){
    Level6 testing = new Level6 ();

    int [] numbers = {1,2,3,4,6,8,9};
    int [] actualResult = testing.perfectSquares(numbers);
  
    int []  expectedResult = {1,4,9};

 
    assertArrayEquals(actualResult, expectedResult);
    }


    @Test
     public void testThatNonPerfectSquareIsReplaced(){
    Level6 testing = new Level6 ();

    int [] numbers = {1,2,3,4,6,8,9};
    int [] actualResult = testing.replaceNonPerfectSquares(numbers);
  
    int []  expectedResult = {1,-1,-1,4,-1,-1,9};

 
    assertArrayEquals(actualResult, expectedResult);
    }




    }
