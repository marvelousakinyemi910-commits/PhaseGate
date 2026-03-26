import java.util.Scanner;
public class ContactApp{
    static Scanner input = new Scanner(System.in);

    public static void addContact(){
    
       System.out.println("Enter First Name: ");
     String firstName = input.nextLine(); 
       System.out.println("Enter Last Name: ");
     String lastName = input.nextLine(); 
       System.out.println("Enter Phone number: ");
      String phoneNumber = input.nextLine();
 
       System.out.println("Contact added succefully");

    }


    public static void removeContact(){
        System.out.println("Enter Phone number to delete:  ");
        String phoneNumber = input.nextLine();
         System.out.println("Contact removed succefully");
}

    public static void findContact(){
        System.out.println("Enter Phone number to delete:  ");
        String phoneNumber = input.nextLine();
         System.out.println("Contact found succefully");

         
            

        }
    



    public static void main(String[] args){

    addContact();
    removeContact();         
  
  
     
     }   
}
