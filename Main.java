import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingLot lot = new ParkingLot();

        while(true) {

            System.out.println("\n===== PARKING LOT MANAGEMENT =====");
            System.out.println("1. Park Car");
            System.out.println("2. Park Bike");
            System.out.println("3. Show Vehicles");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Owner Name : ");
                    String owner = sc.nextLine();

                    System.out.print("Vehicle Number : ");
                    String number = sc.nextLine();

                    System.out.print("Parking Hours : ");
                    int hours = sc.nextInt();

                    Vehicle car = new Car(number, owner);

                    lot.parkVehicle(car);

                    ParkingTicket ticket = new ParkingTicket(car,hours);

                    ticket.printTicket();

                    paymentMenu(ticket.getFee());

                    break;

                case 2:

                    System.out.print("Owner Name : ");
                    owner = sc.nextLine();

                    System.out.print("Vehicle Number : ");
                    number = sc.nextLine();

                    System.out.print("Parking Hours : ");
                    hours = sc.nextInt();

                    Vehicle bike = new Bike(number, owner);

                    lot.parkVehicle(bike);

                    ParkingTicket ticket2 = new ParkingTicket(bike,hours);

                    ticket2.printTicket();

                    paymentMenu(ticket2.getFee());

                    break;

                case 3:

                    lot.showVehicles();

                    break;

                case 4:

                    System.out.println("Thank You");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }

        }

    }

    public static void paymentMenu(double amount) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect Payment Method");

        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Debit Card");

        System.out.print("Choice : ");

        int payChoice = sc.nextInt();

        Payment payment = null;

        switch(payChoice) {

            case 1:

                payment = new CashPayment();
                break;

            case 2:

                payment = new UpiPayment();
                break;

            case 3:

                payment = new DebitCardPayment();
                break;

            default:

                System.out.println("Invalid Payment Method");
                return;

        }

        payment.pay(amount);

    }

}