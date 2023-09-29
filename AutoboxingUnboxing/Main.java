package AutoboxingUnboxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialTransaction) {
        this(name.toUpperCase(), new ArrayList<>(500));
        transactions.add(initialTransaction);
    }
}
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        bank.addNewCustomer("Mahesh", 5000);
        bank.addNewCustomer("suresh", 2000);

        System.out.println(bank);
    }
}

class Bank {
    String name;
    private final ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName) {
        for (var customer : customers){
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }

//        System.out.printf("Customer (%s) not found.",customerName);
        return null;
    }

    public void addNewCustomer(String name, double initialDeposit) {
        if(getCustomer(name) == null) {
            Customer customer = new Customer(name, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }
}