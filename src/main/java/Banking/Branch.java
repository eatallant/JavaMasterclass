package Banking;

import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    //open new branch
    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public boolean newCustomer(String name, double initialDeposit) {
        if(!hasCustomer(name)) {
            customers.add(new Customer(name, initialDeposit));
            return true;
        }
        return false;
    }
    public boolean newCustomer(Customer customer) {
        if(!hasCustomer(customer)) {
            customers.add(customer);
            return true;
        }
        return false;
    }

    public void removeCustomer(Customer customer) {
        if(hasCustomer(customer)) {
            customers.remove(customer);
            System.out.println("Customer " + customer + "removed.");
        } else {
            System.out.println(customer + " does not exist");
        }
    }

    public boolean hasCustomer(String name) {
        for(Customer customer : customers) {
            if(Objects.equals(customer.getName(), name))
                return true;
        }
        return false;
    }

    public boolean hasCustomer(Customer customer) {
        return customers.contains(customer);
    }

    public String getName() {
        return name;
    }
}
