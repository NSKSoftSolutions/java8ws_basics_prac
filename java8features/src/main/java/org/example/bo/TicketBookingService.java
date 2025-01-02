package org.example.bo;

public class TicketBookingService {


    private final PaymentService paymentService;

    // Constructor for dependency injection
    public TicketBookingService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String bookTicketForMovie() throws InterruptedException {

        System.out.println("Booking the tickets");
        Thread.sleep(5000);
        System.out.println("Tickets Blocked");
        boolean isDone = paymentService.processPayment();
        if (isDone) {
            Thread.sleep(5000);
            System.out.println("Payment Processed Successfully");
            return "Tickets Booked";
        } else {
            Thread.sleep(5000);
            System.out.println("Payment not Processed, Please try again");
            return "Tickets not Booked";
        }

    }


}
