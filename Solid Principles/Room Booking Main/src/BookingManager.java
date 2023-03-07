import java.util.List;

interface BookingManager {
    List<Bookable> getAvailableRooms();
    boolean bookRoom(String roomName);
   // public boolean bookDelay(String roomName);
}