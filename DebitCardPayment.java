import java.util.Scanner;

public class DebitCardPayment extends Payment {

    @Override
    public void pay(double amount) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Card Number : ");
        String card = sc.nextLine();

        System.out.print("Enter CVV : ");
        int cvv = sc.nextInt();

        System.out.println("\nProcessing Debit Card Payment...");
        System.out.println("Card Number : **** **** **** " + card.substring(card.length()-4));
        System.out.println("Amount : Rs." + amount);
        System.out.println("Payment Successful.");
    }

}