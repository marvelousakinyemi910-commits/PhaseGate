//import Random to generate 2 different random numbers (first and second number) 
// use a while loop to ensure that firstNumber is greater tham secondNumber to avoid negative answer
// initialise the random numbers 
//import Scanner to collect input
// ask user to enter a number up to 10 times using an outer while loop
// if user is wrong, ask again
// intialise score outside the loop
//if number is the same as answer, increment score
// Display the total of scores 




import java.util.Random;
import java .util.Scanner;

public class SimpleArithmeticApp{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random random = new Random();
   

    int score = 0;
    int count = 0;
    while (count < 10){
     int firstNum = random.nextInt(30) + 1;
     int secondNum = random.nextInt(20) + 1;
    int answer =  firstNum - secondNum;

        while(firstNum < secondNum){
        secondNum = random.nextInt(20) + 1;
        
        }
     System.out.printf("%d - %d = ", firstNum ,secondNum );
     int number = input.nextInt();

        if(number != answer){
          System.out.printf("%d - %d = ", firstNum ,secondNum );
           int again  = input.nextInt();
        }
        
        if(number == answer){
         score++;
            }
        

        count++;
        
 
    }
      System.out.printf("You got %d numbers correctly out of Ten ",score);      

    }










}
