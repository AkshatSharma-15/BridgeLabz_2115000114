import java.util.HashSet;

public class OTPGenerator {

    public static void main(String[] args) {
        
        System.out.println("Generating 10 unique 6-digit OTP numbers...");

        // Array to store the OTP numbers generated
        int[] otpNumbers = new int[10];

        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otpNumbers[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpNumbers[i]);
        }

        // Method to ensure the OTP numbers generated are unique
        boolean areUnique = areOTPsUnique(otpNumbers);
        
        if (areUnique) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("There are duplicate OTPs!");
        }
    }

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if the OTP numbers are unique
    public static boolean areOTPsUnique(int[] otpNumbers) {
        // Use a HashSet to store OTPs and check for uniqueness
        HashSet<Integer> otpSet = new HashSet<>();
        
        for (int otp : otpNumbers) {
            // If the OTP already exists in the set, return false
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        
        // If all OTPs were added to the set without duplicates, return true
        return true;
    }
}
