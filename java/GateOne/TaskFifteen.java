import java.util.Scanner;
public class TaskFifteen{
      public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number :");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number :");
        int thirdNumber = input.nextInt();

        int largest = firstNumber;
        
        if( secondNumber > largest  ){
            largest = secondNumber;
            if (thirdNumber > largest){
                largest = thirdNumber;

        }
        
     System.out.println( "largest number is : "  + largest);
    }
        
       

    } 





}
