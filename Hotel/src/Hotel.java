import java.util.ArrayList;

public class Hotel {
    private String name;
    private HotelRoom[] rooms;

    public Hotel( String name, HotelRoom[] rooms){
        HotelRoom[] defaultRooms = new HotelRoom[1];
        defaultRooms[0] =new HotelRoom(101,"Single",HotelRoom.getRoomPrice("Single"));
        this.name = name;
        this.rooms = rooms.length > 0 ?  rooms : defaultRooms;

    }

    public String getName() {
        return name;
    }
    public int getNumberOfRooms(){
        return rooms.length;
    }
    public int getNumberOfAvailableRooms(){
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isOccupied()){
                count++;
            }
        }
        return count;
    }
    public int getNumberOfAvailableRooms(String roomType){
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isOccupied() && rooms[i].getType().equals(roomType)){
                count++;
            }
        }
        return count;
    }
    public HotelRoom getTheFirstAvailableRoom(){
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isOccupied()){
                return rooms[i];
            }
        }
        return null;
    }
    public HotelRoom getTheFirstAvailableRoom(double maxPrice){
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isOccupied() && rooms[i].getPrice() < maxPrice){
                return rooms[i];
            }
        }
        return null;
    }
    public HotelRoom[] getAllAvailableRooms(String roomType){
        ArrayList<HotelRoom> availableRooms = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isOccupied() && rooms[i].getType().equals(roomType)){
                availableRooms.add(rooms[i]);
                count++;
            }
        }
        return availableRooms.toArray(new HotelRoom[count]);
    }
    public boolean hasGuest(Guest guest){
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isOccupied() && rooms[i].getGuest().equals(guest)){
                return true;
            }
        }
        return false;
    }
    public HotelRoom getRoom(Guest guest){
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isOccupied() && rooms[i].getGuest().equals(guest)){
                return rooms[i];
            }
        }
        return null;
    }

}
