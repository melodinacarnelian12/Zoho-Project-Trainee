import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookingSystem {//create an array list
    public static void main(String[] args) {
        List<Booking> bookings = new ArrayList<>();//Array List creation
        BookingFactory bookingFactory = new BookingFactory();//New object creation
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter booking type (hotel/train/flight) or 'exit' to quit:");
            String t = scanner.nextLine();

            if (t.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                Booking booking = bookingFactory.createBooking(t);
                bookings.add(booking);
                booking.book();
            } catch (Exception  e) {
                System.out.println("Invalid booking type. Please enter 'hotel' or 'flight' or 'train'");
            }
        }

        System.out.println("Bookings:");
        for (Booking booking : bookings) {//for each loop
            System.out.println(booking.getClass());
        }
    }
}
