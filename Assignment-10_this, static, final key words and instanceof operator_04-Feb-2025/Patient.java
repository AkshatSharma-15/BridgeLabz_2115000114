class Patient {
    private static String hospitalName = "City Hospital"; 
    private static int totalPatients = 0; 
    private final String patientID; 
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' keyword
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Total Patients: " + totalPatients);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Raj", 25, "Fever", "P1051");
        p1.displayDetails();
        System.out.println();

        Patient p2 = new Patient("Lakhan", 39, "Cold", "P1201");
        p2.displayDetails();

        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}