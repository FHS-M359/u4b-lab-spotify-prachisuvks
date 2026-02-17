import java.io.*;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) throws FileNotFoundException {
        Playlist playlist = new Playlist();
        Scanner inF = new Scanner(new File("spotify_unique_years_artists.txt"));
        System.out.println("Title\t\t\t\t\t\t Artist\t\t\t\t\tAlbum\t\t\t\t\t\t \t\tYear\t\t\tGenre");
        while(inF.hasNextLine()){
            playlist.readSong(inF.nextLine());
        }
        inF.close();
        Scanner scan = new Scanner(System.in);
        int option = 0;
        while(option != 7){
            System.out.println("====== Spotify Menu ======");
            System.out.println("1. Sort By Artist (A-Z)");
            System.out.println("2. Sort By Artist (Z-A)");
            System.out.println("3. Sort By Year (oldest - newest)");
            System.out.println("4. Sort By Year (newest - oldest)");
            System.out.println("5. Sort By Genre");
            System.out.println("6. Display all songs");
            System.out.println("7. Quit");
            System.out.println("Enter choice (1-7): ");


        }
        System.out.println("Enter a genre to search for:");
        String genre = scan.nextLine();
        System.out.print("Result: ");
        playlist.searchSong(genre);
        scan.close();

    }
}
