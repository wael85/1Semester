import java.util.ArrayList;

public class TestHotel {
    public static void main(String[] args) {
        ArrayList<Guest> group = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            group.add(new Guest(""+i , i+345* 35));
        }
    }
}
