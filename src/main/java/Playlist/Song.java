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

public class Song {
    private String title;
    private int durationSeconds;

    public Song(String title, int durationSeconds) {
        if(durationSeconds < 0) {
            throw new IllegalArgumentException("Duration must be greater than zero");
        }
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getDurationInMinutes() {
        return Integer.toString(durationSeconds / 60) + ":" + Integer.toString(durationSeconds % 60);
    }

    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
}
