import java.util.Scanner;
public class TaskNine{
      public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of an item :");
        
        int price  = input.nextInt();
        
        int tax  = price / 10;
        int total = tax + price;
        
      
        System.out.println(total);
    

    } 





}
