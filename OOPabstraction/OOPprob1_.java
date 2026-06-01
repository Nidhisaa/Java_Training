package OOPabstraction;
// description of this question 
// In this code, we have an abstract class Ticket that serves as a blueprint for different types of tickets (BusTicket, TrainTicket, FlightTicket).
//  Each subclass extends the Ticket class and provides its own implementation of the generateTicket method, which demonstrates polymorphism. 
// In the main method, we create an array of Ticket references that point to different types of tickets, and when we call the generateTicket method on each reference, it executes the overridden method based on the actual object type at runtime. 
// This allows us to treat different ticket types uniformly while still maintaining their specific behaviors.
//  The output of this code will be:

public class OOPprob1_ {

    static class Ticket {
        protected int ticketNumber;
        protected String passengerName;

        public Ticket(int ticketNumber, String passengerName) {
            this.ticketNumber = ticketNumber;
            this.passengerName = passengerName;
        }

        public void generateTicket() {
            System.out.println("--- Generic Ticket ---");
            System.out.println("Passenger : " + passengerName);
            System.out.println("Ticket No.: " + ticketNumber);
        }
    }

    static class BusTicket extends Ticket {
        private String boardingPoint;

        public BusTicket(int ticketNumber, String passengerName, String boardingPoint) {
            super(ticketNumber, passengerName);
            // super is to access keyword in the parent cls 
            // and to call the constructor of the parent class (Ticket) to initialize the common attributes (ticketNumber and passengerName).
            this.boardingPoint = boardingPoint;
        }

        @Override
        public void generateTicket() {
            System.out.println("----- Bus Ticket -----");
            System.out.println("Passenger    : " + passengerName);
            System.out.println("Ticket No.   : " + ticketNumber);
            System.out.println("Boarding Pt. : " + boardingPoint);
        }
    }

    static class TrainTicket extends Ticket {
        private String coachType;

        public TrainTicket(int ticketNumber, String passengerName, String coachType) {
            super(ticketNumber, passengerName);
            this.coachType = coachType;
        }

        @Override
        // This method demonstrates polymorphism by overriding the generateTicket method to provide specific details for a train ticket.
        // overriding allows us to provide a specific implementation of a method that is already defined in the parent class (Ticket).
        public void generateTicket() {
            System.out.println("----- Train Ticket -----");
            System.out.println("Passenger : " + passengerName);
            System.out.println("Ticket No.: " + ticketNumber);
            System.out.println("Coach Type: " + coachType);
        }
    }

    static class FlightTicket extends Ticket {
        private String flightClass;

        public FlightTicket(int ticketNumber, String passengerName, String flightClass) {
            super(ticketNumber, passengerName);
            this.flightClass = flightClass;
        }

        @Override
        public void generateTicket() {
            System.out.println("----- Flight Ticket -----");
            System.out.println("Passenger   : " + passengerName);
            System.out.println("Ticket No.  : " + ticketNumber);
            System.out.println("Flight Class: " + flightClass);
        }
    }

    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[3];

        tickets[0] = new BusTicket(1001, "Alice Johnson", "Downtown Bus Stand");
        tickets[1] = new TrainTicket(2002, "Bob Smith", "AC First Class");
        tickets[2] = new FlightTicket(3003, "Carol Lee", "Business");

        // Demonstrate polymorphism - same reference type, different runtime types
        for (Ticket t : tickets) {
            t.generateTicket();
            System.out.println();
        }
    }

}
// explanation of this code is in OOPprob1.java
// This code demonstrates the concept of abstraction and polymorphism in Java through a ticketing system.
// In this example, We have a base class Ticket that contains common attributes and a method to generate a generic ticket. 
// We then have three subclasses (BusTicket, TrainTicket, FlightTicket) that extend the Ticket class and override the generateTicket method to provide specific details for each type of ticket.
// In the main method, we create an array of Ticket references that point to different types of tickets, demonstrating polymorphism as we call the generateTicket method on each ticket reference, which executes the overridden method based on the actual object type at runtime.
// Polymorphism allows us to treat objects of different classes through a common interface (in this case, the Ticket class) while still invoking the specific behavior defined in each subclass.


//prob explanation
// In this code, we have an abstract class Ticket that serves as a blueprint for different types of tickets (BusTicket, TrainTicket, FlightTicket). Each subclass extends the
// Ticket class and provides its own implementation of the generateTicket method, which demonstrates polymorphism. In the main method, we create an array of Ticket references that point to different types of tickets, and when we call the generateTicket method on each reference, it executes the overridden method based on the actual object type at runtime. This allows us to treat different ticket types uniformly while still maintaining their specific behaviors.
// The output of this code will be:
/*
----- Bus Ticket -----
Passenger    : Alice Johnson
Ticket No.   : 1001
Boarding Pt. : Downtown Bus Stand

----- Train Ticket -----
// Passenger : Bob Smith
// Ticket No.: 2002 
// Coach Type: AC First Class

----- Flight Ticket -----
// Passenger   : Carol Lee
// Ticket No.  : 3003   
// Flight Class: Business


*/