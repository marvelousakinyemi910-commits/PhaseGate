import java.util.Scanner;
public class TaskEight{
 public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.println("Enter a number :");
      

        int number = input.nextInt();
          int total = 0;
        while(number != 0){
        System.out.println("Enter a number :");
        
        number = input.nextInt();
         total += number;
}
        System.out.printf("%d%n", total);     


}

}
