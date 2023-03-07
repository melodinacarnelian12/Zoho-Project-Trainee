import java.util.ArrayList;
import java.util.List;

class RoomBookingManager implements BookingManager {
    public List<Bookable> rooms;

    public RoomBookingManager(List<Bookable> rooms) {
        this.rooms = rooms;
    }
    public List<Bookable> getAvailableRooms() {
        List<Bookable> availableRooms = new ArrayList<>();
        for (Bookable room : rooms) {
        //    if (!room.isBooked()) {
            if (!room.isBooked()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public boolean bookRoom(String roomName) {
        for (Bookable room : rooms) {
            if (room.getName().equals(roomName)) {
                return room.book();
            }
        }
        return false;
     //   return true;
    }

//    public boolean bookDelay(String roomName,int Number_of_Days){
//        for (Bookable room : rooms) {
//            if (room.getName().equals(roomName)) {
//                return room.book();
//            }
//        }
//        return false;
//    }
}