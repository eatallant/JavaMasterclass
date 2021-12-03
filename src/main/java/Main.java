import Banking.Bank;
import Banking.Branch;
import Banking.Customer;
import Playlist.Album;
import Playlist.Playlist;
import Playlist.Song;

public class Main {
    public static void main(String[] args) {



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

        Playlist.startPlaylist(pop);
    }




}
