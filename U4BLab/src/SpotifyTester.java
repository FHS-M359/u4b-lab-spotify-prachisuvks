import java.io.*;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) throws FileNotFoundException {
        Playlist playlist = new Playlist();
        Scanner inF = new Scanner(new File("spotify_unique_years_artists.txt"));
        //System.out.println("Title\t\t\t\t\t\t Artist\t\t\t\t\tAlbum\t\t\t\t\t\t \t\tYear\t\t\tGenre");
        while(inF.hasNextLine()){
            playlist.readSong(inF.nextLine());
        }
        inF.close();
        Scanner scan = new Scanner(System.in);
        int option = 0;

        //System.out.println("====== Spotify Menu ======");System.out.println("====== Spotify Menu ======");
        //System.out.println("1. Sort By Artist (A-Z)");
        //System.out.println("2. Sort By Artist (Z-A)");
        //System.out.println("3. Sort By Year (oldest - newest)");
        //System.out.println("4. Sort By Year (newest - oldest)");
        // try {
            //option = scan.nextInt();
            //scan.nextLine();
            //if (option < 1 || option > 7) {
                //System.out.println("Enter numbers in between 1 - 7");
                //}
            // if (option == 1) {
                // playlist.sortArtistA();
                //System.out.println("1. Sort By Artist (A-Z)");
                //System.out.println(playlist);
                //}
            //   if(option == 2) {
                // playlist.sortArtistZ();
                //System.out.println("2. Sort By Artist (Z-A)");
                //System.out.println(playlist);
                //}
            //System.out.println("3. Sort By Year (oldest - newest)");
            //System.out.println("4. Sort By Year (newest - oldest)");
            //if(option == 5) {
                //System.out.println("Enter a genre to search for:");
                //String genre = scan.nextLine();
                //System.out.print("Result: ");
                //playlist.searchSong(genre);
                //}
            // if(option == 6) {
                // System.out.println("6. Display all songs");
                //}
            //  if(option == 7) {
                // System.out.println("7. Quit");
                // }
            // System.out.println("Enter choice (1-7): ");
            // option = scan.nextInt();
            // scan.nextLine();
            //}catch(Exception e){
            //System.out.println("Invalid input numbers only");
            //}
        System.out.println("sorting by artist A to z");
        playlist.sortArtistA();
        playlist.artists();
        System.out.println("sorting by artist a to z");
        playlist.sortArtistZ();
        playlist.artists();
        scan.close();


    }
}
