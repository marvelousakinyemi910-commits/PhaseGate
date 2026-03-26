import java.util.ArrayList;
public class ContactAppMethod{
    public int getLengthOfPhoneNumber(String phoneNumber){
        
       int lengthOfPhoneNumber = phoneNumber.length();

        
        return lengthOfPhoneNumber;
        

        }
    public String addContact (String firstName, String lastName, String phoneNumber){
        ArrayList<String> contactApp = new ArrayList <> ();
        contactApp.add(firstName);
        contactApp.add(lastName);
        contactApp.add(phoneNumber);

    return "Contact Added successfully";



}
    public String removeContact (String firstName, String lastName, String phoneNumber){
         ArrayList<String> contactApp = new ArrayList <> ();
         contactApp.add(firstName);
         contactApp.add(lastName);
         contactApp.add(phoneNumber);
        if(contactApp.contains(phoneNumber)){
           contactApp.remove(phoneNumber);
        }
         return "contact successfully removed";

}

   public String findContactByPhoneNumber(String firstName, String lastName, String phoneNumber){
    
        ArrayList<String> contactApp = new ArrayList <> ();
    
        contactApp.add(firstName);
         contactApp.add(lastName);
         contactApp.add(phoneNumber);

       
        if(contactApp.contains(phoneNumber)){
            
            return firstName;
         }  
        return null;
}

    public String findContactByFirstName(String firstName, String lastName, String phoneNumber){
        
         ArrayList<String> contactApp = new ArrayList <> ();
    
         contactApp.add(firstName);
         contactApp.add(lastName);
         contactApp.add(phoneNumber);
        if(contactApp.contains(firstName)){
            
            return phoneNumber;
         }  
         return null;
    }
}

