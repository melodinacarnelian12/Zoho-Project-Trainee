class BookingFactory {//creating a new object on the main method
    public Booking createBooking(String t) {
        if (t.trim().equalsIgnoreCase("hotel")) {
            return new HotelBooking();
        } else if (t.trim().equalsIgnoreCase("flight")) {
            return new FlightBooking();
        } else if (t.equalsIgnoreCase("train")) {
            return new TrainBooking();
        } else {
            throw new IllegalArgumentException("Invalid booking type");
        }
    }
}