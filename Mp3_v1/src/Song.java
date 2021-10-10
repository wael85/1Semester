import java.lang.Object.*;
public class Song {
    private String title;
    private String artist;
    private Time length;

    public Song(String title, String artist ,  Time length){
        this.title = title;
        this.artist = artist;
        if (length == null){
            this.length = new Time(30);
        }else this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public Time getLength() {
        return length;
    }
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", length=" + length +
                '}';
    }
}
