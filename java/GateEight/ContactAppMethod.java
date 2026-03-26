import java.util.ArrayList;
public class ContactAppMethod{
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
        contactApp.add (phoneNumber);
        
        if(contactApp.contains( phoneNumber)){
            contactApp.remove(phoneNumber);
        }

     return "contact successfully removed";





}

}
