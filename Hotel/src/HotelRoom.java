public class HotelRoom {
   private int number;
   private String type;
   private double price;
   private Guest guest;

   public HotelRoom(int number , String type, double price){
       this.number = number;
       this.type = type;
       this.price = price;
       this.guest = null;
   }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public Guest getGuest() {
        return guest;
    }
    public int getFloor(){
       return (int)(Math.floor(number / 100));
    }
    public boolean isOccupied(){
      return guest != null;
    }
    public void registerGuest(Guest guest){
       this.guest = guest;
    }
    public void vacate(){
       this.guest = null;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", guest=" + guest +
                '}';
    }
    public static double getRoomPrice(String type){
         switch (type){
             case "Single":
                 return 59.50;
             case  "Double":
                 return 68.50;
             case "Family":
                 return 99.25;
             default:return 00.00;
         }
    }
}
