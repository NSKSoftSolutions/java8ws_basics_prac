package org.example.bo;

public class AirtellServices {


    WalletPaymentService walletPaymentService;

    public AirtellServices(WalletPaymentService walletPaymentService) {
        this.walletPaymentService = walletPaymentService;
    }

    public String rechargeSim(long simNumber, double amount, String plan) throws InterruptedException {
        String isRechargeSuccessFull = walletPaymentService.processPayments(simNumber, plan, amount);
        System.out.println("Recharge is Successful for SimNumber -- " + simNumber + " -- and plan is -- " + plan);
        return isRechargeSuccessFull;
    }


}
