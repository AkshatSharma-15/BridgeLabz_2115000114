class Vehicle {
    private static double registrationFee = 250.0; 
    private final String registrationNumber; 
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' keyword
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Hellen", "Bike", "123456");
        car.displayDetails();

        Vehicle.updateRegistrationFee(800.0);
        System.out.println("Updated Registration Fee: " + registrationFee);
    }
}