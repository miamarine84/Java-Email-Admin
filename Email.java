package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    // Where we receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " "+ this.lastName);
    // Asking for department
        this.deparment = setDepartment();
    }

    private String setDepartment(){
        System.out.print("Enter the deparment \n1. for Sales\n2. for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){
            return "sales";
        }else if(depChoice == 2){
            return "dev";
        }else if(depChoice == 3){
            return "accounting";
        }else{
            return "";
        }
    }
    // Generate a random password
    // Set mailbox capacity
    // Set alternate email
    // Change password
}
