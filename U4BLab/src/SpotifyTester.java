
import java.io.*;
import java.util.Scanner;

public class SpotifyTester {
    //description: main method that uses songs from a file, displays a menu
    //input:users pick a number from 1 - 7
    //output: displays a menu sorted by the requirements 
    public static void main(String[] args) throws FileNotFoundException {
        Playlist playlist = new Playlist();
        Scanner inF = new Scanner(new File("spotify_unique_years_artists.txt"));
        while(inF.hasNextLine()){
            String line = inF.nextLine();
            playlist.readSong(line);
        }
        inF.close();
        Scanner scan = new Scanner(System.in);
        int option = 0;
        while (option != 7) {
            boolean good = true;
            System.out.println("====== Spotify Menu ======");
            System.out.println("1. Sort By Artist (A-Z)");
             System.out.println("2. Sort By Artist (Z-A)");
            System.out.println("3. Sort By Year (oldest - newest)");
            System.out.println("4. Sort By Year (newest - oldest)");
            System.out.println("5. Search by genre");
            System.out.println("6. Display all songs");
            System.out.println("7. Quit");
            System.out.println("Enter choice (1-7): ");
            try {
                option = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input numbers only");
                scan.nextLine();
                good = false;
            }
            if (option < 1 || option > 7) {
                System.out.println("Enter numbers in between 1 - 7");
            }
            if (option == 1) {
               playlist.sortArtistA();
               playlist.display();
            }
            else if (option == 2) {
                playlist.sortArtistZ();
                playlist.display();
            }
            else if (option == 3) {
                playlist.insertYearsOldFirst();
                playlist.display();
            }
            else if (option == 4) {
                playlist.insertYearsNewFirst();
               playlist.display();
            }
            else if (option == 5) {
                System.out.println("Enter a genre to search for:");
                String genre = scan.nextLine();
                System.out.print("Result: ");
                playlist.searchSong(genre);
            }
            else if (option == 6) {
                System.out.println("Title\t\t\t\t\t\t\tArtist\t\t\t\tAlbum\t\t\t\t\t\t\tYear\t\t\tGenre");
                playlist.display();
            }
            else if (option == 7) {
                System.out.println("Goodbye");
                scan.close();
            }
        }
    }
}
