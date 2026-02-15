public class Song {
  public class Song {
    private String title;
    private String artist;
    private String album;
    private int duration;
    private int year;
    private String genre;

    public Song(String t, String A, String a, int d, int y, String g){
        this.title = t;
        this.artist = A;
        this.album = a;
        this.year = y;
        this.genre = g;
        this.duration = d;
    }
    public void setDuration(int d){
        this.duration = d;
    }
    public int getDuration(){
        return duration;
    }

    public void setTitle(String t){
        this.title = t;
    }
    public void setArtist(String A){
        this.artist = A;
    }
    public void setAlbum(String a){
        this.album = a;
    }
    public void setYear(int y){
        this.year = y;
    }
    public void setGenre(String g){
        this.genre = g;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getAlbum(){
        return album;
    }
    public int getYear(){
        return year;
    }
    public String getGenre(){
        return genre;
    }
    public String toString(){
        return title + artist + album + year + genre;
    }
}

}
