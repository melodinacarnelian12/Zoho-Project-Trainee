class BookableImplementation  implements Bookable {
    public String name;
    public  boolean booked;

    public BookableImplementation(String name) {
        this.name = name;
        this.booked =false;
    }

    public boolean book() {
        if (booked) {
            return false;
        } else {
            booked = true;
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isBooked() {
        return booked;
    }
}
