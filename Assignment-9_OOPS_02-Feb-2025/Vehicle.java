public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 99.99;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Akshat", "Bike");
        vehicle1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(289.0);

        Vehicle vehicle2 = new Vehicle("Reema", "Bike");
        vehicle2.displayVehicleDetails();
    }
}