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

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private String name;
    private LinkedList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new LinkedList<Song>();
    }

    public void addSong(Album album) {
        Song song = album.chooseSong();
        songs.add(song);
        System.out.println(song.getTitle() + " was added to " +  name);
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public static void startPlaylist(Playlist playlist) {
        ListIterator<Song> songsIterator = playlist.getSongs().listIterator();
        Song current = songsIterator.next();

        switch (playlistMenu(current)) {
            case 1:

        }

    }

    private static int playlistMenu(Song song) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now playing: " + song.getTitle() + "\n" +
                "Menu -\n" +
                "1. Next song\n" +
                "2. Previous song\n" +
                "3. Replay\n" +
                "4. Quit");
        System.out.print("Choose option: ");
        return scanner.nextInt();
    }


}
