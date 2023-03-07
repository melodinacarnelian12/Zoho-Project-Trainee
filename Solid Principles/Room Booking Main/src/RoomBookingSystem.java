import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RoomBookingSystem {
    public static void main(String[] args) {
        List<Bookable> rooms = new ArrayList<>();
        rooms.add(new BookableImplementation("Room 1"));
        rooms.add(new BookableImplementation("Room 2"));
        rooms.add(new BookableImplementation("Room 3"));
        rooms.add(new BookableImplementation("Room 4"));
        BookingManager bookingManager = new RoomBookingManager(rooms);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Room Booking System.");
        while (true) {
            List<Bookable> availableRooms = bookingManager.getAvailableRooms();
            System.out.println("Enter 1 to view available rooms");
            System.out.println("Enter 2 to book a room");
            System.out.println("Enter 3 to exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                if (availableRooms.size() == 0) {
                    System.out.println("No rooms available.");
                } else {
                    for (Bookable room : availableRooms) {
                        System.out.println(room.getName());
                    }
                }
            }
            else if (choice == 2) {
                System.out.println("Enter the name of the room to book:");
                String roomName = scanner.nextLine();
                if (!bookingManager.bookRoom(roomName)) {
                    System.out.println("Your Room " + roomName + " is booked for you.");
                }else {
                    System.out.println("Room " + roomName + " is not available.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting Room Booking System");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}