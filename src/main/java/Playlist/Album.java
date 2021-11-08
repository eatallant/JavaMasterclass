// LINKED LIST CHALLENGE
// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

package Playlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private ArrayList<Song> songs;

    public Album() {
        songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public boolean removeSong(Song song) {
        if(songs.contains(song)) {
            songs.remove(song);
            return true;
        }
        return false;

    }

    public boolean removeSong(String title) {
        for(Song song : this.songs) {
            if(song.getTitle().equals(title)) {
                songs.remove(song);
                return true;
            }
        }
        return false;
    }

    public void printSongs() {
        for(int i = 0; i < songs.size(); i++) {
            System.out.println("Track " + (i+1) + ". " + songs.get(i).getTitle() + " " + songs.get(i).getDurationInMinutes());
        }
    }

    public Song chooseSong() {
        Scanner scanner = new Scanner(System.in);
        printSongs();
        System.out.print("Select a track number: ");
        int choice = scanner.nextInt();

        if(choice > 0 && choice <= songs.size()) {
            return songs.get(choice - 1);
        } else {
            throw new IllegalArgumentException("Selection not valid");
        }

    }
}
