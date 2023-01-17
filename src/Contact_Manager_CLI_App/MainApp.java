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
            System.out.println("view:  lets you input via search feature");
            System.out.println("delete: lets you delete via search feature");
            System.out.println("add: lets you add a name and number to a contact");
            System.out.println("all: view all current contacts");
            System.out.println("exit: quits the program");

            String userInput = Input.getString();
            switch (userInput) {
                case "view" -> {
                    System.out.println("Enter a name for who your trying to find");
                    String find = Input.getString();
                    Contact.FindContact(find);
                    startApp();
                }
                case "delete" -> {
                    System.out.println("Enter the name or number your trying to delete");
                    String toDelete = Input.getString();
                    Contact.DeleteContact(toDelete);
                    startApp();
                }
                case "add" -> {
                    System.out.println("Enter the contact name");
                    String name = Input.getString();
                    System.out.println("Enter the number for " + name);
                    String number = Input.getString();
                    Contact toAdd = new Contact(name, number);
                    toAdd.Add();
                    startApp();
                }
                case "all" -> {
                    Contact.readContents();
                    startApp();
                }
                case "exit" ->{
                    System.out.println("Thanks for stopping by");
                }

                default -> {
                    System.out.println("was not a valid input. Please try again");
                    startApp();
                }
            }
        }

}
