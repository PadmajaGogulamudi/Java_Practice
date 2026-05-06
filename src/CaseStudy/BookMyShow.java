package CaseStudy;
class TicketBooking {
    private int availableSeats = 10;

    // synchronized method to avoid conflicts
    public synchronized void bookTicket(String user, int seats) {
        System.out.println(user + " trying to book " + seats + " seats");

        if (seats <= availableSeats) {
            System.out.println("Booking successful for " + user);
            availableSeats -= seats;
            System.out.println("Seats left: " + availableSeats);
        } else {
            System.out.println("Booking failed for " + user + " (Not enough seats)");
        }

        System.out.println("--------------------------------");
    }
}

// Thread class
class User extends Thread {
    TicketBooking booking;
    String name;
    int seats;

    User(TicketBooking booking, String name, int seats) {
        this.booking = booking;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        booking.bookTicket(name, seats);
    }
}

public class BookMyShow {
    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        User u1 = new User(booking, "User1", 4);
        User u2 = new User(booking, "User2", 5);
        User u3 = new User(booking, "User3", 3);

        u1.start();
        u2.start();
        u3.start();
    }
}