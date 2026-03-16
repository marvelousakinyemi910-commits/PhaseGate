import java.util.Scanner;
public class TaskSeventeen{
      public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password:");
        
        String password = input.nextLine();
       
        if(password.equalsIgnoreCase("admin123")){
    System.out.println("correct password");
    }
        
        else{
      System.out.println("incorrect password");
    

    }
      
        
    

    } 





}
