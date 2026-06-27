public class Bike extends Vehicle {

    public Bike(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 20;
    }
}