import Banking.*;

public class Main {
    public static void main(String[] args) {

        Customer frank = new Customer("Frank", 100.00);
        Branch east = new Branch("East");
        Bank newBank = new Bank("Commerce");

        east.newCustomer(frank);
        newBank.addNewBranch(east);
        System.out.println(newBank.getName());


    }


}
