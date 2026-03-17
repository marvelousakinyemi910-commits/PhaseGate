import java.util.Scanner;
public class TaskSeven{
 public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
       int total = 0;
    for(int count = 0; count < 5; count++){
        System.out.println("Enter a number :");
        int number = input.nextInt();
     
        total += number;

}
    System.out.printf("%d%n", total);     

}

}
