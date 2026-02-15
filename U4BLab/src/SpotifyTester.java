  import java.io.*;
import java.util.Scanner;
public class SpotifyTester {
 

public class SpotifyTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inF = new Scanner(new File("spotify_unique_25.txt"));
        System.out.println("Title\t\t\t\t Artist\t\t\t\t Album\t\t\t\t\t\t\t\t\t Duration \t\tYear \t\t\tGenre");
        while (inF.hasNextLine()) {
            String line = inF.nextLine();
            String arr[] = line.split(",");
            String name = arr[0];
            String artist = arr[1];
            String album = arr[2];
            int duration = Integer.parseInt(arr[3]);
            int release = Integer.parseInt(arr[4]);
            String genre = arr[5];
           Song out = new Song(name, artist, album, duration, release, genre);
           System.out.println(String.format("%-20s %-20s %-40s %-15d %-15d %-10s", name, artist,album, duration,release, genre));

        }
        inF.close();

    }
}

}
