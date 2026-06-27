public class CashPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("\nPayment Mode : CASH");
        System.out.println("Amount Paid : Rs." + amount);
        System.out.println("Payment Successful.");
    }
}
