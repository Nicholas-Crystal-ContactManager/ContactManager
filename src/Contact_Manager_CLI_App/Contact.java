package Contact_Manager_CLI_App;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contact {
    private String name;
    private String number;
    private static String mainDir = "src/Contact_Manager_CLI_App/Contacts";
    private static String mainF = "Contacts.txt";
    Path mainDirectory = Paths.get(mainDir);
    static Path mainFile = Paths.get(mainDir, mainF);


    public Contact(String name, String number){
        this.name = name;
        number = "(" + number.substring(0,3) + ") " + number.substring(3,6) + " - " + number.substring(6);
        this.number = number;
    }

    public String Cname(){
        return name;
    }

    public String phoneNumber(){
        return  number;
    }

//    public void AddtoFile(String file , String dir){
//
//    }

    public void Add() throws IOException {

        String name =  String.format("|%-20s|", this.Cname());
        String number = String.format("%-10s|", this.phoneNumber());
        Files.write(
                mainFile,
                Arrays.asList(name+number), // list with one item
                StandardOpenOption.APPEND
        );

    }

    public static void readContents() throws IOException {
        List<String> contactList =  Files.readAllLines(mainFile);

        if(contactList.size() != 0){
            System.out.println("\n _____________________________________");
            System.out.printf("|        NAME        |     NUMBER     |\n");
            for (int i = 0; i <= contactList.size(); i += 1) {
                if (i == contactList.size()){
                    System.out.printf(" _____________________________________\n");
                }
                else{
                    System.out.println("|--------------------+----------------|");
                    System.out.println(contactList.get(i));
                }
            }
        }
        else{
            System.out.println("There is no contacts");
        }

    }

    public static void DeleteContact(String name) throws IOException {
        List<String> contactList =  Files.readAllLines(mainFile);
        int index=0;
        for (String list : contactList){
            if (list.contains(name)){
                break;
            }
            index++;
        }
        if (index == contactList.size()){
            System.out.println("could not find entry");
            return;
        }
        contactList.remove(index);
        Files.write(
                mainFile,
                contactList
        );
    }

    public static void FindContact(String name) throws IOException {
        List<String> contactList =  Files.readAllLines(mainFile);
        int index=0;
        for (String list : contactList){
            if (list.contains(name)){
                break;
            }
            index++;
        }
        if (index == contactList.size()){
            System.out.println("could not find entry");
            return;
        }
        System.out.println(contactList.get(index));
    }


}

