package org.example.bo;

import java.util.Scanner;

public class ALLInOneBookingService {

    private UpiPaymentService upiPaymentService;

    public ALLInOneBookingService(UpiPaymentService upiPaymentService) {
        this.upiPaymentService = upiPaymentService;
    }


    public boolean bookBusTickets() throws InterruptedException {
        int amount = 500;
        boolean isPaymentDone = false;

        System.out.println("Thanks For Choosing, UPI Payment Service");
        isPaymentDone = upiPaymentService.processPayment(amount);
        System.out.println("Payment Processed");
        System.out.println("Hurrey,Booking is Done");
        return isPaymentDone;
    }
}
