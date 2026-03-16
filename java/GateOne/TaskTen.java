import java.util.Scanner;
public class TaskTen{
      public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNum = input.nextInt();
        System.out.println("Enter second number :");
        int secondNum = input.nextInt();
        System.out.println("Enter third number :");
        int thirdNum = input.nextInt();

        int total = firstNum +  secondNum + thirdNum;
        double average = total / 3;
        System.out.println( "average is " + average);
    

    } 





}
