
public class Test {
    public static void main(String[] args) {
        Song one = new Song("M","D", new Time(600));
        Song tow = new Song("M","D", new Time(100));
        Song three = new Song("M","D", new Time(400));

        Mp3Player myMp3 = new Mp3Player();
        myMp3.addSong(one);
        myMp3.addSong(tow);
        myMp3.addSong(three);
        System.out.println(myMp3);

    }
}
