import java.util.ArrayList;
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
             //System.out.println(String.format("%-30s %-20s %-30s %-15d %-10s", title, artist,album,release, genre));
     }
     public void searchSong(String genre){
         boolean found = false;
        for(Song val: songs){
            if (val.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(val.getTitle());
                found = true;
            }
        }
        if(!found) {
            System.out.println("Genre not found");

         }

     }
     public String toString(){
         String result = "";
         for(Song val: songs){
            result += val;
         }
         return result;
     }
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
         public void sortArtistZ(){
             for(int i = 0; i < songs.size()-1; i++){
                 int max_index = i;
                 for(int j = i + 1; j < songs.size(); j++){
                     if(songs.get(j).getArtist().compareToIgnoreCase(songs.get(max_index).getArtist()) > 0){
                         max_index = j;
                     }
                 }
                 Song temp = songs.get(i);
                 songs.set(i, songs.get(max_index));
                 songs.set(max_index, temp);
             }
        }
        public void artists(){
         for(Song s: songs){
             System.out.println(s.getArtist());
         }
        }
    }




