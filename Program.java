import java.util.List;
import java.util.Scanner;

public class Program {
        // Main method for testinbg
    
        public static void main(String[] args) {
            // Create a ContactManager object
            ContactManager manager = new ContactManager();
            
        
            // Add contacts
            manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
            manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));
            manager.addContact(new Contact("Peter", "peter@gmail.com", "067-765-4451"));
            // List contacts
            manager.listContacts();
    
            // Remove a contact
            manager.removeContact("Peter");

            // List contacts again to see the change
            manager.listContacts();
        }
}
