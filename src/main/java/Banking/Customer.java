package Banking;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    // open account. initial transaction required.
    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(transaction);
    }

    public void deposit(double amount) {
        transactions.add(amount);
    }

    public void withdraw(double amount) {
        amount *= -1;
        transactions.add(amount);
    }

    // remove the lowest index of amount, -1 if not found
    public int removeTransaction(double amount) {
        if(hasTransaction(amount)) {
          int i = findTransaction(amount);
          transactions.remove(i);
          return i;
        }
        return -1;
    }

    public void removeLastTransaction() {
        if(transactions.size() > 0) {
            System.out.println("Removed transaction " + transactions.get(transactions.size() - 1));
            transactions.remove(transactions.size() - 1);
        } else {
            System.out.println("No transactions for customer " + name);
        }
    }

    //return lowest index of amount, -1 if not found
    public int findTransaction(double amount) {
        if(hasTransaction(amount)) {
            for(int i = 0; i < transactions.size(); i++) {
                if(transactions.get(i) == amount)
                    return i;
            }
        }
        return -1;
    }

    public boolean hasTransaction(double amount) {
        return transactions.contains(amount);
    }

    public void printTransactions() {
        for (Double transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public String getName() {
        return name;
    }


}