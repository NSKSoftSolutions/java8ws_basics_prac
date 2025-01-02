package org.example.bo;

public class WalletPaymentService {

    public boolean processPayment(int amount) {
        return true;
    }

    public String processPayments(long simNumber, String plan, double amount) throws InterruptedException {

        System.out.println("Inside the WalletPayment Service class -- processPayment()");
        System.out.println("Processing Payment for plan -- " + plan + "and the Amount is --" + amount);
        Thread.sleep(10000);
        System.out.println("Amount --" + amount + "is Debited from the wallet");
        System.out.println("Payment Processed Successfully");
        return "success";
    }
}
