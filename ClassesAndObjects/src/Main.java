package ClassesAndObjects.src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName().trim());
        System.out.println("length= "+ person.getFullName().length());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


        Bank customer1 = new Bank();
        Scanner sc = new Scanner(System.in);
        int amount;

        customer1.setAccountNumber(17230001953L);
        customer1.setPhoneNumber(7089182148L);
        customer1.setBalance(7_39_45_450);
        customer1.setCustomerName("Modit Parmar");
        customer1.setEmail("modit987@gmail.com");

        System.out.println("Hello "+customer1.getCustomerName()+"! Your account number is "+customer1.getAccountNumber()+"\n What you want to do?\nPress 1. for deposite.\n      2. for withdraw.");
        int choice = sc.nextInt();

        if (choice == 1){
            System.out.print("Enter ammount you want to deposite: \u20b9");
            amount = sc.nextInt();
            customer1.deposite(amount);
            sc.close();
        }
        else if(choice == 2){
            System.out.print("Enter ammount you want to withdraw: \u20b9");
            amount = sc.nextInt();
            customer1.withdraw(amount);
            sc.close();
        }
        else 
        System.out.println("Invalid choice.");
    }
}
