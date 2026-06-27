import java.util.Scanner;

public class UpiPayment extends Payment {

    @Override
    public void pay(double amount) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter UPI ID : ");
        String upi = sc.nextLine();

        System.out.println("\nProcessing UPI Payment...");
        System.out.println("UPI ID : " + upi);
        System.out.println("Amount : Rs." + amount);
        System.out.println("Payment Successful.");
    }

}