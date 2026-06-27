public class ParkingTicket {

    private Vehicle vehicle;
    private int hours;
    private double fee;

    public ParkingTicket(Vehicle vehicle, int hours) {

        this.vehicle = vehicle;
        this.hours = hours;
        this.fee = vehicle.calculateFee(hours);
    }

    public double getFee() {
        return fee;
    }

    public void printTicket() {

        System.out.println("\n------ PARKING TICKET ------");
        System.out.println("Owner : " + vehicle.getOwnerName());
        System.out.println("Vehicle : " + vehicle.getVehicleNumber());
        System.out.println("Hours : " + hours);
        System.out.println("Parking Fee : Rs." + fee);
    }
}