import java.util.Scanner;
public class TaskFourteen{
      public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number :");
        int secondNumber = input.nextInt();
        
        int largest = firstNumber;
        
        if( secondNumber > largest){
            largest = secondNumber;
        
     System.out.println( "larger number is : " + largest);
    }
        
       

    } 





} 
