import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
     private ArrayList<Song>songs = new ArrayList<>();
     public void readSong( String name){
         String []arr = name.split(",");
             String title = arr[0];
             String artist = arr[1];
             String album = arr[2];
             int duration = Integer.parseInt(arr[3]);
             int release = Integer.parseInt(arr[4]);
             String genre = arr[5];
             Song song = new Song(title, artist, album, duration, release, genre);
             songs.add(song);
             System.out.println(String.format("%-30s %-20s %-30s %-15d %-10s", title, artist,album,release, genre));
     }
     public void searchSong(String genre){
         boolean found = false;
        for(Song val: songs){
            if (val.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(val);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Genre not found");

         }

     }
     // use static because this doesn't belong to a specific object
    public static void sortArtist(Song[] song){

     }

}
