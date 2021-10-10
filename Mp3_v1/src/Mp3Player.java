import java.util.ArrayList;

public class Mp3Player {
    private ArrayList<Song> songs;

    public Mp3Player(){
        songs = new ArrayList<>();
    }
    public Time getLength(){
        int second = 0;
        if (songs.size() != 0){
            for ( Song x : songs   ) {
                second += x.getLength().getTimeInSecond();
            }
        }
        return new Time(second);
    }
    public Song getSong(int index){
        return songs.get(index);
    }
    public void addSong(Song song){
        songs.add(song);
    }
    public int getNumberOfSongs(){
        return songs.size();
    }

    @Override
    public String toString() {
        String s ="Mp3Player{";
        for(Song x : songs){
            s += x.toString() +',';
        }
        // to remove the last ','
        String result = s.substring(0,s.length()-2);
        result += '}';
        return  result;

    }
}
