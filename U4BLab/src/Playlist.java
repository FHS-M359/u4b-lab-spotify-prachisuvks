
import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> songs = new ArrayList<>();
    //description:reads from the file, splits it by commas
    //input: creates a song object and adds it to the playlist
    //output:
    public void readSong(String line) {
        String[] arr = line.split(",");
        String title = arr[0];
        String artist = arr[1];
        String album = arr[2];
        int duration = Integer.parseInt(arr[3]);
        int release = Integer.parseInt(arr[4]);
        String genre = arr[5];
        Song song = new Song(title, artist, album, duration, release, genre);
        songs.add(song);

    }
    //description:filters all songs with and prints songs from that genre
    //input:users enter the genre they want to use
    //output: return songs from the genre
    public void searchSong(String genre) {
        boolean found = false;
        for (Song val : songs) {
            if (val.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(val.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Genre not found");
        }
    }
    //description:formats all the variables
    //input:
    //output:prints the playlist
    public void display() {
        for (Song val : songs) {
            System.out.println(String.format("%-30s %-20s %-30s %-15d %-10s", val.getTitle(), val.getArtist(), val.getAlbum(), val.getYear(), val.getGenre()));
        }

    }
    //description: sorts all the artist from oldest to newest
    //input:
    //output:
    // use static because this doesn't belong to a specific object
    public void sortArtistA() {
        for (int i = 0; i < songs.size() - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < songs.size(); j++) {
                if (songs.get(j).getArtist().compareToIgnoreCase(songs.get(min_index).getArtist()) < 0) {
                    min_index = j;
                }
            }
            Song temp = songs.get(i);
            songs.set(i, songs.get(min_index));
            songs.set(min_index, temp);
        }
    }
    //description: sorts all the artist from newest to oldest
    //input:
    //output:
    public void sortArtistZ() {
        for (int i = 0; i < songs.size() - 1; i++) {
            int max_index = i;
            for (int j = i + 1; j < songs.size(); j++) {
                if (songs.get(j).getArtist().compareToIgnoreCase(songs.get(max_index).getArtist()) > 0) {
                    max_index = j;
                }
            }
            Song temp = songs.get(i);
            songs.set(i, songs.get(max_index));
            songs.set(max_index, temp);
        }
    }

    //description: sorts all the songs based on the release dates(OLDEST TO NEWEST)
    //input:
    //output:
    public void insertYearsOldFirst() {
        for (int i = 1; i < songs.size(); i++) {
            int tempValue = songs.get(i).getYear();
            int position = i;
            while (position > 0 && songs.get(position - 1).getYear() > tempValue) {
                songs.get(position).setYear(songs.get(position - 1).getYear());
                position--;
            }
            songs.get(position).setYear(tempValue);
        }
    }

    //description:sorts all the songs based on the release date(NEWEST TO OLDEST)
    //input:
    //output:
    public void insertYearsNewFirst(){
        for(int i = 1; i < songs.size(); i++){
            int tempValue = songs.get(i).getYear();
            int position = i;
            while(position > 0 && songs.get(position - 1).getYear() < tempValue){
                songs.get(position).setYear(songs.get(position -1).getYear());
                position--;
            }
            songs.get(position).setYear(tempValue);
        }
    }
}









