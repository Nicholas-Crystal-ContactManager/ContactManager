package Contact_Manager_CLI_App;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static Contact_Manager_CLI_App.Contact.mainFile;

public class MainApp {

    public static void main(String[] args) throws IOException {
      startApp();
    }

        public static void startApp() throws IOException {
            System.out.println("Would you like to view, add, or delete a contact?");
            System.out.println("1. View:  lets you input via search feature");
            System.out.println("2. Delete: lets you delete via search feature");
            System.out.println("3. Add: lets you add a name and number to a contact");
            System.out.println("4. All: view all current contacts");
            System.out.println("5. Exit: quits the program");

            String userInput = Input.getString();
            userInput = userInput.toLowerCase();
            if(userInput.equals("view") || userInput.equals("1")){
                System.out.println("Enter a name for who your trying to find");
                String find = Input.getString();
                Contact.FindContact(find);
                startApp();
            }
            else if(userInput.equals("delete") || userInput.equals("2")){
                System.out.println("Enter the name or number your trying to delete");
                String toDelete = Input.getString();
                Contact.DeleteContact(toDelete);
                startApp();
            }
            else if(userInput.equals("add") || userInput.equals("3")){
                System.out.println("Enter the contact name");
                String name = Input.getString();
                System.out.println("Enter the number for " + name);
                String number = Input.getString();
                Contact toAdd = new Contact(name, number);
                toAdd.Add();
                startApp();
            }
            else if(userInput.equals("all") || userInput.equals("4")){
                Contact.readContents();
                startApp();
            }
            else if(userInput.equals("exit") || userInput.equals("5")){
                System.out.println("Thanks for stopping by");
            }
            else{
                System.out.println("was not a valid input. Please try again");
                startApp();
            }
        }

}
