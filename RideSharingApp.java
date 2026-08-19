class Driver {
    String name;
    String status;

    Driver(String name, String status) {
        this.name = name;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Driver: " + name);
        System.out.println("Status: " + status);
    }
}

class TripBooking {
    String tripId;
    Driver driver;

    TripBooking(String tripId, Driver driver) {
        this.tripId = tripId;
        this.driver = driver;
    }

    void changeDriverStatus(String newStatus) {
        driver.status = newStatus;
    }

    void displayBooking() {
        System.out.println("Trip ID: " + tripId);
        driver.displayStatus();
        System.out.println();
    }
}

public class RideSharingApp {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Rahul", "Available");

        TripBooking booking1 = new TripBooking("T101", driver1);
        TripBooking booking2 = new TripBooking("T102", driver1);

        System.out.println("Before changing status:");
        booking1.displayBooking();
        booking2.displayBooking();

        booking1.changeDriverStatus("Busy");

        System.out.println("After changing status through Booking 1:");
        booking1.displayBooking();
        booking2.displayBooking();
    }
}
