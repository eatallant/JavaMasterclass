import Banking.Bank;
import Banking.Branch;
import Banking.Customer;
import Playlist.*;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testPlaylist();

    }

    public static void testBanking(String customerName, double transaction, String branchName, String bankName) {
        Customer customer = new Customer(customerName, transaction);
        Branch branch = new Branch(branchName);
        Bank bank = new Bank(bankName);

        branch.newCustomer(customer);
        bank.addNewBranch(branch);
        System.out.println(bank.getName());
    }

    public static void testPlaylist() {
        Song willow = new Song("Willow", 190);
        Song champagneProblems = new Song("Champagne Problems", 225);
        Album taylorSwift = new Album();
        taylorSwift.addSong(willow);
        taylorSwift.addSong(champagneProblems);

        Playlist pop = new Playlist("Pop");
        pop.addSong(taylorSwift);
    }

    public static void startPlaylist(Playlist playlist) {
        Scanner scanner = new Scanner(System.in);
        Iterator<Song> songsIterator = playlist.getSongs().iterator();
        System.out.println("Now playing: " + songsIterator.next() + "\n" +
                            "Menu -\n" +
                            "1. Next song\n" +
                            "2. Previous song\n" +
                            "3. Replay\n" +
                            "4. Quit");
        System.out.print("Choose option: ");
        int choice = scanner.nextInt();

    }


}
