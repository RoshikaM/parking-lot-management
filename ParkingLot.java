import java.util.ArrayList;

public class ParkingLot {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void parkVehicle(Vehicle vehicle) {

        vehicles.add(vehicle);

        System.out.println("\nVehicle Parked Successfully.");
    }

    public void showVehicles() {

        if(vehicles.isEmpty()) {

            System.out.println("No Vehicles.");

            return;
        }

        System.out.println("\nParked Vehicles");

        for(Vehicle v : vehicles) {

            System.out.println(v.getVehicleNumber()+" - "+v.getOwnerName());

        }

    }

}